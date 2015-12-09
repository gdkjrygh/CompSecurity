// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuItemWrapperICS;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class SupportMenuInflater extends MenuInflater
{
    private static final class InflatedOnMenuItemClickListener
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private static final Class PARAM_TYPES[] = {
            android/view/MenuItem
        };
        private Method mMethod;
        private Object mRealOwner;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            try
            {
                if (mMethod.getReturnType() == Boolean.TYPE)
                {
                    return ((Boolean)mMethod.invoke(mRealOwner, new Object[] {
                        menuitem
                    })).booleanValue();
                }
                mMethod.invoke(mRealOwner, new Object[] {
                    menuitem
                });
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw new RuntimeException(menuitem);
            }
            return true;
        }


        public InflatedOnMenuItemClickListener(Object obj, String s)
        {
            mRealOwner = obj;
            Class class1 = obj.getClass();
            try
            {
                mMethod = class1.getMethod(s, PARAM_TYPES);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                s = new InflateException((new StringBuilder("Couldn't resolve menu item onClick handler ")).append(s).append(" in class ").append(class1.getName()).toString());
            }
            s.initCause(((Throwable) (obj)));
            throw s;
        }
    }

    private final class MenuState
    {

        int groupCategory;
        int groupCheckable;
        boolean groupEnabled;
        int groupId;
        int groupOrder;
        boolean groupVisible;
        ActionProvider itemActionProvider;
        String itemActionProviderClassName;
        String itemActionViewClassName;
        int itemActionViewLayout;
        boolean itemAdded;
        char itemAlphabeticShortcut;
        int itemCategoryOrder;
        int itemCheckable;
        boolean itemChecked;
        boolean itemEnabled;
        int itemIconResId;
        int itemId;
        String itemListenerMethodName;
        char itemNumericShortcut;
        int itemShowAsAction;
        CharSequence itemTitle;
        CharSequence itemTitleCondensed;
        boolean itemVisible;
        Menu menu;
        final SupportMenuInflater this$0;

        static char getShortcut(String s)
        {
            if (s == null)
            {
                return '\0';
            } else
            {
                return s.charAt(0);
            }
        }

        public final SubMenu addSubMenuItem()
        {
            itemAdded = true;
            SubMenu submenu = menu.addSubMenu(groupId, itemId, itemCategoryOrder, itemTitle);
            setItem(submenu.getItem());
            return submenu;
        }

        final Object newInstance(String s, Class aclass[], Object aobj[])
        {
            try
            {
                aclass = ((Class []) (mContext.getClassLoader().loadClass(s).getConstructor(aclass).newInstance(aobj)));
            }
            // Misplaced declaration of an exception variable
            catch (Class aclass[])
            {
                Log.w("SupportMenuInflater", (new StringBuilder("Cannot instantiate class: ")).append(s).toString(), aclass);
                return null;
            }
            return aclass;
        }

        public final void resetGroup()
        {
            groupId = 0;
            groupCategory = 0;
            groupOrder = 0;
            groupCheckable = 0;
            groupVisible = true;
            groupEnabled = true;
        }

        final void setItem(MenuItem menuitem)
        {
            boolean flag1 = false;
            MenuItem menuitem1 = menuitem.setChecked(itemChecked).setVisible(itemVisible).setEnabled(itemEnabled);
            if (itemCheckable > 0)
            {
                flag1 = true;
            }
            menuitem1.setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId).setAlphabeticShortcut(itemAlphabeticShortcut).setNumericShortcut(itemNumericShortcut);
            if (itemShowAsAction >= 0)
            {
                MenuItemCompat.setShowAsAction(menuitem, itemShowAsAction);
            }
            if (itemListenerMethodName != null)
            {
                if (mContext.isRestricted())
                {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuitem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(SupportMenuInflater.access$400(SupportMenuInflater.this), itemListenerMethodName));
            }
            boolean flag;
            if (itemCheckable >= 2)
            {
                if (menuitem instanceof MenuItemImpl)
                {
                    ((MenuItemImpl)menuitem).setExclusiveCheckable(true);
                } else
                if (menuitem instanceof MenuItemWrapperICS)
                {
                    MenuItemWrapperICS menuitemwrapperics = (MenuItemWrapperICS)menuitem;
                    try
                    {
                        if (menuitemwrapperics.mSetExclusiveCheckableMethod == null)
                        {
                            menuitemwrapperics.mSetExclusiveCheckableMethod = ((SupportMenuItem)menuitemwrapperics.mWrappedObject).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                                Boolean.TYPE
                            });
                        }
                        menuitemwrapperics.mSetExclusiveCheckableMethod.invoke(menuitemwrapperics.mWrappedObject, new Object[] {
                            Boolean.valueOf(true)
                        });
                    }
                    catch (Exception exception)
                    {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
                    }
                }
            }
            flag = false;
            if (itemActionViewClassName != null)
            {
                MenuItemCompat.setActionView(menuitem, (View)newInstance(itemActionViewClassName, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, mActionViewConstructorArguments));
                flag = true;
            }
            if (itemActionViewLayout > 0)
            {
                if (!flag)
                {
                    MenuItemCompat.setActionView(menuitem, itemActionViewLayout);
                } else
                {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (itemActionProvider != null)
            {
                MenuItemCompat.setActionProvider(menuitem, itemActionProvider);
            }
        }

        public MenuState(Menu menu1)
        {
            this$0 = SupportMenuInflater.this;
            super();
            menu = menu1;
            resetGroup();
        }
    }


    private static final Class ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE[];
    private static final Class ACTION_VIEW_CONSTRUCTOR_SIGNATURE[];
    private final Object mActionProviderConstructorArguments[];
    private final Object mActionViewConstructorArguments[];
    private Context mContext;
    private Object mRealOwner;

    public SupportMenuInflater(Context context)
    {
        super(context);
        mContext = context;
        mActionViewConstructorArguments = (new Object[] {
            context
        });
        mActionProviderConstructorArguments = mActionViewConstructorArguments;
    }

    private void parseMenu(XmlPullParser xmlpullparser, AttributeSet attributeset, Menu menu)
        throws XmlPullParserException, IOException
    {
        Menu menu1;
        MenuState menustate;
        int i;
        boolean flag;
        menustate = new MenuState(menu);
        i = xmlpullparser.getEventType();
        flag = false;
        menu1 = null;
_L12:
        if (i != 2) goto _L2; else goto _L1
_L1:
        menu = xmlpullparser.getName();
        if (!menu.equals("menu")) goto _L4; else goto _L3
_L3:
        i = xmlpullparser.next();
_L13:
        int j;
        int l;
        j = 0;
        l = i;
_L10:
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_975;
        }
        l;
        JVM INSTR tableswitch 1 3: default 96
    //                   1 964
    //                   2 178
    //                   3 743;
           goto _L5 _L6 _L7 _L8
_L7:
        break; /* Loop/switch isn't completed */
_L5:
        int k;
        menu = menu1;
        k = j;
        i = ((flag) ? 1 : 0);
_L14:
        l = xmlpullparser.next();
        flag = i;
        j = k;
        menu1 = menu;
        if (true) goto _L10; else goto _L9
_L4:
        throw new RuntimeException((new StringBuilder("Expecting menu, got ")).append(menu).toString());
_L2:
        j = xmlpullparser.next();
        i = j;
        if (j != 1) goto _L12; else goto _L11
_L11:
        i = j;
          goto _L13
_L9:
        i = ((flag) ? 1 : 0);
        k = j;
        menu = menu1;
        if (!flag)
        {
            menu = xmlpullparser.getName();
            if (menu.equals("group"))
            {
                menu = menustate._fld0.mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.MenuGroup);
                menustate.groupId = menu.getResourceId(1, 0);
                menustate.groupCategory = menu.getInt(3, 0);
                menustate.groupOrder = menu.getInt(4, 0);
                menustate.groupCheckable = menu.getInt(5, 0);
                menustate.groupVisible = menu.getBoolean(2, true);
                menustate.groupEnabled = menu.getBoolean(0, true);
                menu.recycle();
                i = ((flag) ? 1 : 0);
                k = j;
                menu = menu1;
            } else
            if (menu.equals("item"))
            {
                menu = menustate._fld0.mContext.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.MenuItem);
                menustate.itemId = menu.getResourceId(2, 0);
                menustate.itemCategoryOrder = menu.getInt(5, menustate.groupCategory) & 0xffff0000 | menu.getInt(6, menustate.groupOrder) & 0xffff;
                menustate.itemTitle = menu.getText(7);
                menustate.itemTitleCondensed = menu.getText(8);
                menustate.itemIconResId = menu.getResourceId(0, 0);
                menustate.itemAlphabeticShortcut = MenuState.getShortcut(menu.getString(9));
                menustate.itemNumericShortcut = MenuState.getShortcut(menu.getString(10));
                if (menu.hasValue(11))
                {
                    if (menu.getBoolean(11, false))
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    menustate.itemCheckable = i;
                } else
                {
                    menustate.itemCheckable = menustate.groupCheckable;
                }
                menustate.itemChecked = menu.getBoolean(3, false);
                menustate.itemVisible = menu.getBoolean(4, menustate.groupVisible);
                menustate.itemEnabled = menu.getBoolean(1, menustate.groupEnabled);
                menustate.itemShowAsAction = menu.getInt(13, -1);
                menustate.itemListenerMethodName = menu.getString(12);
                menustate.itemActionViewLayout = menu.getResourceId(14, 0);
                menustate.itemActionViewClassName = menu.getString(15);
                menustate.itemActionProviderClassName = menu.getString(16);
                if (menustate.itemActionProviderClassName != null)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i != 0 && menustate.itemActionViewLayout == 0 && menustate.itemActionViewClassName == null)
                {
                    menustate.itemActionProvider = (ActionProvider)menustate.newInstance(menustate.itemActionProviderClassName, ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, menustate._fld0.mActionProviderConstructorArguments);
                } else
                {
                    if (i != 0)
                    {
                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                    }
                    menustate.itemActionProvider = null;
                }
                menu.recycle();
                menustate.itemAdded = false;
                i = ((flag) ? 1 : 0);
                k = j;
                menu = menu1;
            } else
            if (menu.equals("menu"))
            {
                parseMenu(xmlpullparser, attributeset, ((Menu) (menustate.addSubMenuItem())));
                i = ((flag) ? 1 : 0);
                k = j;
                menu = menu1;
            } else
            {
                i = 1;
                k = j;
            }
        }
          goto _L14
_L8:
        String s = xmlpullparser.getName();
        if (flag && s.equals(menu1))
        {
            i = 0;
            menu = null;
            k = j;
        } else
        if (s.equals("group"))
        {
            menustate.resetGroup();
            i = ((flag) ? 1 : 0);
            k = j;
            menu = menu1;
        } else
        if (s.equals("item"))
        {
            i = ((flag) ? 1 : 0);
            k = j;
            menu = menu1;
            if (!menustate.itemAdded)
            {
                if (menustate.itemActionProvider != null && menustate.itemActionProvider.hasSubMenu())
                {
                    menustate.addSubMenuItem();
                    i = ((flag) ? 1 : 0);
                    k = j;
                    menu = menu1;
                } else
                {
                    menustate.itemAdded = true;
                    menustate.setItem(menustate.menu.add(menustate.groupId, menustate.itemId, menustate.itemCategoryOrder, menustate.itemTitle));
                    i = ((flag) ? 1 : 0);
                    k = j;
                    menu = menu1;
                }
            }
        } else
        {
            i = ((flag) ? 1 : 0);
            k = j;
            menu = menu1;
            if (s.equals("menu"))
            {
                k = 1;
                i = ((flag) ? 1 : 0);
                menu = menu1;
            }
        }
          goto _L14
_L6:
        throw new RuntimeException("Unexpected end of document");
          goto _L13
    }

    public final void inflate(int i, Menu menu)
    {
        if (menu instanceof SupportMenu) goto _L2; else goto _L1
_L1:
        super.inflate(i, menu);
_L4:
        return;
_L2:
        XmlResourceParser xmlresourceparser;
        XmlResourceParser xmlresourceparser1;
        XmlResourceParser xmlresourceparser2;
        xmlresourceparser = null;
        xmlresourceparser2 = null;
        xmlresourceparser1 = null;
        XmlResourceParser xmlresourceparser3 = mContext.getResources().getLayout(i);
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        parseMenu(xmlresourceparser3, Xml.asAttributeSet(xmlresourceparser3), menu);
        if (xmlresourceparser3 != null)
        {
            xmlresourceparser3.close();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        menu;
        xmlresourceparser = xmlresourceparser1;
        throw new InflateException("Error inflating menu XML", menu);
        menu;
        if (xmlresourceparser != null)
        {
            xmlresourceparser.close();
        }
        throw menu;
        menu;
        xmlresourceparser = xmlresourceparser2;
        throw new InflateException("Error inflating menu XML", menu);
    }

    static 
    {
        Class aclass[] = new Class[1];
        aclass[0] = android/content/Context;
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = aclass;
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = aclass;
    }



/*
    static Object access$400(SupportMenuInflater supportmenuinflater)
    {
        if (supportmenuinflater.mRealOwner == null)
        {
            Context context;
            for (context = supportmenuinflater.mContext; !(context instanceof Activity) && (context instanceof ContextWrapper); context = ((ContextWrapper)context).getBaseContext()) { }
            supportmenuinflater.mRealOwner = context;
        }
        return supportmenuinflater.mRealOwner;
    }

*/


}
