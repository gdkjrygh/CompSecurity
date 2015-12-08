// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

public final class gnh
    implements iwe
{

    boolean a;
    private gni b;
    private PointF c;
    private PointF d;
    private final float e;
    private float f;
    private long g;
    private boolean h;

    public gnh(gni gni1, Resources resources, float f1)
    {
        d = new PointF();
        b = gni1;
        e = f1;
        f = TypedValue.applyDimension(1, 12F, resources.getDisplayMetrics());
    }

    public final boolean a(MotionEvent motionevent)
    {
        if (!b.ay_()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (motionevent.getActionMasked())
        {
        case 4: // '\004'
        default:
            return false;

        case 0: // '\0'
            c = new PointF(motionevent.getX(), motionevent.getY());
            if (b.az_())
            {
                h = true;
                d.set(motionevent.getX(), motionevent.getY());
                g = AnimationUtils.currentAnimationTimeMillis();
            } else
            {
                h = false;
            }
            a = false;
            return false;

        case 5: // '\005'
            h = false;
            return false;

        case 2: // '\002'
            if (c != null)
            {
                double d1 = b.a(c.x, c.y, motionevent.getX(), motionevent.getY());
                if (h && d1 > (double)f)
                {
                    h = false;
                    float f1 = motionevent.getX();
                    float f3 = c.x;
                    double d2 = Math.toDegrees(Math.atan2(motionevent.getY() - c.y, f1 - f3));
                    double d3 = -90F - e / 2.0F;
                    double d4 = e / 2.0F - 90F;
                    double d5 = 90F - e / 2.0F;
                    double d6 = e / 2.0F + 90F;
                    if (d2 >= d3 && d2 <= d4 || d2 >= d5 && d2 <= d6)
                    {
                        a = true;
                        PointF pointf = new PointF(motionevent.getX(), motionevent.getY());
                        float f2 = (float)b.a(d.x, d.y, motionevent.getX(), motionevent.getY()) / ((float)(AnimationUtils.currentAnimationTimeMillis() - g) / 1000F);
                        b.a(pointf, f2, (float)Math.toDegrees(Math.atan2(motionevent.getY() - d.y, motionevent.getX() - d.x)));
                        return true;
                    }
                } else
                if (a)
                {
                    return b.a(motionevent);
                }
                d.set(motionevent.getX(), motionevent.getY());
                g = AnimationUtils.currentAnimationTimeMillis();
                return false;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
        case 6: // '\006'
            if (a)
            {
                return b.a(motionevent);
            } else
            {
                c = null;
                return false;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
