// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import aav;
import abo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.momentsstart.model.Moment;
import evd;
import eve;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart.view:
//            MomentMenuView

final class a
    implements android.view.r
{

    private int a;
    private a b;

    public final void onClick(View view)
    {
        if (MomentMenuView.c(b.b) != null)
        {
            MomentMenuView.c(b.b).a(a);
        }
    }

    ( , int i)
    {
        b = ;
        a = i;
        super();
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/momentsstart/view/MomentMenuView$2

/* anonymous class */
    final class MomentMenuView._cls2 extends aav
    {

        final MomentMenuView c;

        public final volatile abo a(ViewGroup viewgroup, int i)
        {
            return eve.a(viewgroup);
        }

        public final void a(abo abo, int i)
        {
            Object obj = (eve)abo;
            abo = (Moment)MomentMenuView.a(c).get(i);
            obj = ((eve) (obj)).j;
            ((TextView) (obj)).setText(((Moment) (abo)).name);
            boolean flag;
            if (i == MomentMenuView.b(c))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((TextView) (obj)).setSelected(flag);
            ((TextView) (obj)).setOnClickListener(new MomentMenuView._cls2._cls1(this, i));
        }

        public final int b()
        {
            return MomentMenuView.a(c).size();
        }

            
            {
                c = momentmenuview;
                super();
            }
    }

}
