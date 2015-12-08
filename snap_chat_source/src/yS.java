// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.squareup.otto.Bus;

public final class yS extends yY
{

    final Bus l;
    final ProfileEventAnalytics m;

    public yS(View view)
    {
        this(view, Mf.a(), ProfileEventAnalytics.a());
    }

    private yS(View view, Bus bus, ProfileEventAnalytics profileeventanalytics)
    {
        super(view);
        l = bus;
        m = profileeventanalytics;
        view.setOnClickListener(new android.view.View.OnClickListener() {

            private yS a;

            public final void onClick(View view1)
            {
                a.m.b(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.STORIES);
                view1 = a;
                Bundle bundle = new Bundle();
                bundle.putBoolean("contextIsAdressBook", true);
                bundle.putInt("sourcePage", com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.STORIES.ordinal());
                ((yS) (view1)).l.a(new Oi(LeftSwipeContentFragment.ADDRESS_BOOK_FRAGMENT, bundle));
            }

            
            {
                a = yS.this;
                super();
            }
        });
    }
}
