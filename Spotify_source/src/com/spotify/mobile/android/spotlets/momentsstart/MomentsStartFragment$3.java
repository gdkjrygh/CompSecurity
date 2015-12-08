// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart;

import android.os.Handler;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.momentsstart.model.Moment;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentsStart;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentHeaderView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentMenuView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentOverlayView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentsVerticalView;
import euz;
import evj;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart:
//            MomentsStartFragment

final class b
    implements evj
{

    private int a;
    private int b;
    private MomentsStartFragment c;

    public final void a(int i)
    {
        c.c(i);
        MomentsStartFragment.a(c, false);
    }

    public final void a(int i, int j)
    {
        Button button = c.Z.a;
        if (a == 0)
        {
            a = c.Z.a.getHeight();
        }
        if (a > 0 && button.getAlpha() > 0.0F)
        {
            int k = a;
            float f = j;
            f = Math.max(0.0F, ((float)k - Math.abs(f)) / (float)k);
            button.setAlpha(f);
            c.aa.a.setAlpha(f);
        }
        if (b != -1 && b != i)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0 && !MomentsStartFragment.h(c))
        {
            c.c(i);
            if (MomentsStartFragment.f(c) != null)
            {
                Object obj1 = (Moment)MomentsStartFragment.f(c).moments.get(i);
                MomentsStartFragment momentsstartfragment = c;
                Object obj = ((Moment) (obj1)).icon;
                obj1 = ((Moment) (obj1)).name;
                momentsstartfragment.b.a.setCompoundDrawablesWithIntrinsicBounds(0, ((com.spotify.mobile.android.spotlets.momentsstart.model.) (obj))., 0, 0);
                momentsstartfragment.b.a.setText(((CharSequence) (obj1)));
                obj = momentsstartfragment.ab.obtainMessage(2);
                momentsstartfragment.ab.sendMessage(((android.os.Message) (obj)));
            }
        }
        b = i;
    }

    public final void b(int i)
    {
        if (i == 1)
        {
            MomentsStartFragment.i(c);
            return;
        }
        if (i == 0)
        {
            if (MomentsStartFragment.h(c))
            {
                a(c.a.u());
            }
            if (!c.K())
            {
                c.d(false);
            }
            c.J();
            return;
        } else
        {
            MomentsStartFragment.j(c).c();
            c.Z.animate().cancel();
            c.aa.animate().cancel();
            return;
        }
    }

    w(MomentsStartFragment momentsstartfragment)
    {
        c = momentsstartfragment;
        super();
        b = -1;
    }
}
