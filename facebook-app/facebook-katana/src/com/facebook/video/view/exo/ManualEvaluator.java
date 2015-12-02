// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatEvaluator;
import java.util.List;

// Referenced classes of package com.facebook.video.view.exo:
//            PlaybackPreferences

public final class ManualEvaluator
    implements FormatEvaluator
{

    private final PlaybackPreferences a;

    public ManualEvaluator(PlaybackPreferences playbackpreferences)
    {
        a = playbackpreferences;
    }

    public final void a()
    {
    }

    public final void a(List list, long l, Format aformat[], com.google.android.exoplayer.chunk.FormatEvaluator.Evaluation evaluation)
    {
        if (a.a())
        {
            list = aformat[0];
        } else
        {
            list = aformat[aformat.length - 1];
        }
        evaluation.c = list;
    }

    public final void b()
    {
    }
}
