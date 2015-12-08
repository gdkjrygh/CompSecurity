// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            cv, ci, ey

final class ez
    implements Runnable
{

    final ey a;

    ez(ey ey)
    {
        a = ey;
        super();
    }

    public final void run()
    {
        cv.a().f();
        ci.b().a(null, null);
        cv.a().a = false;
        ci.b().f();
    }
}
