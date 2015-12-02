// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.c;

import android.content.Context;
import android.content.IntentFilter;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.widget.ListView;
import com.facebook.common.w.q;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.zero.annotations.IsUserCurrentlyZeroRated;
import javax.inject.a;

// Referenced classes of package com.facebook.zero.c:
//            d

public class c extends Preference
{

    private final a a;
    private final com.facebook.base.broadcast.q b;

    public c(Context context)
    {
        super(context);
        a = t.a(context).b(com/facebook/common/w/q, com/facebook/zero/annotations/IsUserCurrentlyZeroRated);
        context = new IntentFilter();
        context.addAction("com.facebook.orca.ZERO_RATING_STATE_CHANGED");
        b = new d(this, getContext(), context);
        setTitle(o.preference_zero_rating_current_status_title);
        d();
    }

    static void a(c c1)
    {
        c1.c();
    }

    private void c()
    {
        d();
        ((PreferenceActivity)getContext()).getListView().invalidate();
    }

    private void d()
    {
        q q1 = (q)a.b();
        if (q1 == q.NO)
        {
            setSummary(o.preference_zero_rating_current_status_no);
        } else
        {
            if (q1 == q.YES)
            {
                setSummary(o.preference_zero_rating_current_status_yes);
                return;
            }
            if (q1 == q.UNSET)
            {
                setSummary(o.preference_zero_rating_current_status_unknown);
                return;
            }
        }
    }

    public void a()
    {
        b.a();
    }

    public void b()
    {
        b.b();
    }
}
