// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;

final class bes
    implements android.view.View.OnTouchListener
{

    private float a;
    private bem b;

    bes(bem bem1, float f)
    {
        b = bem1;
        a = f;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (bem.n(b).a == bdp.c) goto _L2; else goto _L1
_L1:
        bem.u(b).onTouchEvent(motionevent);
        if (bem.m(b) == bfa.c) goto _L2; else goto _L3
_L3:
        view = new PointF(motionevent.getX(), motionevent.getY());
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 5: default 100
    //                   0 125
    //                   1 912
    //                   2 582
    //                   3 912
    //                   4 100
    //                   5 111;
           goto _L4 _L5 _L6 _L7 _L6 _L4 _L8
_L4:
        bem.b(b, view);
_L2:
        return true;
_L8:
        bem.v(b).removeCallbacksAndMessages(null);
        continue; /* Loop/switch isn't completed */
_L5:
        long l2 = System.currentTimeMillis();
        if (l2 - bem.w(b) >= (long)bem.t() || Math.abs((((PointF) (view)).x - bem.t(b).x) / a) >= 42F || Math.abs((((PointF) (view)).y - bem.t(b).y) / a) >= 42F) goto _L10; else goto _L9
_L9:
        long l;
        motionevent = bem.n(b).f();
        float f = ((PipelineParams) (motionevent)).zoomCenterX;
        float f3 = ((PipelineParams) (motionevent)).zoomCenterY;
        float f6 = ((PipelineParams) (motionevent)).zoomScale;
        float f8 = (float)bem.c(b).getWidth() - ((PipelineParams) (motionevent)).marginLeft - ((PipelineParams) (motionevent)).marginRight;
        float f10;
        boolean flag;
        boolean flag1;
        if (Math.abs(f8 - b.f.width()) < 24F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f10 = (float)bem.c(b).getHeight() - ((PipelineParams) (motionevent)).marginTop - ((PipelineParams) (motionevent)).marginBottom;
        if (Math.abs(f10 - b.f.height()) < 24F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag)
        {
            motionevent.zoomScale = f10 / (b.f.height() / ((PipelineParams) (motionevent)).zoomScale);
        } else
        if (flag1)
        {
            motionevent.zoomScale = f8 / (b.f.width() / ((PipelineParams) (motionevent)).zoomScale);
        } else
        {
            motionevent.zoomScale = 1.0F;
        }
        motionevent.zoomCenterX = 0.5F;
        motionevent.zoomCenterY = 0.5F;
        bgb.a(bem.x(b), bem.n(b), f, f3, f6, 0.5F, 0.5F, ((PipelineParams) (motionevent)).zoomScale);
        mry.a(bem.y(b), 35, (new msn()).a(new msm(pwu.A)).a(bem.z(b)));
        l = 0L;
_L11:
        bem.a(b, view);
        bem.a(b, l);
        continue; /* Loop/switch isn't completed */
_L10:
        bem.a(b, bfa.b);
        bem.v(b).removeCallbacksAndMessages(null);
        l = l2;
        if (motionevent.getPointerCount() == 1)
        {
            bem.v(b).sendEmptyMessageAtTime(bfa.d.f, motionevent.getEventTime() + 250L);
            l = l2;
        }
        if (true) goto _L11; else goto _L7
_L7:
        if (!b.f.isEmpty() && !bem.n(b).i())
        {
            if (bem.m(b) == bfa.a)
            {
                bem.a(b, bfa.b);
                bem.b(b, view);
            }
            float f4 = ((PointF) (view)).x - bem.t(b).x;
            float f1 = ((PointF) (view)).y - bem.t(b).y;
            if (Math.sqrt(f4 * f4 + f1 * f1) / (double)a >= 6D)
            {
                bem.v(b).removeCallbacksAndMessages(null);
                if (bem.o(b) != bey.d)
                {
                    mry.a(bem.A(b), 30, (new msn()).a(new msm(pwu.A)).a(bem.B(b)));
                    bem.a(b, bey.d);
                }
            }
            motionevent = bem.n(b).f();
            if ((f4 != 0.0F || f1 != 0.0F) && ((PipelineParams) (motionevent)).zoomScale != 1.0F)
            {
                float f7 = b.f.width() / ((PipelineParams) (motionevent)).zoomScale;
                float f9 = ((PipelineParams) (motionevent)).zoomCenterX;
                motionevent.zoomCenterX = f4 / f7 / (1.0F - ((PipelineParams) (motionevent)).zoomScale) + f9;
                f4 = b.f.height() / ((PipelineParams) (motionevent)).zoomScale;
                f7 = ((PipelineParams) (motionevent)).zoomCenterY;
                motionevent.zoomCenterY = f1 / f4 / (1.0F - ((PipelineParams) (motionevent)).zoomScale) + f7;
                motionevent = Renderer.zoomCenterForMove(motionevent);
                bem.n(b).a(motionevent);
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        bem.v(b).removeCallbacksAndMessages(null);
        bem.a(b, bfa.a);
        bem.a(b, bey.a);
        if (bem.n(b).i())
        {
            bem.l(b);
        } else
        {
            long l1 = System.currentTimeMillis();
            float f2 = ((PointF) (view)).x - bem.C(b).x;
            float f5 = ((PointF) (view)).y - bem.C(b).y;
            if (l1 - bem.w(b) < 250L && Math.sqrt(f2 * f2 + f5 * f5) / (double)a < 6D)
            {
                bem.v(b).removeCallbacksAndMessages(null);
                if (motionevent.getPointerCount() == 1)
                {
                    bem.v(b).sendEmptyMessageAtTime(bfa.e.f, motionevent.getEventTime() + (long)bem.t());
                }
            }
        }
        if (true) goto _L4; else goto _L12
_L12:
    }
}
