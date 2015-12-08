// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.widget.Button;
import com.arist.service.MusicPlayService;

// Referenced classes of package yong.powerfull.equalizer:
//            Equize, CompatEq, MySeekBar

class ar_3B_
    implements .OnSeekBarChangeListener
{

    final Equize this$0;
    private final MySeekBar val$equizeBar[];

    public void onProgressChanged(MySeekBar myseekbar, int i, boolean flag)
    {
        if (Equize.access$3(Equize.this).mEqualizer == null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L5:
        if (j < 5) goto _L3; else goto _L2
_L2:
        if (!choose)
        {
            Equize.access$4(Equize.this).setText(0x7f08009a);
        }
        return;
_L3:
        if (myseekbar.equals(val$equizeBar[j]))
        {
            Equize.access$3(Equize.this).mEqualizer.setBandLevel((short)j, (short)(i - maxEQLevel));
        }
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onStartTrackingTouch(MySeekBar myseekbar)
    {
    }

    public void onStopTrackingTouch(MySeekBar myseekbar)
    {
    }

    ()
    {
        this$0 = final_equize;
        val$equizeBar = _5B_Lyong.powerfull.equalizer.MySeekBar_3B_.this;
        super();
    }
}
