// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.config.bean;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.fitbit.synclair.config.bean:
//            d

public class DeviceScreenBean
    implements Cloneable
{
    public static final class ContentMode extends Enum
    {

        public static final ContentMode a;
        public static final ContentMode b;
        public static final ContentMode c;
        public static final ContentMode d;
        private static final ContentMode e[];

        public static ContentMode valueOf(String s)
        {
            return (ContentMode)Enum.valueOf(com/fitbit/synclair/config/bean/DeviceScreenBean$ContentMode, s);
        }

        public static ContentMode[] values()
        {
            return (ContentMode[])e.clone();
        }

        static 
        {
            a = new ContentMode("NONE", 0);
            b = new ContentMode("FILL", 1);
            c = new ContentMode("FIT", 2);
            d = new ContentMode("FIT_WITH_STATS", 3);
            e = (new ContentMode[] {
                a, b, c, d
            });
        }

        private ContentMode(String s, int i1)
        {
            super(s, i1);
        }
    }


    private String a;
    private String b;
    private String c;
    private d d;
    private ContentMode e;
    private d f;
    private boolean g;
    private String h;
    private String i;
    private String j;
    private List k;
    private Map l;

    public DeviceScreenBean()
    {
        g = true;
    }

    public String a()
    {
        return a;
    }

    public void a(ContentMode contentmode)
    {
        e = contentmode;
    }

    public void a(d d1)
    {
        d = d1;
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(List list)
    {
        k = list;
    }

    public void a(Map map)
    {
        l = map;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public String b()
    {
        return b;
    }

    public void b(d d1)
    {
        f = d1;
    }

    public void b(String s)
    {
        b = s;
    }

    public String c()
    {
        return c;
    }

    public void c(String s)
    {
        c = s;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return n();
    }

    public d d()
    {
        return d;
    }

    public void d(String s)
    {
        h = s;
    }

    public ContentMode e()
    {
        return e;
    }

    public void e(String s)
    {
        j = s;
    }

    public d f()
    {
        return f;
    }

    public void f(String s)
    {
        i = s;
    }

    public boolean g()
    {
        return g;
    }

    public List h()
    {
        return k;
    }

    public String i()
    {
        return h;
    }

    public String j()
    {
        return j;
    }

    public Map k()
    {
        return l;
    }

    public boolean l()
    {
        boolean flag = false;
        if (f != null)
        {
            flag = true;
        }
        return flag;
    }

    public String m()
    {
        return i;
    }

    public DeviceScreenBean n()
    {
        DeviceScreenBean devicescreenbean;
        try
        {
            devicescreenbean = (DeviceScreenBean)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new RuntimeException(clonenotsupportedexception);
        }
        return devicescreenbean;
    }
}
