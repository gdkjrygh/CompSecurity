// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gem
{

    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final boolean g;
    public static final boolean h;
    public static final boolean i;
    public static final boolean j;
    public static final boolean k;
    public static final boolean l;
    public static final boolean m;
    public static final boolean n;
    public static final boolean o;
    public static final boolean p;
    public static final boolean q;

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if (android.os.Build.VERSION.SDK_INT == 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (android.os.Build.VERSION.SDK_INT == 17)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (android.os.Build.VERSION.SDK_INT == 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (android.os.Build.VERSION.SDK_INT == 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (android.os.Build.VERSION.SDK_INT == 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        k = "MNC".equals(android.os.Build.VERSION.CODENAME);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        q = flag;
    }
}
