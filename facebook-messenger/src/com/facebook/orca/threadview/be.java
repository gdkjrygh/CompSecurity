// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.net.Uri;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.debug.log.b;
import com.facebook.orca.attachments.AudioPlayerBubbleView;
import com.google.common.d.a.h;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewAudioAttachmentView, bh

class be
    implements h
{

    final s a;
    final ThreadViewAudioAttachmentView b;

    be(ThreadViewAudioAttachmentView threadviewaudioattachmentview, s s)
    {
        b = threadviewaudioattachmentview;
        a = s;
        super();
    }

    public void a(Uri uri)
    {
        if (a != ThreadViewAudioAttachmentView.d(b))
        {
            return;
        } else
        {
            ThreadViewAudioAttachmentView.a(b, uri);
            b.a();
            return;
        }
    }

    public volatile void a(Object obj)
    {
        a((Uri)obj);
    }

    public void a(Throwable throwable)
    {
        if (a != ThreadViewAudioAttachmentView.d(b))
        {
            return;
        } else
        {
            com.facebook.debug.log.b.e(ThreadViewAudioAttachmentView.d(), "downloading audio failed!", throwable);
            ThreadViewAudioAttachmentView.e(b).setIsLoading(false);
            ThreadViewAudioAttachmentView.e(b).setTimerText("error");
            ThreadViewAudioAttachmentView.a(b, bh.ERROR);
            ThreadViewAudioAttachmentView.f(b).a((new cb("audio_clips_download_error")).b("error_message", throwable.toString()).e("audio_clips"));
            return;
        }
    }
}
