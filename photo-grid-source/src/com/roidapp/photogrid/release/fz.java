// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.SharedPreferences;
import android.widget.SeekBar;

// Referenced classes of package com.roidapp.photogrid.release:
//            fr

final class fz
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final fr a;

    fz(fr fr1)
    {
        a = fr1;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (seekbar.getTag().equals("storke"))
        {
            float f = (float)i / 10F;
            a.a(f);
        } else
        {
            if (seekbar.getTag().equals("shadow_space"))
            {
                float f1 = (float)(i - 100) / 10F;
                a.a(f1, f1);
                return;
            }
            if (seekbar.getTag().equals("shadow_size"))
            {
                float f3 = (float)i / 20F;
                float f2 = f3;
                if (f3 == 0.0F)
                {
                    f2 = 1E-04F;
                }
                a.b(f2);
                return;
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        android.content.SharedPreferences.Editor editor = fr.c(a).edit();
        if (!seekbar.getTag().equals("storke")) goto _L2; else goto _L1
_L1:
        editor.putFloat("free_text_stroke_scale", (float)seekbar.getProgress() / 10F);
_L4:
        editor.apply();
        return;
_L2:
        if (seekbar.getTag().equals("shadow_space"))
        {
            editor.putFloat("free_text_shadow_space", (float)(seekbar.getProgress() - 100) / 10F);
        } else
        if (seekbar.getTag().equals("shadow_size"))
        {
            float f1 = (float)seekbar.getProgress() / 20F;
            float f = f1;
            if (f1 == 0.0F)
            {
                f = 1E-04F;
            }
            editor.putFloat("free_text_shadow_radius", f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
