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
import android.support.v4.b.a.a;
import android.support.v4.view.n;
import android.support.v7.a.l;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v7.internal.view:
//            h

public final class f extends MenuInflater
{

    private static final Class a[];
    private static final Class b[];
    private final Object c[];
    private final Object d[];
    private Context e;
    private Object f;

    public f(Context context)
    {
        super(context);
        e = context;
        c = (new Object[] {
            context
        });
        d = c;
    }

    static Context a(f f1)
    {
        return f1.e;
    }

    private void a(XmlPullParser xmlpullparser, AttributeSet attributeset, Menu menu)
    {
        h h1;
        int i;
        boolean flag;
        h1 = new h(this, menu);
        i = xmlpullparser.getEventType();
        flag = false;
        menu = null;
_L8:
        if (i != 2) goto _L2; else goto _L1
_L1:
        String s = xmlpullparser.getName();
        if (!s.equals("menu")) goto _L4; else goto _L3
_L3:
        int j = xmlpullparser.next();
_L7:
        i = 0;
_L6:
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_889;
        }
        switch (j)
        {
        default:
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_878;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break;
        }
        break MISSING_BLOCK_LABEL_724;
_L9:
        j = xmlpullparser.next();
        if (true) goto _L6; else goto _L5
_L4:
        throw new RuntimeException((new StringBuilder("Expecting menu, got ")).append(s).toString());
_L2:
        j = xmlpullparser.next();
        i = j;
        if (j != 1) goto _L8; else goto _L7
_L5:
        if (!flag)
        {
            Object obj = xmlpullparser.getName();
            if (((String) (obj)).equals("group"))
            {
                obj = h1.z.e.obtainStyledAttributes(attributeset, l.MenuGroup);
                h1.b = ((TypedArray) (obj)).getResourceId(l.MenuGroup_android_id, 0);
                h1.c = ((TypedArray) (obj)).getInt(l.MenuGroup_android_menuCategory, 0);
                h1.d = ((TypedArray) (obj)).getInt(l.MenuGroup_android_orderInCategory, 0);
                h1.e = ((TypedArray) (obj)).getInt(l.MenuGroup_android_checkableBehavior, 0);
                h1.f = ((TypedArray) (obj)).getBoolean(l.MenuGroup_android_visible, true);
                h1.g = ((TypedArray) (obj)).getBoolean(l.MenuGroup_android_enabled, true);
                ((TypedArray) (obj)).recycle();
            } else
            if (((String) (obj)).equals("item"))
            {
                obj = h1.z.e.obtainStyledAttributes(attributeset, l.MenuItem);
                h1.i = ((TypedArray) (obj)).getResourceId(l.MenuItem_android_id, 0);
                h1.j = ((TypedArray) (obj)).getInt(l.MenuItem_android_menuCategory, h1.c) & 0xffff0000 | ((TypedArray) (obj)).getInt(l.MenuItem_android_orderInCategory, h1.d) & 0xffff;
                h1.k = ((TypedArray) (obj)).getText(l.MenuItem_android_title);
                h1.l = ((TypedArray) (obj)).getText(l.MenuItem_android_titleCondensed);
                h1.m = ((TypedArray) (obj)).getResourceId(l.MenuItem_android_icon, 0);
                h1.n = android.support.v7.internal.view.h.a(((TypedArray) (obj)).getString(l.MenuItem_android_alphabeticShortcut));
                h1.o = android.support.v7.internal.view.h.a(((TypedArray) (obj)).getString(l.MenuItem_android_numericShortcut));
                int k;
                if (((TypedArray) (obj)).hasValue(l.MenuItem_android_checkable))
                {
                    if (((TypedArray) (obj)).getBoolean(l.MenuItem_android_checkable, false))
                    {
                        k = 1;
                    } else
                    {
                        k = 0;
                    }
                    h1.p = k;
                } else
                {
                    h1.p = h1.e;
                }
                h1.q = ((TypedArray) (obj)).getBoolean(l.MenuItem_android_checked, false);
                h1.r = ((TypedArray) (obj)).getBoolean(l.MenuItem_android_visible, h1.f);
                h1.s = ((TypedArray) (obj)).getBoolean(l.MenuItem_android_enabled, h1.g);
                h1.t = ((TypedArray) (obj)).getInt(l.MenuItem_showAsAction, -1);
                h1.x = ((TypedArray) (obj)).getString(l.MenuItem_android_onClick);
                h1.u = ((TypedArray) (obj)).getResourceId(l.MenuItem_actionLayout, 0);
                h1.v = ((TypedArray) (obj)).getString(l.MenuItem_actionViewClass);
                h1.w = ((TypedArray) (obj)).getString(l.MenuItem_actionProviderClass);
                if (h1.w != null)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (k != 0 && h1.u == 0 && h1.v == null)
                {
                    h1.y = (n)h1.a(h1.w, b, h1.z.d);
                } else
                {
                    h1.y = null;
                }
                ((TypedArray) (obj)).recycle();
                h1.h = false;
            } else
            if (((String) (obj)).equals("menu"))
            {
                a(xmlpullparser, attributeset, ((Menu) (h1.b())));
            } else
            {
                flag = true;
                menu = ((Menu) (obj));
            }
        }
          goto _L9
        String s1 = xmlpullparser.getName();
        if (flag && s1.equals(menu))
        {
            flag = false;
            menu = null;
        } else
        if (s1.equals("group"))
        {
            h1.a();
        } else
        if (s1.equals("item"))
        {
            if (!h1.h)
            {
                if (h1.y != null && h1.y.e())
                {
                    h1.b();
                } else
                {
                    h1.h = true;
                    h1.a(h1.a.add(h1.b, h1.i, h1.j, h1.k));
                }
            }
        } else
        if (s1.equals("menu"))
        {
            i = 1;
        }
          goto _L9
        throw new RuntimeException("Unexpected end of document");
    }

    static Class[] a()
    {
        return a;
    }

    static Object b(f f1)
    {
        if (f1.f == null)
        {
            Context context;
            for (context = f1.e; !(context instanceof Activity) && (context instanceof ContextWrapper); context = ((ContextWrapper)context).getBaseContext()) { }
            f1.f = context;
        }
        return f1.f;
    }

    static Object[] c(f f1)
    {
        return f1.c;
    }

    public final void inflate(int i, Menu menu)
    {
        if (menu instanceof a) goto _L2; else goto _L1
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
