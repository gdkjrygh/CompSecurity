// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import android.media.AudioRecord;
import android.media.MediaSyncEvent;
import android.media.audiofx.NoiseSuppressor;

// Referenced classes of package com.google.android.apps.gsa.speech.audio:
//            g, h

public class f extends g
{

    private NoiseSuppressor i;
    private final int j;
    private final boolean k;

    public f(int l, int i1, int j1, boolean flag, h h1, boolean flag1, int k1, 
            boolean flag2)
    {
        super(l, i1, j1, flag, h1, flag1);
        j = k1;
        k = flag2;
    }

    protected final void a()
    {
        Object obj = null;
        int l = d.a();
        MediaSyncEvent mediasyncevent = obj;
        if (l > 0)
        {
            mediasyncevent = obj;
            if (j == 0)
            {
                mediasyncevent = obj;
                if (k)
                {
                    mediasyncevent = MediaSyncEvent.createEvent(1);
                    mediasyncevent.setAudioSessionId(l);
                }
            }
        }
        if (mediasyncevent != null)
        {
            h.startRecording(mediasyncevent);
            return;
        } else
        {
            h.startRecording();
            return;
        }
    }

    protected final void b()
    {
        if (!f)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        i = NoiseSuppressor.create(h.getAudioSessionId());
        if (i.setEnabled(true) != 0)
        {
            i = null;
        }
        return;
        Exception exception;
        exception;
        i = null;
        return;
    }

    protected final void c()
    {
        if (i != null)
        {
            i.release();
            i = null;
        }
    }
}
