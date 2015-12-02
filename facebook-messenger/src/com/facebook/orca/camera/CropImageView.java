// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.widget.images.e;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.camera:
//            s, m, CropImage, n

class CropImageView extends s
{

    ArrayList a;
    m b;
    float c;
    float d;
    int e;

    public CropImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        b = null;
    }

    private void a(MotionEvent motionevent)
    {
        int j;
        boolean flag = false;
        int i = 0;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= a.size())
            {
                break;
            }
            m m1 = (m)a.get(i);
            m1.a(false);
            m1.c();
            i++;
        } while (true);
          goto _L1
_L3:
        j++;
_L1:
        m m2;
        if (j >= a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((m2 = (m)a.get(j)).a(motionevent.getX(), motionevent.getY()) == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!m2.a())
        {
            m2.a(true);
            m2.c();
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        invalidate();
        return;
    }

    private void b(m m1)
    {
        m1 = m1.d;
        int i = Math.max(0, getLeft() - ((Rect) (m1)).left);
        int l = Math.min(0, getRight() - ((Rect) (m1)).right);
        int j = Math.max(0, getTop() - ((Rect) (m1)).top);
        int k = Math.min(0, getBottom() - ((Rect) (m1)).bottom);
        if (i == 0)
        {
            i = l;
        }
        if (j == 0)
        {
            j = k;
        }
        if (i != 0 || j != 0)
        {
            b(i, j);
        }
    }

    private void c(m m1)
    {
        Rect rect = m1.d;
        float f = rect.width();
        float f1 = rect.height();
        float f2 = getWidth();
        float f3 = getHeight();
        f = Math.max(1.0F, Math.min((f2 / f) * 0.6F, (f3 / f1) * 0.6F) * b());
        if ((double)(Math.abs(f - b()) / f) > 0.10000000000000001D)
        {
            float af[] = new float[2];
            af[0] = m1.e.centerX();
            af[1] = m1.e.centerY();
            getImageMatrix().mapPoints(af);
            a(f, af[0], af[1], 300F);
        }
        b(m1);
    }

    protected void a(float f, float f1)
    {
        super.a(f, f1);
        for (int i = 0; i < a.size(); i++)
        {
            m m1 = (m)a.get(i);
            m1.f.postTranslate(f, f1);
            m1.c();
        }

    }

    protected void a(float f, float f1, float f2)
    {
        super.a(f, f1, f2);
        m m1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); m1.c())
        {
            m1 = (m)iterator.next();
            m1.f.set(getImageMatrix());
        }

    }

    public void a(m m1)
    {
        a.add(m1);
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        for (int i = 0; i < a.size(); i++)
        {
            ((m)a.get(i)).a(canvas);
        }

    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (h.b() != null)
        {
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                m m1 = (m)iterator.next();
                m1.f.set(getImageMatrix());
                m1.c();
                if (m1.b)
                {
                    c(m1);
                }
            } while (true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Object obj;
        obj = (CropImage)getContext();
        if (((CropImage) (obj)).b)
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 48
    //                   0 78
    //                   1 208
    //                   2 365;
           goto _L1 _L2 _L3 _L4
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 1 2: default 76
    //                   1 443
    //                   2 452;
           goto _L5 _L6 _L7
_L5:
        return true;
_L2:
        if (!((CropImage) (obj)).a) goto _L9; else goto _L8
_L8:
        a(motionevent);
          goto _L1
_L9:
        int i = 0;
_L13:
        if (i >= a.size()) goto _L1; else goto _L10
_L10:
        int k;
        obj = (m)a.get(i);
        k = ((m) (obj)).a(motionevent.getX(), motionevent.getY());
        if (k == 1) goto _L12; else goto _L11
_L11:
        e = k;
        b = ((m) (obj));
        c = motionevent.getX();
        d = motionevent.getY();
        m m1 = b;
        if (k == 32)
        {
            obj = n.Move;
        } else
        {
            obj = n.Grow;
        }
        m1.a(((n) (obj)));
          goto _L1
_L12:
        i++;
          goto _L13
_L3:
        if (((CropImage) (obj)).a)
        {
            for (int j = 0; j < a.size(); j++)
            {
                m m2 = (m)a.get(j);
                if (m2.a())
                {
                    obj.c = m2;
                    int l = 0;
                    while (l < a.size()) 
                    {
                        if (l != j)
                        {
                            ((m)a.get(l)).b(true);
                        }
                        l++;
                    }
                    c(m2);
                    ((CropImage)getContext()).a = false;
                    return true;
                }
            }

        } else
        if (b != null)
        {
            c(b);
            b.a(n.None);
        }
        b = null;
          goto _L1
_L4:
        if (((CropImage) (obj)).a)
        {
            a(motionevent);
        } else
        if (b != null)
        {
            b.a(e, motionevent.getX() - c, motionevent.getY() - d);
            c = motionevent.getX();
            d = motionevent.getY();
            b(b);
        }
          goto _L1
_L6:
        a(true, true);
          goto _L5
_L7:
        if (b() == 1.0F)
        {
            a(true, true);
        }
          goto _L5
    }
}
