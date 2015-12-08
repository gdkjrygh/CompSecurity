// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import com.actionbarsherlock.internal.view.menu.MenuItemImpl;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.actionbarsherlock.view:
//            ActionProvider, Menu, MenuItem, SubMenu

public class MenuInflater
{
    private static class InflatedOnMenuItemClickListener
        implements MenuItem.OnMenuItemClickListener
    {

        private static final Class PARAM_TYPES[] = {
            com/actionbarsherlock/view/MenuItem
        };
        private Method mMethod;
        private Object mRealOwner;

        public boolean onMenuItemClick(MenuItem menuitem)
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

    private class MenuState
    {

        private static final int defaultGroupId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemEnabled = true;
        private static final int defaultItemId = 0;
        private static final int defaultItemOrder = 0;
        private static final boolean defaultItemVisible = true;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        private ActionProvider itemActionProvider;
        private String itemActionProviderClassName;
        private String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private boolean itemEnabled;
        private int itemIconResId;
        private int itemId;
        private String itemListenerMethodName;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private boolean itemVisible;
        private Menu menu;
        final MenuInflater this$0;

        private char getShortcut(String s)
        {
            if (s == null)
            {
                return '\0';
            } else
            {
                return s.charAt(0);
            }
        }

        private Object newInstance(String s, Class aclass[], Object aobj[])
        {
            try
            {
                aclass = ((Class []) (mContext.getClassLoader().loadClass(s).getConstructor(aclass).newInstance(aobj)));
            }
            // Misplaced declaration of an exception variable
            catch (Class aclass[])
            {
                Log.w("MenuInflater", (new StringBuilder("Cannot instantiate class: ")).append(s).toString(), aclass);
                return null;
            }
            return aclass;
        }

        private void setItem(MenuItem menuitem)
        {
            MenuItem menuitem1 = menuitem.setChecked(itemChecked).setVisible(itemVisible).setEnabled(itemEnabled);
            boolean flag1;
            if (itemCheckable >= 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            menuitem1.setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId).setAlphabeticShortcut(itemAlphabeticShortcut).setNumericShortcut(itemNumericShortcut);
            if (itemShowAsAction >= 0)
            {
                menuitem.setShowAsAction(itemShowAsAction);
            }
            if (itemListenerMethodName != null)
            {
                if (mContext.isRestricted())
                {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuitem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(mRealOwner, itemListenerMethodName));
            }
            boolean flag;
            if (itemCheckable >= 2)
            {
                if (menuitem instanceof MenuItemImpl)
                {
                    ((MenuItemImpl)menuitem).setExclusiveCheckable(true);
                } else
                {
                    menu.setGroupCheckable(groupId, true, true);
                }
            }
            flag = false;
            if (itemActionViewClassName != null)
            {
                menuitem.setActionView((View)newInstance(itemActionViewClassName, MenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, mActionViewConstructorArguments));
                flag = true;
            }
            if (itemActionViewLayout > 0)
            {
                if (!flag)
                {
                    menuitem.setActionView(itemActionViewLayout);
                } else
                {
                    Log.w("MenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (itemActionProvider != null)
            {
                menuitem.setActionProvider(itemActionProvider);
            }
        }

        public void addItem()
        {
            itemAdded = true;
            setItem(menu.add(groupId, itemId, itemCategoryOrder, itemTitle));
        }

        public SubMenu addSubMenuItem()
        {
            itemAdded = true;
            SubMenu submenu = menu.addSubMenu(groupId, itemId, itemCategoryOrder, itemTitle);
            setItem(submenu.getItem());
            return submenu;
        }

        public boolean hasAddedItem()
        {
            return itemAdded;
        }

        public void readGroup(AttributeSet attributeset)
        {
            attributeset = mContext.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockMenuGroup);
            groupId = attributeset.getResourceId(1, 0);
            groupCategory = attributeset.getInt(3, 0);
            groupOrder = attributeset.getInt(4, 0);
            groupCheckable = attributeset.getInt(5, 0);
            groupVisible = attributeset.getBoolean(2, true);
            groupEnabled = attributeset.getBoolean(0, true);
            attributeset.recycle();
        }

        public void readItem(AttributeSet attributeset)
        {
            TypedArray typedarray = mContext.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockMenuItem);
            itemId = typedarray.getResourceId(2, 0);
            itemCategoryOrder = 0xffff0000 & typedarray.getInt(5, groupCategory) | 0xffff & typedarray.getInt(6, groupOrder);
            itemTitle = typedarray.getText(7);
            itemTitleCondensed = typedarray.getText(8);
            itemIconResId = typedarray.getResourceId(0, 0);
            itemAlphabeticShortcut = getShortcut(typedarray.getString(9));
            itemNumericShortcut = getShortcut(typedarray.getString(10));
            int i;
            if (typedarray.hasValue(11))
            {
                if (typedarray.getBoolean(11, false))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                itemCheckable = i;
            } else
            {
                itemCheckable = groupCheckable;
            }
            itemChecked = typedarray.getBoolean(3, false);
            itemVisible = typedarray.getBoolean(4, groupVisible);
            itemEnabled = typedarray.getBoolean(1, groupEnabled);
            attributeset = new TypedValue();
            typedarray.getValue(13, attributeset);
            if (((TypedValue) (attributeset)).type == 17)
            {
                i = ((TypedValue) (attributeset)).data;
            } else
            {
                i = -1;
            }
            itemShowAsAction = i;
            itemListenerMethodName = typedarray.getString(12);
            itemActionViewLayout = typedarray.getResourceId(14, 0);
            attributeset = new TypedValue();
            typedarray.getValue(15, attributeset);
            if (((TypedValue) (attributeset)).type == 3)
            {
                attributeset = ((TypedValue) (attributeset)).string.toString();
            } else
            {
                attributeset = null;
            }
            itemActionViewClassName = attributeset;
            attributeset = new TypedValue();
            typedarray.getValue(16, attributeset);
            if (((TypedValue) (attributeset)).type == 3)
            {
                attributeset = ((TypedValue) (attributeset)).string.toString();
            } else
            {
                attributeset = null;
            }
            itemActionProviderClassName = attributeset;
            if (itemActionProviderClassName != null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0 && itemActionViewLayout == 0 && itemActionViewClassName == null)
            {
                itemActionProvider = (ActionProvider)newInstance(itemActionProviderClassName, MenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, mActionProviderConstructorArguments);
            } else
            {
                if (i != 0)
                {
                    Log.w("MenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                itemActionProvider = null;
            }
            typedarray.recycle();
            itemAdded = false;
        }

        public void resetGroup()
        {
            groupId = 0;
            groupCategory = 0;
            groupOrder = 0;
            groupCheckable = 0;
            groupVisible = true;
            groupEnabled = true;
        }


        public MenuState(Menu menu1)
        {
            this$0 = MenuInflater.this;
            super();
            menu = menu1;
            resetGroup();
        }
    }


    private static final Class ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE[] = ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    private static final Class ACTION_VIEW_CONSTRUCTOR_SIGNATURE[] = {
        android/content/Context
    };
    private static final String LOG_TAG = "MenuInflater";
    private static final int NO_ID = 0;
    private static final String XML_GROUP = "group";
    private static final String XML_ITEM = "item";
    private static final String XML_MENU = "menu";
    private final Object mActionProviderConstructorArguments[];
    private final Object mActionViewConstructorArguments[];
    private Context mContext;
    private Object mRealOwner;

    public MenuInflater(Context context)
    {
        mContext = context;
        mRealOwner = context;
        mActionViewConstructorArguments = (new Object[] {
            context
        });
        mActionProviderConstructorArguments = mActionViewConstructorArguments;
    }

    public MenuInflater(Context context, Object obj)
    {
        mContext = context;
        mRealOwner = obj;
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
_L7:
        if (i != 2) goto _L2; else goto _L1
_L1:
        menu = xmlpullparser.getName();
        if (!menu.equals("menu")) goto _L4; else goto _L3
_L3:
        i = xmlpullparser.next();
_L8:
        int j;
        int l;
        j = 0;
        l = i;
_L13:
        if (j != 0)
        {
            return;
        }
          goto _L5
_L4:
        throw new RuntimeException((new StringBuilder("Expecting menu, got ")).append(menu).toString());
_L2:
        j = xmlpullparser.next();
        i = j;
        if (j != 1) goto _L7; else goto _L6
_L6:
        i = j;
          goto _L8
_L5:
        l;
        JVM INSTR tableswitch 1 3: default 144
    //                   1 487
    //                   2 177
    //                   3 302;
           goto _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_302;
_L10:
        break MISSING_BLOCK_LABEL_487;
_L9:
        int k;
        menu = menu1;
        k = j;
        i = ((flag) ? 1 : 0);
_L14:
        l = xmlpullparser.next();
        flag = i;
        j = k;
        menu1 = menu;
          goto _L13
_L11:
        i = ((flag) ? 1 : 0);
        k = j;
        menu = menu1;
        if (!flag)
        {
            menu = xmlpullparser.getName();
            if (menu.equals("group"))
            {
                menustate.readGroup(attributeset);
                i = ((flag) ? 1 : 0);
                k = j;
                menu = menu1;
            } else
            if (menu.equals("item"))
            {
                menustate.readItem(attributeset);
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
            if (!menustate.hasAddedItem())
            {
                if (menustate.itemActionProvider != null && menustate.itemActionProvider.hasSubMenu())
                {
                    menustate.addSubMenuItem();
                    i = ((flag) ? 1 : 0);
                    k = j;
                    menu = menu1;
                } else
                {
                    menustate.addItem();
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
        throw new RuntimeException("Unexpected end of document");
          goto _L8
    }

    public void inflate(int i, Menu menu)
    {
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
        }
        return;
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







}
