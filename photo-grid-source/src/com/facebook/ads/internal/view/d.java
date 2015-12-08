// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.facebook.ads.internal.adapters.e;

public class d extends FrameLayout
{

    private VideoView a;
    private e b;
    private a c;
    private String d;
    private String e;
    private Handler f;
    private float g;

    public d(Context context)
    {
        super(context);
        e();
    }

    static VideoView a(d d1)
    {
        return d1.a;
    }

    static String b(d d1)
    {
        return d1.e;
    }

    static Handler c(d d1)
    {
        return d1.f;
    }

    static a d(d d1)
    {
        return d1.c;
    }

    private void e()
    {
        g = 0.0F;
        setBackgroundColor(0);
        Object obj = getContext();
        a = new VideoView(((Context) (obj)));
        a.setBackgroundColor(0);
        Object obj1 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(13);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
        a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        a.setOnPreparedListener(new _cls1());
        addView(a);
        f = new Handler();
        obj1 = new _cls2();
        f.postDelayed(((Runnable) (obj1)), 250L);
        b = new e(((Context) (obj)), this, 50, new _cls3());
        b.a(0);
        b.b(250);
        b.a();
        setOnTouchListenerInternal(new _cls4(this));
        setOnClickListenerInternal(new _cls5(this));
        c = new a(((Context) (obj)));
        obj = new android.widget.FrameLayout.LayoutParams(100, 100, 80);
        c.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        c.setOnTouchListener(new _cls6());
        c.setOnClickListener(new _cls7());
        addView(c);
    }

    private void setOnClickListenerInternal(android.view.View.OnClickListener onclicklistener)
    {
        super.setOnClickListener(onclicklistener);
    }

    private void setOnTouchListenerInternal(android.view.View.OnTouchListener ontouchlistener)
    {
        super.setOnTouchListener(ontouchlistener);
    }

    void a()
    {
    }

    public void b()
    {
        d = null;
    }

    public void c()
    {
        a.a(c, false);
        a.start();
    }

    public void d()
    {
        a.a(c, true);
        a.pause();
    }

    public String getVideoPlayReportURI()
    {
        return e;
    }

    public String getVideoURI()
    {
        return d;
    }

    float getVolume()
    {
        return g;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
    }

    public void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
    }

    public void setVideoPlayReportURI(String s)
    {
        e = s;
    }

    public void setVideoURI(String s)
    {
        d = s;
        if (s != null)
        {
            a.setVideoURI(Uri.parse(s));
        }
    }

    void setVolume(float f1)
    {
        g = f1;
    }

    private class _cls1
        implements android.media.MediaPlayer.OnPreparedListener
    {

        final d a;

        public void onPrepared(MediaPlayer mediaplayer)
        {
            MediaPlayer mediaplayer1 = mediaplayer;
            try
            {
                if (mediaplayer.isPlaying())
                {
                    mediaplayer.stop();
                    mediaplayer.release();
                    mediaplayer1 = new MediaPlayer();
                }
                mediaplayer1.setVolume(a.getVolume(), a.getVolume());
                mediaplayer1.setLooping(false);
                mediaplayer1.start();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MediaPlayer mediaplayer)
            {
                mediaplayer.printStackTrace();
            }
        }

        _cls1()
        {
            a = d.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final d a;

        public void run()
        {
            if (d.a(a).getCurrentPosition() > 3000)
            {
                (new o()).execute(new String[] {
                    d.b(a)
                });
            }
            d.c(a).postDelayed(this, 250L);
        }

        _cls2()
        {
            a = d.this;
            super();
        }
    }


    private class _cls3 extends com.facebook.ads.internal.adapters.e.a
    {

        final d a;

        public void a()
        {
            a.c();
        }

        _cls3()
        {
            a = d.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnTouchListener
    {

        final d a;
        final d b;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 1 && a.getVideoURI() != null)
            {
                b.a();
                return true;
            } else
            {
                return false;
            }
        }

        _cls4(d d2)
        {
            b = d.this;
            a = d2;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final d a;
        final d b;

        public void onClick(View view)
        {
            if (a.getVideoURI() != null)
            {
                b.a();
            }
        }

        _cls5(d d2)
        {
            b = d.this;
            a = d2;
            super();
        }
    }


    private class a extends Button
    {

        final d a;
        private Paint b;
        private Path c;
        private Path d;
        private Path e;
        private int f;
        private boolean g;

        private void a()
        {
            f = 60;
            c = new Path();
            d = new Path();
            e = new Path();
            class _cls1 extends Paint
            {

                final a a;

                _cls1()
                {
                    a = a.this;
                    super();
                    setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                    setStrokeCap(android.graphics.Paint.Cap.ROUND);
                    setStrokeWidth(3F);
                    setAntiAlias(true);
                    setColor(-1);
                }
            }

            b = new _cls1();
            b();
            setClickable(true);
            setBackgroundColor(0);
        }

        static void a(a a1, boolean flag)
        {
            a1.a(flag);
        }

        private void a(boolean flag)
        {
            g = flag;
            refreshDrawableState();
            invalidate();
        }

        static boolean a(a a1)
        {
            return a1.c();
        }

        private void b()
        {
            Object obj = getResources().getDisplayMetrics();
            int i = (int)((float)f * ((DisplayMetrics) (obj)).density);
            float f1 = f;
            obj = new android.widget.RelativeLayout.LayoutParams(i, (int)(((DisplayMetrics) (obj)).density * f1));
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12);
            setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }

        private boolean c()
        {
            return g;
        }

        protected void onDraw(Canvas canvas)
        {
            if (canvas.isHardwareAccelerated() && android.os.Build.VERSION.SDK_INT < 17)
            {
                setLayerType(1, null);
            }
            float f1 = (float)Math.max(canvas.getWidth(), canvas.getHeight()) / 100F;
            if (c())
            {
                e.rewind();
                e.moveTo(26.5F * f1, 15.5F * f1);
                e.lineTo(26.5F * f1, 84.5F * f1);
                e.lineTo(82.5F * f1, 50.5F * f1);
                e.lineTo(26.5F * f1, f1 * 15.5F);
                e.close();
                canvas.drawPath(e, b);
            } else
            {
                c.rewind();
                c.moveTo(29F * f1, 21F * f1);
                c.lineTo(29F * f1, 79F * f1);
                c.lineTo(45F * f1, 79F * f1);
                c.lineTo(45F * f1, 21F * f1);
                c.lineTo(29F * f1, 21F * f1);
                c.close();
                d.rewind();
                d.moveTo(55F * f1, 21F * f1);
                d.lineTo(55F * f1, 79F * f1);
                d.lineTo(71F * f1, 79F * f1);
                d.lineTo(71F * f1, 21F * f1);
                d.lineTo(55F * f1, f1 * 21F);
                d.close();
                canvas.drawPath(c, b);
                canvas.drawPath(d, b);
            }
            super.onDraw(canvas);
        }

        public a(Context context)
        {
            a = d.this;
            super(context);
            a();
        }
    }


    private class _cls6
        implements android.view.View.OnTouchListener
    {

        final d a;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 1)
            {
                if (a.a(d.d(a)))
                {
                    a.c();
                    return true;
                } else
                {
                    a.d();
                    return true;
                }
            } else
            {
                return false;
            }
        }

        _cls6()
        {
            a = d.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final d a;

        public void onClick(View view)
        {
            if (a.a(d.d(a)))
            {
                a.c();
                return;
            } else
            {
                a.d();
                return;
            }
        }

        _cls7()
        {
            a = d.this;
            super();
        }
    }

}
