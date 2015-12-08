// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.Scroller;

public class dcq extends dcd
{

    public dcr c;
    private final Scroller d;
    private final EdgeEffect e;
    private final EdgeEffect f;
    private final int g;
    private final Matrix h = new Matrix();
    private int i;
    private int j;
    private long k;

    public dcq(dbc dbc1)
    {
        super(dbc1, true);
        k = 0x8000000000000000L;
        dbc1 = dbc1.e();
        g = dbc1.getResources().getDimensionPixelSize(b.dC);
        d = new Scroller(dbc1);
        e = new EdgeEffect(dbc1);
        f = new EdgeEffect(dbc1);
    }

    private static boolean a(dbd dbd1, float f1)
    {
        return f1 == 0.0F || f1 > 0.0F && !dbd1.j || f1 < 0.0F && !dbd1.k;
    }

    protected final void a()
    {
        if (c != null)
        {
            c.a(k);
        }
    }

    public final void a(dbd dbd1)
    {
        int i1 = i;
        i = 0;
        int l;
        if (d.computeScrollOffset())
        {
            l = d.getCurrX();
            int j1 = l - j;
            j = l;
            l = j1;
            if (!a(dbd1, j1))
            {
                EdgeEffect edgeeffect;
                if (j1 > 0)
                {
                    edgeeffect = e;
                } else
                {
                    edgeeffect = f;
                }
                edgeeffect.onAbsorb((int)d.getCurrVelocity());
                a.d();
                d.forceFinished(true);
                l = 0;
            }
            l += i1;
        } else
        {
            l = i1;
        }
        dbd1.i = dbd1.i - l;
        if (!d.isFinished())
        {
            a.c();
        }
    }

    public final void a(dbd dbd1, Canvas canvas)
    {
        boolean flag = false;
        canvas.save();
        int l;
        if (!e.isFinished())
        {
            EdgeEffect edgeeffect = e;
            boolean flag1;
            if (dbd1.a)
            {
                l = canvas.getHeight();
            } else
            {
                l = canvas.getWidth();
            }
            edgeeffect.setSize(l, g);
            h.reset();
            if (dbd1.a)
            {
                h.postRotate(-90F);
                h.postTranslate(0.0F, canvas.getHeight());
            }
            h.postTranslate(dbd1.e.left, dbd1.e.top);
            canvas.setMatrix(h);
            flag = e.draw(canvas);
        }
        flag1 = flag;
        if (!f.isFinished())
        {
            edgeeffect = f;
            if (dbd1.a)
            {
                l = canvas.getHeight();
            } else
            {
                l = canvas.getWidth();
            }
            edgeeffect.setSize(l, g);
            h.reset();
            if (dbd1.a)
            {
                h.postRotate(90F);
                h.postTranslate(canvas.getWidth(), 0.0F);
            } else
            {
                h.postRotate(180F);
                h.postTranslate(canvas.getWidth(), canvas.getHeight());
            }
            h.postTranslate(dbd1.e.left, dbd1.e.top);
            canvas.setMatrix(h);
            flag1 = flag | f.draw(canvas);
        }
        canvas.restore();
        if (flag1)
        {
            a.d();
        }
    }

    protected final boolean a(dbd dbd1, int l, int i1)
    {
        int j1;
        d.forceFinished(true);
        d.setFinalX(0);
        j = 0;
        e.finish();
        f.finish();
        View view;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (dbd1.a)
        {
            l += dbd1.i;
        } else
        {
            i1 += dbd1.i;
        }
        k1 = dbd1.c.size();
        j1 = 0;
_L3:
        if (j1 >= k1)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        view = ((dba)dbd1.c.valueAt(j1)).a;
        l1 = (int)view.getX();
        i2 = (int)view.getY();
        j2 = view.getMeasuredWidth();
        k2 = view.getMeasuredHeight();
        if (l < l1 || i1 < i2 || l >= j2 + l1 || i1 >= k2 + i2) goto _L2; else goto _L1
_L1:
        l = dbd1.c.keyAt(j1);
_L4:
        long l2;
        if (l != -1)
        {
            l2 = ((dba)dbd1.c.get(l)).b;
        } else
        {
            l2 = 0x8000000000000000L;
        }
        k = l2;
        return true;
_L2:
        j1++;
          goto _L3
        l = -1;
          goto _L4
    }

    protected final void b()
    {
        e.onRelease();
        f.onRelease();
        k = 0x8000000000000000L;
    }

    protected final void c(dbd dbd1, int l)
    {
        if (c != null && !super.b)
        {
            c.a(k);
        }
        if (a(dbd1, l))
        {
            d.fling(0, 0, l, 0, 0x80000000, 0x7fffffff, 0, 0);
        }
        a.c();
    }

    protected final void d(dbd dbd1, int l)
    {
        if (a(dbd1, l))
        {
            i = i + l;
            a.c();
        } else
        {
            int i1;
            if (dbd1.a)
            {
                i1 = dbd1.d.width();
            } else
            {
                i1 = dbd1.d.height();
            }
            if (l != 0 && i1 != 0)
            {
                float f1 = (float)l / (float)i1;
                if (l > 0)
                {
                    dbd1 = e;
                } else
                {
                    dbd1 = f;
                }
                dbd1.onPull(Math.abs(f1));
                a.d();
                return;
            }
        }
    }
}
