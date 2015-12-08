// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cft
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    private PlayerScreenFragment a;

    public cft(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (!flag)
        {
            return;
        } else
        {
            PlayerScreenFragment.f(a, true);
            PlayerScreenFragment.p(a);
            long l = b.a(i, seekbar.getMax(), 0L, PlayerScreenFragment.q(a));
            PlayerScreenFragment.r(a).setText(b.a(l, a.g()));
            return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        mry.a(seekbar, 28);
        PlayerScreenFragment.f(a, false);
        PlayerScreenFragment.p(a);
        PlayerScreenFragment.b(a).a((float)seekbar.getProgress() / (float)seekbar.getMax());
    }
}
