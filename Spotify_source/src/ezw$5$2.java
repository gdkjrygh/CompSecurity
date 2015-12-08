// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class g.Object
    implements fjt
{

    private a a;

    public final void a()
    {
        ezw.c(a.a).b.a = false;
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class ezw$5

/* anonymous class */
    final class ezw._cls5
        implements Runnable
    {

        final ezw a;

        public final void run()
        {
            if (ezw.d(a).getVisibility() == 0)
            {
                fjq fjq1 = new fjq();
                fjq1.a = new ezw._cls5._cls1();
                fjq1.a(new ezw._cls5._cls2(this));
                ezw.e(a);
                fjn fjn1 = fjm.a(a.k());
                fjn1.a = com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type.e;
                fjn1.d = fjq1;
                fjn1.a(ezw.d(a));
            }
        }

            
            {
                a = ezw1;
                super();
            }

        // Unreferenced inner class ezw$5$1

/* anonymous class */
        final class ezw._cls5._cls1
            implements android.view.View.OnClickListener
        {

            private ezw._cls5 a;

            public final void onClick(View view)
            {
                ezw.c(a.a).b.a = false;
            }

                    
                    {
                        a = ezw._cls5.this;
                        super();
                    }
        }

    }

}
