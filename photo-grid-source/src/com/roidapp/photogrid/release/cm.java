// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.SeekBar;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ck, PhotoGridActivity, ih, mm

final class cm
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final TextView a;
    final ck b;

    cm(ck ck1, TextView textview)
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
            if (i != ck.c(b))
            {
                seekbar.setProgress(ck.c(b));
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
            ih.C().e(f);
            ih.C().T();
            ck.a(b, i);
            if (!ck.e(b) && !ck.f(b) && !ck.g(b))
            {
                ck.a(b, f);
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
        ck.a(b, "OUTER_SPACE", ck.a(b));
        ck.b(b).b.c(2);
    }
}
