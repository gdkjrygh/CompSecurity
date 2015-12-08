// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.SeekBar;

public final class gal
    implements gak
{

    public boolean a;
    private android.widget.SeekBar.OnSeekBarChangeListener b;

    public gal(android.widget.SeekBar.OnSeekBarChangeListener onseekbarchangelistener)
    {
        b = onseekbarchangelistener;
    }

    public final void a(SeekBar seekbar)
    {
        if (b instanceof gak)
        {
            ((gak)b).a(seekbar);
        }
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        b.onProgressChanged(seekbar, i, flag);
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        b.onStartTrackingTouch(seekbar);
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        if (a)
        {
            a = false;
            return;
        } else
        {
            b.onStopTrackingTouch(seekbar);
            return;
        }
    }
}
