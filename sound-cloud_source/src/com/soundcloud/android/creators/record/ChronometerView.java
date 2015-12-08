// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.soundcloud.android.utils.ScTextUtils;
import java.util.concurrent.TimeUnit;

public class ChronometerView extends TextView
{

    private static final int MODE_DURATION_ONLY = 1;
    private static final int MODE_EMPTY = 0;
    private static final int MODE_PLAYBACK = 2;
    private long durationSec;
    private String durationString;
    private int mode;
    private long progressSec;

    public ChronometerView(Context context)
    {
        super(context);
        durationSec = -1L;
        progressSec = -1L;
    }

    public ChronometerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        durationSec = -1L;
        progressSec = -1L;
    }

    public ChronometerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        durationSec = -1L;
        progressSec = -1L;
    }

    private boolean setDuration(long l)
    {
        l /= 1000L;
        if (l != durationSec)
        {
            durationSec = l;
            durationString = ScTextUtils.formatTimestamp(l, TimeUnit.SECONDS);
            return true;
        } else
        {
            return false;
        }
    }

    public void clear()
    {
        setText("");
        mode = 0;
    }

    public void setDurationOnly(long l)
    {
        if (setDuration(l) || mode != 1)
        {
            mode = 1;
            setText(durationString);
        }
    }

    public void setPlaybackProgress(long l, long l1)
    {
        setDuration(l1);
        l1 = l / 1000L;
        if (l1 != progressSec || mode != 2)
        {
            progressSec = l1;
            mode = 2;
            setText((new StringBuilder()).append(ScTextUtils.formatTimestamp(l, TimeUnit.MILLISECONDS)).append(" / ").append(durationString));
        }
    }
}
