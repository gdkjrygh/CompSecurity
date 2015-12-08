// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.android.slyce.crop:
//            q, n, x, CropImageActivity, 
//            o

class CropImageView extends q
{

    ArrayList a;
    n b;
    float c;
    float d;
    int e;
    private Context q;

    public CropImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        b = null;
        q = context;
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
            n n1 = (n)a.get(i);
            n1.a(false);
            n1.c();
            i++;
        } while (true);
          goto _L1
_L3:
        j++;
_L1:
        n n2;
        if (j >= a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((n2 = (n)a.get(j)).a(motionevent.getX(), motionevent.getY()) == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!n2.a())
        {
            n2.a(true);
            n2.c();
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        invalidate();
        return;
    }

    private void b(n n1)
    {
        n1 = n1.d;
        int i = Math.max(0, this.l - ((Rect) (n1)).left);
        int l = Math.min(0, m - ((Rect) (n1)).right);
        int j = Math.max(0, n - ((Rect) (n1)).top);
        int k = Math.min(0, o - ((Rect) (n1)).bottom);
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

    private void c(n n1)
    {
        Rect rect = n1.d;
        float f = rect.width();
        float f1 = rect.height();
        float f2 = getWidth();
        float f3 = getHeight();
        f = Math.max(1.0F, Math.min((f2 / f) * 0.6F, (f3 / f1) * 0.6F) * a());
        if ((double)(Math.abs(f - a()) / f) > 0.10000000000000001D)
        {
            float af[] = new float[2];
            af[0] = n1.e.centerX();
            af[1] = n1.e.centerY();
            getImageMatrix().mapPoints(af);
            a(f, af[0], af[1], 300F);
        }
        b(n1);
    }

    protected void a(float f, float f1)
    {
        super.a(f, f1);
        for (int i = 0; i < a.size(); i++)
        {
            n n1 = (n)a.get(i);
            n1.f.postTranslate(f, f1);
            n1.c();
        }

    }

    protected void a(float f, float f1, float f2)
    {
        super.a(f, f1, f2);
        n n1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); n1.c())
        {
            n1 = (n)iterator.next();
            n1.f.set(getImageMatrix());
        }

    }

    public void a(n n1)
    {
        a.add(n1);
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        for (int i = 0; i < a.size(); i++)
        {
            ((n)a.get(i)).a(canvas);
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
                n n1 = (n)iterator.next();
                n1.f.set(getImageMatrix());
                n1.c();
                if (n1.b)
                {
                    c(n1);
                }
            } while (true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Object obj;
        obj = (CropImageActivity)q;
        if (((CropImageActivity) (obj)).b)
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
        if (!((CropImageActivity) (obj)).a) goto _L9; else goto _L8
_L8:
        a(motionevent);
          goto _L1
_L9:
        int i = 0;
_L13:
        if (i >= a.size()) goto _L1; else goto _L10
_L10:
        int k;
        obj = (n)a.get(i);
        k = ((n) (obj)).a(motionevent.getX(), motionevent.getY());
        if (k == 1) goto _L12; else goto _L11
_L11:
        e = k;
        b = ((n) (obj));
        c = motionevent.getX();
        d = motionevent.getY();
        n n1 = b;
        if (k == 32)
        {
            obj = o.b;
        } else
        {
            obj = o.c;
        }
        n1.a(((o) (obj)));
          goto _L1
_L12:
        i++;
          goto _L13
_L3:
        if (((CropImageActivity) (obj)).a)
        {
            for (int j = 0; j < a.size(); j++)
            {
                n n2 = (n)a.get(j);
                if (n2.a())
                {
                    obj.c = n2;
                    int l = 0;
                    while (l < a.size()) 
                    {
                        if (l != j)
                        {
                            ((n)a.get(l)).b(true);
                        }
                        l++;
                    }
                    c(n2);
                    ((CropImageActivity)q).a = false;
                    return true;
                }
            }

        } else
        if (b != null)
        {
            c(b);
            b.a(o.a);
        }
        b = null;
          goto _L1
_L4:
        if (((CropImageActivity) (obj)).a)
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
        if (a() == 1.0F)
        {
            a(true, true);
        }
          goto _L5
    }
}
