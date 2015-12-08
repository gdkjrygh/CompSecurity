// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;


// Referenced classes of package com.fitbit.ui:
//            FitbitActivity

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        a.a.m_();
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/fitbit/ui/FitbitActivity$3

/* anonymous class */
    class FitbitActivity._cls3
        implements com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener
    {

        final FitbitActivity a;

        public void a()
        {
            a.runOnUiThread(new FitbitActivity._cls3._cls1(this));
        }

        public void a(com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason offlinereason)
        {
            a.runOnUiThread(new FitbitActivity._cls3._cls2());
        }

            
            {
                a = fitbitactivity;
                super();
            }

        // Unreferenced inner class com/fitbit/ui/FitbitActivity$3$2

/* anonymous class */
        class FitbitActivity._cls3._cls2
            implements Runnable
        {

            final FitbitActivity._cls3 a;

            public void run()
            {
                a.a.t_();
            }

                    
                    {
                        a = FitbitActivity._cls3.this;
                        super();
                    }
        }

    }

}
