// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.SeekBar;

public final class fpl
{

    public static float a(SeekBar seekbar)
    {
        int i = seekbar.getProgress();
        int j = seekbar.getMax();
        return (float)i / (float)j;
    }

    public static void a(float f, SeekBar seekbar)
    {
        seekbar.setProgress(Math.round((float)seekbar.getMax() * f));
    }
}
