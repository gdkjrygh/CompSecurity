// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            a, b

public final class d
{

    private static a a;

    public static void a()
    {
        c();
    }

    public static void b()
    {
        c();
    }

    private static b c()
    {
        if (a == null)
        {
            a = com.google.android.gms.analytics.a.a();
        }
        if (a != null)
        {
            return a.b();
        } else
        {
            return null;
        }
    }
}
