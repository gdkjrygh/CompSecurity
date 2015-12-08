// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;
import com.tinder.activities.ActivityMain;
import com.tinder.activities.ActivityPassport;
import com.tinder.e.ak;
import com.tinder.enums.PaywallPerk;
import com.tinder.managers.a;
import com.tinder.model.Paywall;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.fragments:
//            bv, FragmentAnchoredPopup

final class a
    implements Runnable
{

    final > a;

    public final void run()
    {
        ActivityMain activitymain = (ActivityMain)bv.b(a.a).getActivity();
        activitymain.startActivityForResult(new Intent(activitymain, com/tinder/activities/ActivityPassport), 9455);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/bv$1

/* anonymous class */
    final class bv._cls1
        implements ak
    {

        final bv a;

        public final void a()
        {
            com.tinder.fragments.bv.a(a);
            SparksEvent sparksevent = new SparksEvent("Passport.MapOpen");
            sparksevent.put("from", Integer.valueOf(1));
            com.tinder.managers.a.a(sparksevent);
            bv.b(a).b.post(new bv._cls1._cls1(this));
            bv.b(a).b.postDelayed(new bv._cls1._cls2(), 300L);
        }

        public final void b()
        {
            com.tinder.fragments.bv.a(a);
            SparksEvent sparksevent = new SparksEvent("Passport.MapOpen");
            sparksevent.put("from", Integer.valueOf(1));
            com.tinder.managers.a.a(sparksevent);
            ((Paywall)bv.b(a).a).launchPlusSubscriptionPaywall(1, PaywallPerk.PASSPORT);
        }

        public final void c()
        {
            com.tinder.fragments.bv.a(a);
            Toast.makeText(bv.b(a).a, bv.b(a).a.getString(0x7f0600ab), 1).show();
        }

            
            {
                a = bv1;
                super();
            }

        // Unreferenced inner class com/tinder/fragments/bv$1$2

/* anonymous class */
        final class bv._cls1._cls2
            implements Runnable
        {

            final bv._cls1 a;

            public final void run()
            {
                bv.b(a.a).d();
            }

                    
                    {
                        a = bv._cls1.this;
                        super();
                    }
        }

    }

}
