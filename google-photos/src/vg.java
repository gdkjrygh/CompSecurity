// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class vg extends MenuInflater
{

    private static final Class a[];
    private static final Class b[];
    private final Object c[];
    private final Object d[];
    private Context e;
    private Object f;

    public vg(Context context)
    {
        super(context);
        e = context;
        c = (new Object[] {
            context
        });
        d = c;
    }

    static Context a(vg vg1)
    {
        return vg1.e;
    }

    private Object a(Object obj)
    {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) 
        {
            obj = ((ContextWrapper)obj).getBaseContext();
        }
        return obj;
    }

    private void a(XmlPullParser xmlpullparser, AttributeSet attributeset, Menu menu)
    {
        vi vi1;
        int i;
        boolean flag;
        vi1 = new vi(this, menu);
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
            break MISSING_BLOCK_LABEL_904;
        }
        switch (j)
        {
        default:
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_893;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break;
        }
        break MISSING_BLOCK_LABEL_739;
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
                obj = vi1.z.e.obtainStyledAttributes(attributeset, uh.aq);
                vi1.b = ((TypedArray) (obj)).getResourceId(uh.at, 0);
                vi1.c = ((TypedArray) (obj)).getInt(uh.au, 0);
                vi1.d = ((TypedArray) (obj)).getInt(uh.av, 0);
                vi1.e = ((TypedArray) (obj)).getInt(uh.ar, 0);
                vi1.f = ((TypedArray) (obj)).getBoolean(uh.aw, true);
                vi1.g = ((TypedArray) (obj)).getBoolean(uh.as, true);
                ((TypedArray) (obj)).recycle();
            } else
            if (((String) (obj)).equals("item"))
            {
                obj = vi1.z.e.obtainStyledAttributes(attributeset, uh.ax);
                vi1.i = ((TypedArray) (obj)).getResourceId(uh.aG, 0);
                vi1.j = ((TypedArray) (obj)).getInt(uh.aH, vi1.c) & 0xffff0000 | ((TypedArray) (obj)).getInt(uh.aK, vi1.d) & 0xffff;
                vi1.k = ((TypedArray) (obj)).getText(uh.aL);
                vi1.l = ((TypedArray) (obj)).getText(uh.aM);
                vi1.m = ((TypedArray) (obj)).getResourceId(uh.aF, 0);
                vi1.n = vi.a(((TypedArray) (obj)).getString(uh.aB));
                vi1.o = vi.a(((TypedArray) (obj)).getString(uh.aI));
                int k;
                if (((TypedArray) (obj)).hasValue(uh.aC))
                {
                    if (((TypedArray) (obj)).getBoolean(uh.aC, false))
                    {
                        k = 1;
                    } else
                    {
                        k = 0;
                    }
                    vi1.p = k;
                } else
                {
                    vi1.p = vi1.e;
                }
                vi1.q = ((TypedArray) (obj)).getBoolean(uh.aD, false);
                vi1.r = ((TypedArray) (obj)).getBoolean(uh.aN, vi1.f);
                vi1.s = ((TypedArray) (obj)).getBoolean(uh.aE, vi1.g);
                vi1.t = ((TypedArray) (obj)).getInt(uh.aO, -1);
                vi1.x = ((TypedArray) (obj)).getString(uh.aJ);
                vi1.u = ((TypedArray) (obj)).getResourceId(uh.ay, 0);
                vi1.v = ((TypedArray) (obj)).getString(uh.aA);
                vi1.w = ((TypedArray) (obj)).getString(uh.az);
                if (vi1.w != null)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (k != 0 && vi1.u == 0 && vi1.v == null)
                {
                    vi1.y = (km)vi1.a(vi1.w, b, vi1.z.d);
                } else
                {
                    if (k != 0)
                    {
                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                    }
                    vi1.y = null;
                }
                ((TypedArray) (obj)).recycle();
                vi1.h = false;
            } else
            if (((String) (obj)).equals("menu"))
            {
                a(xmlpullparser, attributeset, ((Menu) (vi1.b())));
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
            vi1.a();
        } else
        if (s1.equals("item"))
        {
            if (!vi1.h)
            {
                if (vi1.y != null && vi1.y.f())
                {
                    vi1.b();
                } else
                {
                    vi1.h = true;
                    vi1.a(vi1.a.add(vi1.b, vi1.i, vi1.j, vi1.k));
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

    static Object b(vg vg1)
    {
        if (vg1.f == null)
        {
            vg1.f = vg1.a(vg1.e);
        }
        return vg1.f;
    }

    static Object[] c(vg vg1)
    {
        return vg1.c;
    }

    public final void inflate(int i, Menu menu)
    {
        if (menu instanceof fq) goto _L2; else goto _L1
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
