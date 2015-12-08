// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.debug.b;


// Referenced classes of package com.google.android.apps.gsa.shared.util.debug.b:
//            c

public final class b
{

    public static final boolean a = false;
    public static final c b = new c(false, false);
    public static final c c = new c(true, true);
    private static final android.os.StrictMode.ThreadPolicy d = (new android.os.StrictMode.ThreadPolicy.Builder()).permitAll().detectCustomSlowCalls().penaltyLog().build();
    private static final ThreadLocal e = new ThreadLocal();
    private static final ThreadLocal f = new ThreadLocal();
    private static volatile int g = 0;

    public static void a()
    {
    }

    public static android.os.StrictMode.ThreadPolicy b()
    {
        return null;
    }

    public static void c()
    {
    }

}
