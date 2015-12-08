// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class akg
{

    public String a;
    public String b;
    public ajx c;
    public Context d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    private String i;
    private Boolean j;

    public akg(Context context, ajx ajx1)
    {
        f = false;
        g = false;
        h = false;
        d = context;
        c = ajx1;
    }

    private static String a(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (s != null)
        {
            s1 = obj;
            if (s.length() > 0)
            {
                try
                {
                    s1 = ajy.b(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return null;
                }
            }
        }
        return s1;
    }

    private void a(String s, boolean flag)
    {
        boolean flag2 = false;
        if (s != null)
        {
            f = flag;
            String s1 = c.b("md5RawCrossPublisherId");
            String s2;
            String s3;
            boolean flag1;
            if (i == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = ajy.a(s);
            s2 = i;
            s3 = c.b("md5RawCrossPublisherId");
            flag1 = flag2;
            if (s3 != null)
            {
                flag1 = flag2;
                if (s3.equals(s2))
                {
                    flag1 = true;
                }
            }
            if (flag1)
            {
                a = c.b("crossPublisherId");
                return;
            }
            if (f && s1 != null && !s1.isEmpty() && s1 != i)
            {
                g = true;
                h = flag;
            }
            a = a(s);
            c.a("crossPublisherId", a);
            c.a("md5RawCrossPublisherId", i);
            return;
        } else
        {
            a = null;
            i = null;
            return;
        }
    }

    public final String a()
    {
        if (e == null)
        {
            e = "";
        }
        return e;
    }

    public final boolean b()
    {
        return e == null || e.length() == 0;
    }

    public final void c()
    {
        aix aix1 = aiy.b(d);
        if (aix1 == null)
        {
            f = true;
            a(null, false);
            return;
        }
        if (aix1.b == 0 && aix1.c == 0)
        {
            a(aix1.a, true);
            return;
        } else
        {
            a(aix1.a, false);
            return;
        }
    }

    public final String d()
    {
        if (f && e())
        {
            return i;
        } else
        {
            return null;
        }
    }

    public final boolean e()
    {
        boolean flag = aiy.a(d);
        if (j == null)
        {
            j = Boolean.valueOf(flag);
        } else
        if (j.booleanValue() != flag)
        {
            c();
            return flag;
        }
        return flag;
    }
}
