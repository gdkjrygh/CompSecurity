// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.LevelListDrawable;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.time.a;
import com.facebook.common.time.c;
import com.facebook.common.w.j;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.d.af;
import com.facebook.orca.d.aq;
import com.facebook.orca.d.aw;
import com.facebook.orca.d.m;
import com.facebook.orca.nux.h;
import com.facebook.ui.media.attachments.d;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.compose:
//            a, b, h, c, 
//            d, g, e

public class AudioComposerView extends f
{

    private final af a;
    private final aq b;
    private final aw c;
    private final m d;
    private final h e;
    private final av f;
    private final a g;
    private final d h;
    private final ImageView i;
    private final ImageView j;
    private final Button k;
    private final Runnable l;
    private final Runnable m;
    private boolean n;
    private g o;
    private boolean p;
    private boolean q;
    private long r;
    private Rect s;
    private long t;
    private final com.facebook.orca.compose.h u;

    public AudioComposerView(Context context)
    {
        this(context, null);
    }

    public AudioComposerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AudioComposerView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        l = new com.facebook.orca.compose.a(this);
        m = new b(this);
        u = new com.facebook.orca.compose.h(this, null);
        context = getInjector();
        a = (af)context.a(com/facebook/orca/d/af);
        b = new aq(this);
        c = (aw)context.a(com/facebook/orca/d/aw);
        c.a(this);
        d = (m)context.a(com/facebook/orca/d/m);
        e = (h)context.a(com/facebook/orca/nux/h);
        f = (av)context.a(com/facebook/analytics/av);
        g = (a)context.a(com/facebook/common/time/a);
        h = (d)context.a(com/facebook/ui/media/attachments/d);
        setContentView(k.orca_audio_composer);
        i = (ImageView)getView(i.audio_volume_indicator);
        j = (ImageView)getView(i.audio_composer_record_button);
        k = (Button)getView(i.audio_composer_done_button);
        j.setOnTouchListener(new com.facebook.orca.compose.c(this));
        k.setOnClickListener(new com.facebook.orca.compose.d(this));
        setFocusableInTouchMode(true);
    }

    static long a(AudioComposerView audiocomposerview, long l1)
    {
        audiocomposerview.r = l1;
        return l1;
    }

    private void a(Uri uri)
    {
        f.a((new cb("audio_clips_send")).e("audio_clips"));
        uri = h.a(uri, a.e());
        if (uri == null)
        {
            Toast.makeText(getContext(), getContext().getString(o.audio_recording_attachment_error), 0).show();
            f.a((new cb("audio_clips_creation_failed")).b("error_message", "The attachment instance for audio clip can't be created.").e("audio_clips"));
            return;
        } else
        {
            o.a(uri);
            e.r();
            return;
        }
    }

    private void a(MotionEvent motionevent)
    {
        if (a.d() || u.b())
        {
            if (c(motionevent) && !n)
            {
                if (u.b())
                {
                    c.c();
                } else
                {
                    c.d();
                }
                n = true;
                b.a(com.facebook.orca.d.av.TOOLTIP);
                return;
            }
            if (!c(motionevent) && n)
            {
                if (!p || !q)
                {
                    a.b();
                    return;
                } else
                {
                    n = false;
                    b.a(com.facebook.orca.d.av.TOOLTIP_HOVER_OFF);
                    c.b();
                    return;
                }
            }
        }
    }

    static void a(AudioComposerView audiocomposerview, int i1)
    {
        audiocomposerview.setVolumeLevel(i1);
    }

    static void a(AudioComposerView audiocomposerview, Uri uri)
    {
        audiocomposerview.a(uri);
    }

    static void a(AudioComposerView audiocomposerview, MotionEvent motionevent)
    {
        audiocomposerview.a(motionevent);
    }

    static boolean a(AudioComposerView audiocomposerview)
    {
        return audiocomposerview.q;
    }

    static boolean a(AudioComposerView audiocomposerview, boolean flag)
    {
        audiocomposerview.p = flag;
        return flag;
    }

    private void b(MotionEvent motionevent)
    {
        if (u.b())
        {
            if (c(motionevent))
            {
                u.d();
                j();
                return;
            } else
            {
                u.c();
                j();
                c.a();
                return;
            }
        }
        if (!a.d() || r == 0L || com.facebook.common.time.c.b().a() - r < 400L)
        {
            f.a((new cb("audio_clips_cancelled_too_short")).e("audio_clips"));
            a.b();
            j();
            b.b();
            return;
        }
        if (!c(motionevent))
        {
            f.a((new cb("audio_clips_cancelled_by_user")).e("audio_clips"));
            a.b();
            j();
            c.a();
            return;
        } else
        {
            postDelayed(m, 300L);
            j();
            return;
        }
    }

    static void b(AudioComposerView audiocomposerview)
    {
        audiocomposerview.h();
    }

    static void b(AudioComposerView audiocomposerview, MotionEvent motionevent)
    {
        audiocomposerview.b(motionevent);
    }

    static boolean b(AudioComposerView audiocomposerview, boolean flag)
    {
        audiocomposerview.q = flag;
        return flag;
    }

    static com.facebook.orca.compose.h c(AudioComposerView audiocomposerview)
    {
        return audiocomposerview.u;
    }

    private boolean c(MotionEvent motionevent)
    {
        if (s == null)
        {
            int i1 = com.facebook.common.w.j.a(getContext(), 60F);
            s = new Rect(j.getLeft(), j.getTop() - i1, j.getRight(), j.getBottom());
        }
        int j1 = Math.round(motionevent.getX());
        int k1 = j.getLeft();
        int l1 = Math.round(motionevent.getY());
        int i2 = j.getTop();
        return s.contains(j1 + k1, l1 + i2);
    }

    static af d(AudioComposerView audiocomposerview)
    {
        return audiocomposerview.a;
    }

    static void e(AudioComposerView audiocomposerview)
    {
        audiocomposerview.j();
    }

    private boolean e()
    {
        boolean flag;
        if (g.a() - t < 500L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        t = g.a();
        return flag;
    }

    private void f()
    {
        if (getContext() instanceof com.facebook.orca.activity.k)
        {
            ((com.facebook.orca.activity.k)getContext()).c().m();
        }
    }

    static boolean f(AudioComposerView audiocomposerview)
    {
        return audiocomposerview.e();
    }

    private void g()
    {
        if (getContext() instanceof com.facebook.orca.activity.k)
        {
            ((com.facebook.orca.activity.k)getContext()).c().n();
        }
    }

    static void g(AudioComposerView audiocomposerview)
    {
        audiocomposerview.i();
    }

    private void h()
    {
        b.e();
        j.setImageDrawable(getResources().getDrawable(com.facebook.h.orca_record_button_selected));
    }

    static void h(AudioComposerView audiocomposerview)
    {
        audiocomposerview.g();
    }

    static g i(AudioComposerView audiocomposerview)
    {
        return audiocomposerview.o;
    }

    private void i()
    {
        j.setImageDrawable(getResources().getDrawable(com.facebook.h.orca_record_button_pressed));
        f();
        d.b();
        n = true;
        b.f();
        c.d();
        postDelayed(l, 400L);
        Handler handler = new Handler();
        a.a(new e(this, handler));
    }

    private void j()
    {
        removeCallbacks(l);
        r = 0L;
        q = false;
        p = false;
        setVolumeLevel(0);
        b.d();
        b.f();
        c.d();
        j.setImageDrawable(getResources().getDrawable(com.facebook.h.orca_record_button_normal));
        g();
    }

    static boolean j(AudioComposerView audiocomposerview)
    {
        return audiocomposerview.p;
    }

    static aq k(AudioComposerView audiocomposerview)
    {
        return audiocomposerview.b;
    }

    static aw l(AudioComposerView audiocomposerview)
    {
        return audiocomposerview.c;
    }

    static Runnable m(AudioComposerView audiocomposerview)
    {
        return audiocomposerview.m;
    }

    private void setVolumeLevel(int i1)
    {
        ((LevelListDrawable)i.getDrawable()).setLevel(i1);
    }

    public void a()
    {
        f.a((new cb("audio_clips_show_composer")).e("audio_clips"));
        if (e.m())
        {
            b.a();
        }
        requestFocus();
    }

    public void b()
    {
        b.f();
    }

    public boolean c()
    {
        return a.d();
    }

    public void d()
    {
        b.g();
    }

    protected void onDetachedFromWindow()
    {
        a.b();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        a.b();
        return super.onKeyDown(i1, keyevent);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        s = null;
    }

    public void setListener(g g1)
    {
        o = g1;
    }
}
