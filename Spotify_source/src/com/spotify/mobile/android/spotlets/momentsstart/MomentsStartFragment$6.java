// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart;

import com.spotify.mobile.android.spotlets.momentsstart.model.Moment;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentsStart;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentsVerticalView;
import eug;
import evk;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart:
//            MomentsStartFragment

final class a
    implements evk
{

    private MomentsStartFragment a;

    public final void a()
    {
        if (MomentsStartFragment.f(a) != null)
        {
            int i = a.a.u();
            Moment moment = (Moment)MomentsStartFragment.f(a).moments.get(i);
            Object obj = moment.contexts;
            i = a.a.e(i);
            obj = (MomentContext)((List) (obj)).get(i);
            MomentsStartFragment.l(a).a(moment.requestId, moment.id, i, ((MomentContext) (obj)).uri, "click", "play");
        }
        a.d(true);
    }

    w(MomentsStartFragment momentsstartfragment)
    {
        a = momentsstartfragment;
        super();
    }
}
