// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            t

public static final class b
{

    private String a;
    private String b;

    static String a(b b1)
    {
        return b1.a;
    }

    static String b(a a1)
    {
        return a1.b;
    }

    public final void a(String s)
    {
        b = s;
    }

    public final void a(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        a = s;
    }

    public ()
    {
        a = null;
        b = null;
    }
}
