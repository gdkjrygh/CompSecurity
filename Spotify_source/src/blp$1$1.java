// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class g.Object
    implements Runnable
{

    private g.String a;

    public final void run()
    {
        if (a.a.stopSelfResult(a.a))
        {
            a.a.b("Local AnalyticsService processed last dispatch request");
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class blp$1

/* anonymous class */
    final class blp._cls1
        implements bnx
    {

        final int a;
        final bmp b;
        final blp c;

        public final void a()
        {
            blp.a(c).post(new blp._cls1._cls1(this));
        }

            
            {
                c = blp1;
                a = i;
                b = bmp1;
                super();
            }
    }

}
