// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import Rm;
import Vj;
import Vk;
import Vo;
import Vq;
import Vr;
import Vs;
import Vt;
import Vu;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.addlive.view.ALVideoTextureView;

public class TalkView extends FrameLayout
    implements Vq
{
    public static interface a
    {

        public abstract void a(boolean flag);

        public abstract void a(boolean flag, String s);

        public abstract void b(boolean flag);

        public abstract void d(boolean flag);
    }


    public static final Vu a = new Vu();
    public static final Vk b = new Vk();
    private static TalkView n;
    public View c;
    public ViewGroup d;
    public Vr e;
    public Activity f;
    public a g;
    public Vt h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private int o;

    public TalkView(Context context)
    {
        super(context);
        e = Vo.f();
        o = 5000;
        k = true;
        a(context);
    }

    public TalkView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = Vo.f();
        o = 5000;
        k = true;
        a(context);
    }

    public TalkView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = Vo.f();
        o = 5000;
        k = true;
        a(context);
    }

    public static Vj a(Rm rm)
    {
        Vj vj = new Vj();
        vj.e = rm.b();
        vj.f = rm.d();
        vj.i = rm.f();
        vj.j = rm.g();
        vj.g = rm.c();
        vj.d = rm.a();
        vj.h = rm.e();
        vj.a = 24;
        vj.c = 640;
        vj.b = 320;
        return vj;
    }

    static Vt a(TalkView talkview)
    {
        return talkview.h;
    }

    private void a(Context context)
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            n = this;
            c = a.a(context);
            return;
        }
    }

    public static TalkView b()
    {
        return n;
    }

    public static void setCameraInfo(android.hardware.Camera.CameraInfo camerainfo)
    {
        b.c = camerainfo;
        a.a();
    }

    public static void setCameraPreviewSize(int i1, int j1)
    {
        b.a = i1;
        b.b = j1;
        a.a();
    }

    public final void a()
    {
        if (!l)
        {
            return;
        } else
        {
            c.setScaleX(1.0F);
            c.setScaleY(1.0F);
            a.a(1.0F);
            invalidate();
            return;
        }
    }

    public final void a(String s)
    {
    }

    public final void a(boolean flag)
    {
        g.b(flag);
    }

    public final void a(boolean flag, String s)
    {
        g.a(flag, s);
    }

    public final void b(boolean flag)
    {
        if (!flag)
        {
            g.a(false, "");
            g.b(false);
            g.d(false);
            g.a(false);
        }
    }

    public final void c()
    {
        g.a(false);
        e.b(e());
        l = false;
        k = true;
        c.setVisibility(4);
        a();
    }

    public final void c(boolean flag)
    {
        g.d(flag);
    }

    public final void d()
    {
        if (!i)
        {
            return;
        } else
        {
            e.a(new Vs() {

                private TalkView a;

                public final void a()
                {
                    TalkView talkview = a;
                    talkview.j = false;
                    talkview.h.c("SWIPE_OUT");
                }

                public final void b()
                {
                }

            
            {
                a = TalkView.this;
                super();
            }
            }, e.c(), o);
            return;
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        a();
        super.dispatchDraw(canvas);
    }

    public final Vs e()
    {
        return new Vs() {

            private TalkView a;

            public final void a()
            {
                TalkView.a(a).d("HERE_PUBLISHED");
            }

            public final void b()
            {
            }

            
            {
                a = TalkView.this;
                super();
            }
        };
    }

    public void setPublisherViewGroup(ViewGroup viewgroup)
    {
        d = viewgroup;
    }

    public void setSubscriberView(ALVideoTextureView alvideotextureview)
    {
        e.a(alvideotextureview);
    }


    // Unreferenced inner class com/snapchat/videochat/view/TalkView$1

/* anonymous class */
    public final class _cls1
        implements Vs
    {

        public final void a()
        {
        }

        public final void b()
        {
        }

    }


    // Unreferenced inner class com/snapchat/videochat/view/TalkView$2

/* anonymous class */
    public final class _cls2
        implements Vs
    {

        private TalkView a;

        public final void a()
        {
            TalkView talkview = a;
            talkview.j = true;
            talkview.h.c();
        }

        public final void b()
        {
        }

            public 
            {
                a = TalkView.this;
                super();
            }
    }

}
