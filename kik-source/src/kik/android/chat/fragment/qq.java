// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.SeekBar;

// Referenced classes of package kik.android.chat.fragment:
//            ScanCodeTabFragment

final class qq
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final ScanCodeTabFragment a;

    qq(ScanCodeTabFragment scancodetabfragment)
    {
        a = scancodetabfragment;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        if (seekbar == null)
        {
            return;
        }
        if (seekbar.getProgress() < seekbar.getMax() / 2)
        {
            ScanCodeTabFragment.i(a);
            seekbar.setProgress(0);
            return;
        } else
        {
            seekbar.setProgress(seekbar.getMax());
            a.d();
            return;
        }
    }
}
