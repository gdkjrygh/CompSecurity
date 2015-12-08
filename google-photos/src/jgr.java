// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.videoplayer.slomo.ui.RangeSeekBar;

public final class jgr
    implements Runnable
{

    private RangeSeekBar a;

    public jgr(RangeSeekBar rangeseekbar)
    {
        a = rangeseekbar;
        super();
    }

    public final void run()
    {
        RangeSeekBar.a(a);
    }
}
