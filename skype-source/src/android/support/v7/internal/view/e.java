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
import android.support.v4.internal.view.a;
import android.support.v4.view.d;
import android.support.v4.view.k;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.i;
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

public final class e extends MenuInflater
{
    private static final class a
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private static final Class a[] = {
            android/view/MenuItem
        };
        private Object b;
        private Method c;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            try
            {
                if (c.getReturnType() == Boolean.TYPE)
                {
                    return ((Boolean)c.invoke(b, new Object[] {
                        menuitem
                    })).booleanValue();
                }
                c.invoke(b, new Object[] {
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


        public a(Object obj, String s)
        {
            b = obj;
            Class class1 = obj.getClass();
            try
            {
                c = class1.getMethod(s, a);
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

    private final class b
    {

        final e a;
        private Menu b;
        private int c;
        private int d;
        private int e;
        private int f;
        private boolean g;
        private boolean h;
        private boolean i;
        private int j;
        private int k;
        private CharSequence l;
        private CharSequence m;
        private int n;
        private char o;
        private char p;
        private int q;
        private boolean r;
        private boolean s;
        private boolean t;
        private int u;
        private int v;
        private String w;
        private String x;
        private String y;
        private d z;

        private static char a(String s1)
        {
            if (s1 == null)
            {
                return '\0';
            } else
            {
                return s1.charAt(0);
            }
        }

        static d a(b b1)
        {
            return b1.z;
        }

        private Object a(String s1, Class aclass[], Object aobj[])
        {
            try
            {
                aclass = android.support.v7.internal.view.e.a(a).getClassLoader().loadClass(s1).getConstructor(aclass);
                aclass.setAccessible(true);
                aclass = ((Class []) (aclass.newInstance(aobj)));
            }
            // Misplaced declaration of an exception variable
            catch (Class aclass[])
            {
                Log.w("SupportMenuInflater", (new StringBuilder("Cannot instantiate class: ")).append(s1).toString(), aclass);
                return null;
            }
            return aclass;
        }

        private void a(MenuItem menuitem)
        {
            MenuItem menuitem1 = menuitem.setChecked(r).setVisible(s).setEnabled(t);
            boolean flag1;
            if (q > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            menuitem1.setCheckable(flag1).setTitleCondensed(m).setIcon(n).setAlphabeticShortcut(o).setNumericShortcut(p);
            if (u >= 0)
            {
                android.support.v4.view.k.a(menuitem, u);
            }
            if (y != null)
            {
                if (android.support.v7.internal.view.e.a(a).isRestricted())
                {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuitem.setOnMenuItemClickListener(new a(e.c(a), y));
            }
            boolean flag;
            if (q >= 2)
            {
                if (menuitem instanceof h)
                {
                    ((h)menuitem).a(true);
                } else
                if (menuitem instanceof i)
                {
                    ((i)menuitem).b();
                }
            }
            flag = false;
            if (w != null)
            {
                android.support.v4.view.k.a(menuitem, (View)a(w, e.b(), android.support.v7.internal.view.e.d(a)));
                flag = true;
            }
            if (v > 0)
            {
                if (!flag)
                {
                    android.support.v4.view.k.b(menuitem, v);
                } else
                {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (z != null)
            {
                android.support.v4.view.k.a(menuitem, z);
            }
        }

        public final void a()
        {
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            g = true;
            h = true;
        }

        public final void a(AttributeSet attributeset)
        {
            attributeset = android.support.v7.internal.view.e.a(a).obtainStyledAttributes(attributeset, android.support.v7.appcompat.a.k.MenuGroup);
            c = attributeset.getResourceId(android.support.v7.appcompat.a.k.MenuGroup_android_id, 0);
            d = attributeset.getInt(android.support.v7.appcompat.a.k.MenuGroup_android_menuCategory, 0);
            e = attributeset.getInt(android.support.v7.appcompat.a.k.MenuGroup_android_orderInCategory, 0);
            f = attributeset.getInt(android.support.v7.appcompat.a.k.MenuGroup_android_checkableBehavior, 0);
            g = attributeset.getBoolean(android.support.v7.appcompat.a.k.MenuGroup_android_visible, true);
            h = attributeset.getBoolean(android.support.v7.appcompat.a.k.MenuGroup_android_enabled, true);
            attributeset.recycle();
        }

        public final void b()
        {
            i = true;
            a(b.add(c, j, k, l));
        }

        public final void b(AttributeSet attributeset)
        {
            attributeset = android.support.v7.internal.view.e.a(a).obtainStyledAttributes(attributeset, android.support.v7.appcompat.a.k.MenuItem);
            j = attributeset.getResourceId(android.support.v7.appcompat.a.k.MenuItem_android_id, 0);
            k = 0xffff0000 & attributeset.getInt(android.support.v7.appcompat.a.k.MenuItem_android_menuCategory, d) | 0xffff & attributeset.getInt(android.support.v7.appcompat.a.k.MenuItem_android_orderInCategory, e);
            l = attributeset.getText(android.support.v7.appcompat.a.k.MenuItem_android_title);
            m = attributeset.getText(android.support.v7.appcompat.a.k.MenuItem_android_titleCondensed);
            n = attributeset.getResourceId(android.support.v7.appcompat.a.k.MenuItem_android_icon, 0);
            o = a(attributeset.getString(android.support.v7.appcompat.a.k.MenuItem_android_alphabeticShortcut));
            p = a(attributeset.getString(android.support.v7.appcompat.a.k.MenuItem_android_numericShortcut));
            int i1;
            if (attributeset.hasValue(android.support.v7.appcompat.a.k.MenuItem_android_checkable))
            {
                if (attributeset.getBoolean(android.support.v7.appcompat.a.k.MenuItem_android_checkable, false))
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                q = i1;
            } else
            {
                q = f;
            }
            r = attributeset.getBoolean(android.support.v7.appcompat.a.k.MenuItem_android_checked, false);
            s = attributeset.getBoolean(android.support.v7.appcompat.a.k.MenuItem_android_visible, g);
            t = attributeset.getBoolean(android.support.v7.appcompat.a.k.MenuItem_android_enabled, h);
            u = attributeset.getInt(android.support.v7.appcompat.a.k.MenuItem_showAsAction, -1);
            y = attributeset.getString(android.support.v7.appcompat.a.k.MenuItem_android_onClick);
            v = attributeset.getResourceId(android.support.v7.appcompat.a.k.MenuItem_actionLayout, 0);
            w = attributeset.getString(android.support.v7.appcompat.a.k.MenuItem_actionViewClass);
            x = attributeset.getString(android.support.v7.appcompat.a.k.MenuItem_actionProviderClass);
            if (x != null)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0 && v == 0 && w == null)
            {
                z = (d)a(x, android.support.v7.internal.view.e.a(), e.b(a));
            } else
            {
                if (i1 != 0)
                {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                z = null;
            }
            attributeset.recycle();
            i = false;
        }

        public final SubMenu c()
        {
            i = true;
            SubMenu submenu = b.addSubMenu(c, j, k, l);
            a(submenu.getItem());
            return submenu;
        }

        public final boolean d()
        {
            return i;
        }

        public b(Menu menu)
        {
            a = e.this;
            super();
            b = menu;
            a();
        }
    }


    private static final Class a[];
    private static final Class b[];
    private final Object c[];
    private final Object d[];
    private Context e;
    private Object f;

    public e(Context context)
    {
        super(context);
        e = context;
        c = (new Object[] {
            context
        });
        d = c;
    }

    static Context a(e e1)
    {
        return e1.e;
    }

    private void a(XmlPullParser xmlpullparser, AttributeSet attributeset, Menu menu)
        throws XmlPullParserException, IOException
    {
        Menu menu1;
        b b1;
        int i;
        boolean flag;
        b1 = new b(menu);
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
            break MISSING_BLOCK_LABEL_498;
        }
        l;
        JVM INSTR tableswitch 1 3: default 96
    //                   1 488
    //                   2 178
    //                   3 303;
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
                b1.a(attributeset);
                i = ((flag) ? 1 : 0);
                k = j;
                menu = menu1;
            } else
            if (menu.equals("item"))
            {
                b1.b(attributeset);
                i = ((flag) ? 1 : 0);
                k = j;
                menu = menu1;
            } else
            if (menu.equals("menu"))
            {
                a(xmlpullparser, attributeset, ((Menu) (b1.c())));
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
            b1.a();
            i = ((flag) ? 1 : 0);
            k = j;
            menu = menu1;
        } else
        if (s.equals("item"))
        {
            i = ((flag) ? 1 : 0);
            k = j;
            menu = menu1;
            if (!b1.d())
            {
                if (android.support.v7.internal.view.b.a(b1) != null && android.support.v7.internal.view.b.a(b1).e())
                {
                    b1.c();
                    i = ((flag) ? 1 : 0);
                    k = j;
                    menu = menu1;
                } else
                {
                    b1.b();
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

    static Class[] a()
    {
        return b;
    }

    static Class[] b()
    {
        return a;
    }

    static Object[] b(e e1)
    {
        return e1.d;
    }

    static Object c(e e1)
    {
        if (e1.f == null)
        {
            Context context;
            for (context = e1.e; !(context instanceof Activity) && (context instanceof ContextWrapper); context = ((ContextWrapper)context).getBaseContext()) { }
            e1.f = context;
        }
        return e1.f;
    }

    static Object[] d(e e1)
    {
        return e1.c;
    }

    public final void inflate(int i, Menu menu)
    {
        if (menu instanceof android.support.v4.internal.view.a) goto _L2; else goto _L1
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
        XmlResourceParser xmlresourceparser3 = e.getResources().getLayout(i);
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        a(xmlresourceparser3, Xml.asAttributeSet(xmlresourceparser3), menu);
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
        a = aclass;
        b = aclass;
    }
}
