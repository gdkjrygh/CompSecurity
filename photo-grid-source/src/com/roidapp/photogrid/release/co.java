// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            ck, PhotoGridActivity, mm, ih

final class co
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final TextView a;
    final ck b;

    co(ck ck1, TextView textview)
    {
        b = ck1;
        a = textview;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        a.setText(String.valueOf(i));
        if (ck.b(b).i)
        {
            if (i != ck.k(b))
            {
                seekbar.setProgress(ck.k(b));
            }
        } else
        {
            int j = ck.b(b).b.j.getLayoutParams().width;
            int k = ck.b(b).b.j.getLayoutParams().height;
            float f = j;
            if (j > k)
            {
                f = k;
            }
            if (az.q == 6)
            {
                ih.C().f(i);
                f = 0.0F;
            } else
            {
                float f1 = (float)i / 100F;
                f = ((f * ih.C().Q()) / 200F) * f1;
                ih.C().f(f);
            }
            ck.c(b, i);
            if (!ck.e(b) && !ck.f(b) && !ck.g(b))
            {
                ck.c(b, f);
            }
            if (ck.b(b).b != null)
            {
                ck.b(b).b.c(1);
                return;
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        a.setText((new StringBuilder()).append(seekbar.getProgress()).toString());
        a.setVisibility(0);
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        a.setVisibility(8);
        ih.C().q(true);
        ck.a(b, "CORNER_RADIOUS", ck.j(b));
        ck.b(b).b.c(2);
    }
}
