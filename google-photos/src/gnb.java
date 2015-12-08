// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public final class gnb
    implements android.view.View.OnTouchListener
{

    public float a;
    public float b;
    private ImageView c;
    private View d;
    private Resources e;
    private gnc f;
    private PointF g;
    private PointF h;
    private PointF i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private final PointF p = new PointF();
    private long q;
    private int r;
    private int s;
    private int t;

    public gnb(ImageView imageview, View view, float f1, int i1, int j1, float f2, Resources resources, 
            gnc gnc1)
    {
        m = 0.0F;
        n = -1F;
        o = 1.401298E-45F;
        c = imageview;
        d = view;
        a = f1;
        s = i1;
        t = j1;
        b = f2;
        e = resources;
        f = gnc1;
    }

    public final void a(PointF pointf, float f1, float f2)
    {
        h = null;
        g = pointf;
        n = f1;
        o = f2;
        p.set(pointf.x, pointf.y);
        q = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        int i1;
        boolean flag = false;
        i1 = ((flag) ? 1 : 0);
        if (h == null)
        {
            r = motionevent.getPointerId(0);
            h = new PointF(motionevent.getX(0), motionevent.getY(0));
            i = new PointF(c.getTranslationX(), c.getTranslationY());
            k = TypedValue.applyDimension(1, 10F, e.getDisplayMetrics());
            j = TypedValue.applyDimension(1, 60F, e.getDisplayMetrics());
            l = TypedValue.applyDimension(1, 120F, e.getDisplayMetrics());
            i1 = ((flag) ? 1 : 0);
        }
_L9:
        if (i1 >= motionevent.getPointerCount()) goto _L2; else goto _L1
_L1:
        if (motionevent.getPointerId(i1) != r) goto _L4; else goto _L3
_L3:
        float f1;
        float f2;
        f2 = motionevent.getX(i1);
        f1 = motionevent.getY(i1);
_L10:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 1 6: default 204
    //                   1 530
    //                   2 215
    //                   3 204
    //                   4 204
    //                   5 204
    //                   6 515;
           goto _L5 _L6 _L7 _L5 _L5 _L5 _L8
_L5:
        return true;
_L4:
        i1++;
          goto _L9
_L7:
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        n = (float)b.a(p.x, p.y, f2, f1) / ((float)(l1 - q) / 1000F);
        c.setTranslationX(i.x + (f2 - h.x));
        c.setTranslationY(i.y + (f1 - h.y));
        float f3 = Math.max(0.0F, Math.min(1.0F, ((float)b.a(f2, f1, h.x, h.y) - k) / j));
        float f4 = 1.0F - (1.0F - b) * f3;
        c.setScaleX(a * f4);
        c.setScaleY(f4 * a);
        int j1 = Color.argb(Math.round((1.0F - f3) * (float)t), Color.red(s), Color.green(s), Color.blue(s));
        if (f.d())
        {
            d.setBackgroundColor(j1);
            f.a(f3);
        }
        m = f3;
        o = (float)Math.toDegrees(Math.atan2(f1 - p.y, f2 - p.x));
        p.set(f2, f1);
        q = l1;
        return true;
_L8:
        if (motionevent.getPointerId(motionevent.getActionIndex()) != r) goto _L5; else goto _L6
_L6:
        if (n > l)
        {
            if (p.equals(g))
            {
                f.a();
                return true;
            }
            f1 = (float)Math.toDegrees(Math.atan2(p.y - g.y, p.x - g.x));
            if (f1 < -90F || f1 > 90F)
            {
                if (f1 < -90F)
                {
                    f1 += 270F;
                } else
                {
                    f1 -= 90F;
                }
                if (o <= f1 && o >= f1 - 180F)
                {
                    f.c();
                    return true;
                } else
                {
                    f.a();
                    return true;
                }
            }
            f1 += 90F;
            if (o > f1 || o < f1 - 180F)
            {
                f.c();
                return true;
            } else
            {
                f.a();
                return true;
            }
        }
        if (m >= 1.0F)
        {
            f.a();
            return true;
        } else
        {
            f.c();
            return true;
        }
_L2:
        f1 = 0.0F;
        f2 = 0.0F;
          goto _L10
    }
}
