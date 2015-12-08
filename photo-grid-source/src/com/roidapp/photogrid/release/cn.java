// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.SeekBar;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ck, PhotoGridActivity, ih, mm

final class cn
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final TextView a;
    final ck b;

    cn(ck ck1, TextView textview)
    {
        b = ck1;
        a = textview;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        float f1 = 0.0F;
        a.setText(String.valueOf(i));
        if (ck.b(b).i)
        {
            if (i != ck.i(b))
            {
                seekbar.setProgress(ck.i(b));
            }
        } else
        {
            float f;
            if (i > 50)
            {
                f = ((float)(i - 50) / 50F) * (ck.d(b) / 2.0F - 1.5F) + 1.5F;
            } else
            {
                f = ((float)i / 50F) * 1.5F;
            }
            if (f <= 0.0F)
            {
                f = f1;
            }
            ih.C().d(f);
            ck.b(b, i);
            if (!ck.e(b) && !ck.f(b) && !ck.g(b))
            {
                ck.b(b, f);
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
        ck.a(b, "INNER_SPACE", ck.h(b));
        ck.b(b).b.c(2);
    }
}
