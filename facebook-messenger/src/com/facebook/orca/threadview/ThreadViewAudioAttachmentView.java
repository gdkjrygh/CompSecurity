// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.Toast;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.w.j;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.attachments.AudioAttachmentData;
import com.facebook.orca.attachments.AudioPlayerBubbleView;
import com.facebook.orca.attachments.ClipProgressLayout;
import com.facebook.orca.attachments.d;
import com.facebook.orca.d.ay;
import com.facebook.orca.d.az;
import com.facebook.orca.d.bc;
import com.facebook.orca.d.e;
import com.facebook.orca.d.l;
import com.facebook.orca.d.m;
import com.facebook.widget.f;
import com.google.common.base.Preconditions;
import com.google.common.d.a.s;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.orca.threadview:
//            bb, bh, bc, bd, 
//            be, bg, bf, l

public class ThreadViewAudioAttachmentView extends f
{

    private static final Class a = com/facebook/orca/threadview/ThreadViewAudioAttachmentView;
    private final ay b;
    private final m c;
    private final az d;
    private final Executor e;
    private final av f;
    private final AudioPlayerBubbleView g;
    private final AudioPlayerBubbleView h;
    private final ClipProgressLayout i;
    private final l j;
    private e k;
    private s l;
    private bh m;
    private AudioAttachmentData n;
    private Uri o;
    private long p;

    public ThreadViewAudioAttachmentView(Context context)
    {
        this(context, null);
    }

    public ThreadViewAudioAttachmentView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = new bb(this);
        m = bh.INIT;
        p = -1L;
        context = t.a(context);
        b = (ay)context.a(com/facebook/orca/d/ay);
        c = (m)context.a(com/facebook/orca/d/m);
        d = (az)context.a(com/facebook/orca/d/az);
        e = (Executor)context.a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread);
        f = (av)context.a(com/facebook/analytics/av);
        setContentView(k.orca_audio_message_item);
        g = (AudioPlayerBubbleView)getView(i.audio_player_bubble_normal);
        h = (AudioPlayerBubbleView)getView(i.audio_player_bubble_highlighted);
        i = (ClipProgressLayout)getView(i.audio_player_highlighted_wrapper);
        context = new com.facebook.orca.threadview.bc(this);
        g.setOnClickListener(context);
        h.setOnClickListener(context);
        context = new bd(this);
        g.setOnLongClickListener(context);
        h.setOnLongClickListener(context);
    }

    private int a(int i1)
    {
        int j1 = com.facebook.common.w.j.a(getContext(), 60F);
        if (i1 > 0)
        {
            long l1;
            if (p == -1L)
            {
                l1 = 0L;
            } else
            {
                l1 = p;
            }
            return Math.min(Math.max(j1, (int)((1.0D - Math.pow(10D, Math.max(5000D, l1) / 1000D / -30D)) * (double)(i1 - j1)) + j1), i1);
        } else
        {
            return j1;
        }
    }

    static bh a(ThreadViewAudioAttachmentView threadviewaudioattachmentview, bh bh1)
    {
        threadviewaudioattachmentview.m = bh1;
        return bh1;
    }

    private void a(long l1)
    {
        if (l1 == -1L)
        {
            return;
        } else
        {
            String s1 = b(l1);
            g.setTimerText(s1);
            h.setTimerText(s1);
            return;
        }
    }

    private void a(Uri uri)
    {
        o = uri;
        g.setIsLoading(false);
        m = bh.DOWNLOADED;
        uri = c.b(uri);
        if (uri != null)
        {
            uri.a(j);
            k = uri;
        }
    }

    static void a(ThreadViewAudioAttachmentView threadviewaudioattachmentview)
    {
        threadviewaudioattachmentview.f();
    }

    static void a(ThreadViewAudioAttachmentView threadviewaudioattachmentview, Uri uri)
    {
        threadviewaudioattachmentview.a(uri);
    }

    private String b(long l1)
    {
        int i1 = (int)(l1 / 1000L);
        return com.facebook.common.w.m.a("%d:%02d", new Object[] {
            Integer.valueOf(i1 / 60), Integer.valueOf(i1 % 60)
        });
    }

    private void b(Uri uri)
    {
        if (l != null)
        {
            l.cancel(false);
        }
        l = d.a(new bc(uri));
        uri = l;
        com.google.common.d.a.i.a(uri, new be(this, uri), e);
        g.setIsLoading(true);
    }

    static void b(ThreadViewAudioAttachmentView threadviewaudioattachmentview)
    {
        threadviewaudioattachmentview.g();
    }

    static void c(ThreadViewAudioAttachmentView threadviewaudioattachmentview)
    {
        threadviewaudioattachmentview.e();
    }

    static s d(ThreadViewAudioAttachmentView threadviewaudioattachmentview)
    {
        return threadviewaudioattachmentview.l;
    }

    static Class d()
    {
        return a;
    }

    static AudioPlayerBubbleView e(ThreadViewAudioAttachmentView threadviewaudioattachmentview)
    {
        return threadviewaudioattachmentview.g;
    }

    private void e()
    {
        switch (bg.b[m.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            if (!h())
            {
                f.a((new cb("audio_clips_playback_start")).e("audio_clips"));
                k = c.a(o);
                k.a(j);
                return;
            }
            if (k.f())
            {
                g.setIsPlaying(true);
                h.setIsPlaying(true);
                k.e();
                f.a((new cb("audio_clips_playback_resume")).e("audio_clips"));
                return;
            } else
            {
                g.setIsPlaying(false);
                h.setIsPlaying(false);
                k.d();
                f.a((new cb("audio_clips_playback_pause")).e("audio_clips"));
                return;
            }

        case 2: // '\002'
            f.a((new cb("audio_clips_playback_error")).e("audio_clips"));
            Toast.makeText(getContext(), getContext().getString(o.audio_player_error_message), 0).show();
            return;
        }
    }

    static av f(ThreadViewAudioAttachmentView threadviewaudioattachmentview)
    {
        return threadviewaudioattachmentview.f;
    }

    private void f()
    {
        boolean flag1 = true;
        AudioPlayerBubbleView audioplayerbubbleview = g;
        boolean flag;
        if (!k.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        audioplayerbubbleview.setIsPlaying(flag);
        audioplayerbubbleview = h;
        if (!k.f())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        audioplayerbubbleview.setIsPlaying(flag);
    }

    private void g()
    {
        b();
        if (m == bh.DOWNLOADED)
        {
            g.setIsPlaying(false);
            h.setIsPlaying(false);
        }
    }

    private boolean h()
    {
        return o != null && k != null && k.b().equals(o) && k.i();
    }

    public void a()
    {
        if (h())
        {
            f();
            return;
        } else
        {
            g();
            return;
        }
    }

    public void a(com.facebook.orca.threadview.l l1)
    {
        l1 = new bf(this, l1);
        g.setOnLongClickListener(l1);
        h.setOnLongClickListener(l1);
    }

    public void b()
    {
        a(p);
        i.setProgress(0.0D);
    }

    public void c()
    {
        int i1 = k.g();
        int j1 = k.h();
        a(j1 - (i1 / 1000) * 1000);
        double d1 = (double)i1 / (double)j1;
        i.setProgress(d1);
    }

    protected void onMeasure(int i1, int j1)
    {
        if (android.view.View.MeasureSpec.getMode(i1) == 0)
        {
            super.onMeasure(i1, j1);
            return;
        } else
        {
            i1 = android.view.View.MeasureSpec.getSize(i1);
            int k1 = getPaddingLeft() + getPaddingRight();
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(a(i1 - k1) + k1, 0x40000000), j1);
            return;
        }
    }

    public void setAudioAttachmentData(AudioAttachmentData audioattachmentdata)
    {
        Preconditions.checkNotNull(audioattachmentdata);
        if (n == audioattachmentdata)
        {
            return;
        }
        n = audioattachmentdata;
        m = bh.INIT;
        p = audioattachmentdata.a();
        a(p);
        if (k != null)
        {
            k.b(j);
            k = null;
        }
        audioattachmentdata = audioattachmentdata.b();
        if (audioattachmentdata == null)
        {
            g();
            g.setIsLoading(true);
        } else
        {
            Uri uri = b.a(audioattachmentdata);
            if (uri == null)
            {
                g();
                b(audioattachmentdata);
            } else
            {
                a(uri);
                a();
            }
        }
        requestLayout();
    }

    public void setForMeUser(boolean flag)
    {
        AudioPlayerBubbleView audioplayerbubbleview = g;
        d d1;
        if (flag)
        {
            d1 = d.SELF_NORMAL;
        } else
        {
            d1 = d.OTHER_NORMAL;
        }
        audioplayerbubbleview.setType(d1);
        audioplayerbubbleview = h;
        if (flag)
        {
            d1 = d.SELF_HIGHLIGHTED;
        } else
        {
            d1 = d.OTHER_HIGHLIGHTED;
        }
        audioplayerbubbleview.setType(d1);
    }

}
