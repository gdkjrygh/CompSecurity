// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            a, HighlightView, d, CropImage

class CropImageView extends a
{

    ArrayList a;
    HighlightView b;
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
            HighlightView highlightview = (HighlightView)a.get(i);
            highlightview.e = false;
            highlightview.b();
            i++;
        } while (true);
          goto _L1
_L3:
        j++;
_L1:
        HighlightView highlightview1;
        if (j >= a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((highlightview1 = (HighlightView)a.get(j)).a(motionevent.getX(), motionevent.getY()) == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!highlightview1.e)
        {
            highlightview1.e = true;
            highlightview1.b();
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        invalidate();
        return;
    }

    private void b(HighlightView highlightview)
    {
        highlightview = highlightview.g;
        int i = Math.max(0, m - ((Rect) (highlightview)).left);
        int l = Math.min(0, n - ((Rect) (highlightview)).right);
        int j = Math.max(0, o - ((Rect) (highlightview)).top);
        int k = Math.min(0, p - ((Rect) (highlightview)).bottom);
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

    private void c(HighlightView highlightview)
    {
        Rect rect = highlightview.g;
        float f = rect.width();
        float f1 = rect.height();
        float f2 = getWidth();
        float f3 = getHeight();
        f = Math.max(1.0F, Math.min((f2 / f) * 0.6F, (f3 / f1) * 0.6F) * b());
        if ((double)(Math.abs(f - b()) / f) > 0.10000000000000001D)
        {
            float af[] = new float[2];
            af[0] = highlightview.h.centerX();
            af[1] = highlightview.h.centerY();
            getImageMatrix().mapPoints(af);
            b(f, af[0], af[1]);
        }
        b(highlightview);
    }

    protected final void a(float f, float f1)
    {
        super.a(f, f1);
        for (int i = 0; i < a.size(); i++)
        {
            HighlightView highlightview = (HighlightView)a.get(i);
            highlightview.i.postTranslate(f, f1);
            highlightview.b();
        }

    }

    protected final void a(float f, float f1, float f2)
    {
        super.a(f, f1, f2);
        HighlightView highlightview;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); highlightview.b())
        {
            highlightview = (HighlightView)iterator.next();
            highlightview.i.set(getImageMatrix());
        }

    }

    public final void a(HighlightView highlightview)
    {
        a.add(highlightview);
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i = 0;
        do
        {
            if (i < a.size())
            {
                HighlightView highlightview = (HighlightView)a.get(i);
                if (!highlightview.f)
                {
                    Path path = new Path();
                    if (!highlightview.e)
                    {
                        highlightview.c.setColor(0xff000000);
                        canvas.drawRect(highlightview.g, highlightview.c);
                    } else
                    {
                        Rect rect = new Rect();
                        highlightview.d.getDrawingRect(rect);
                        if (highlightview.n)
                        {
                            canvas.save();
                            float f = highlightview.g.width();
                            float f1 = highlightview.g.height();
                            float f2 = highlightview.g.left;
                            float f3 = f / 2.0F;
                            float f4 = highlightview.g.top;
                            path.addCircle(f2 + f3, f1 / 2.0F + f4, f / 2.0F, android.graphics.Path.Direction.CW);
                            highlightview.c.setColor(0xffef04d6);
                            canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
                            Paint paint;
                            int j;
                            int l;
                            int j1;
                            if (highlightview.e)
                            {
                                paint = highlightview.a;
                            } else
                            {
                                paint = highlightview.b;
                            }
                            canvas.drawRect(rect, paint);
                            canvas.restore();
                        } else
                        {
                            Rect rect1 = new Rect(rect.left, rect.top, rect.right, highlightview.g.top);
                            Paint paint1;
                            if (rect1.width() > 0 && rect1.height() > 0)
                            {
                                Rect rect2;
                                Rect rect3;
                                if (highlightview.e)
                                {
                                    paint1 = highlightview.a;
                                } else
                                {
                                    paint1 = highlightview.b;
                                }
                                canvas.drawRect(rect1, paint1);
                            }
                            rect2 = new Rect(rect.left, highlightview.g.bottom, rect.right, rect.bottom);
                            if (rect2.width() > 0 && rect2.height() > 0)
                            {
                                if (highlightview.e)
                                {
                                    paint1 = highlightview.a;
                                } else
                                {
                                    paint1 = highlightview.b;
                                }
                                canvas.drawRect(rect2, paint1);
                            }
                            rect3 = new Rect(rect.left, rect1.bottom, highlightview.g.left, rect2.top);
                            if (rect3.width() > 0 && rect3.height() > 0)
                            {
                                if (highlightview.e)
                                {
                                    paint1 = highlightview.a;
                                } else
                                {
                                    paint1 = highlightview.b;
                                }
                                canvas.drawRect(rect3, paint1);
                            }
                            rect = new Rect(highlightview.g.right, rect1.bottom, rect.right, rect2.top);
                            if (rect.width() > 0 && rect.height() > 0)
                            {
                                if (highlightview.e)
                                {
                                    paint1 = highlightview.a;
                                } else
                                {
                                    paint1 = highlightview.b;
                                }
                                canvas.drawRect(rect, paint1);
                            }
                            path.addRect(new RectF(highlightview.g), android.graphics.Path.Direction.CW);
                            highlightview.c.setColor(Color.rgb(51, 181, 229));
                        }
                        canvas.drawPath(path, highlightview.c);
                        if (highlightview.j == HighlightView.ModifyMode.c)
                        {
                            if (highlightview.n)
                            {
                                j1 = highlightview.q.getIntrinsicWidth();
                                j = highlightview.q.getIntrinsicHeight();
                                l = (int)Math.round(Math.cos(0.78539816339744828D) * ((double)highlightview.g.width() / 2D));
                                j1 = (highlightview.g.left + highlightview.g.width() / 2 + l) - j1 / 2;
                                j = (highlightview.g.top + highlightview.g.height() / 2) - l - j / 2;
                                highlightview.q.setBounds(j1, j, highlightview.q.getIntrinsicWidth() + j1, highlightview.q.getIntrinsicHeight() + j);
                                highlightview.q.draw(canvas);
                            } else
                            {
                                int k = highlightview.g.left + 1;
                                int i1 = highlightview.g.right + 1;
                                int k1 = highlightview.g.top + 4;
                                int l1 = highlightview.g.bottom + 3;
                                int i2 = highlightview.o.getIntrinsicWidth() / 2;
                                int j2 = highlightview.o.getIntrinsicHeight() / 2;
                                int k2 = highlightview.p.getIntrinsicHeight() / 2;
                                int l2 = highlightview.p.getIntrinsicWidth() / 2;
                                int i3 = highlightview.g.left + (highlightview.g.right - highlightview.g.left) / 2;
                                int j3 = highlightview.g.top + (highlightview.g.bottom - highlightview.g.top) / 2;
                                highlightview.o.setBounds(k - i2, j3 - j2, k + i2, j3 + j2);
                                highlightview.o.draw(canvas);
                                highlightview.o.setBounds(i1 - i2, j3 - j2, i1 + i2, j3 + j2);
                                highlightview.o.draw(canvas);
                                highlightview.p.setBounds(i3 - l2, k1 - k2, i3 + l2, k1 + k2);
                                highlightview.p.draw(canvas);
                                highlightview.p.setBounds(i3 - l2, l1 - k2, i3 + l2, l1 + k2);
                                highlightview.p.draw(canvas);
                            }
                        }
                    }
                }
            } else
            {
                return;
            }
            i++;
        } while (true);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (f.a != null)
        {
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                HighlightView highlightview = (HighlightView)iterator.next();
                highlightview.i.set(getImageMatrix());
                highlightview.b();
                if (highlightview.e)
                {
                    c(highlightview);
                }
            } while (true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Object obj;
        boolean flag;
        flag = true;
        obj = (CropImage)q;
        if (!((CropImage) (obj)).c) goto _L2; else goto _L1
_L1:
        flag = false;
_L11:
        return flag;
_L2:
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 56
    //                   0 92
    //                   1 231
    //                   2 391;
           goto _L3 _L4 _L5 _L6
_L3:
        switch (motionevent.getAction())
        {
        default:
            return true;

        case 1: // '\001'
            a();
            return true;

        case 2: // '\002'
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (((CropImage) (obj)).b)
        {
            a(motionevent);
            continue; /* Loop/switch isn't completed */
        }
        int i = 0;
        do
        {
            if (i >= a.size())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (HighlightView)a.get(i);
            int l = ((HighlightView) (obj)).a(motionevent.getX(), motionevent.getY());
            if (l != 1)
            {
                e = l;
                b = ((HighlightView) (obj));
                c = motionevent.getX();
                d = motionevent.getY();
                HighlightView highlightview = b;
                if (l == 32)
                {
                    obj = HighlightView.ModifyMode.b;
                } else
                {
                    obj = HighlightView.ModifyMode.c;
                }
                highlightview.a(((HighlightView.ModifyMode) (obj)));
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
_L5:
        if (((CropImage) (obj)).b)
        {
            for (int j = 0; j < a.size(); j++)
            {
                HighlightView highlightview1 = (HighlightView)a.get(j);
                if (highlightview1.e)
                {
                    obj.d = highlightview1;
                    for (int i1 = 0; i1 < a.size(); i1++)
                    {
                        if (i1 != j)
                        {
                            ((HighlightView)a.get(i1)).f = true;
                        }
                    }

                    c(highlightview1);
                    ((CropImage)q).b = false;
                    return true;
                }
            }

        } else
        if (b != null)
        {
            c(b);
            b.a(HighlightView.ModifyMode.a);
        }
        b = null;
        continue; /* Loop/switch isn't completed */
_L6:
        float f;
        float f1;
        Object obj1;
        int j1;
        if (((CropImage) (obj)).b)
        {
            a(motionevent);
            continue; /* Loop/switch isn't completed */
        }
        if (b == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = b;
        j1 = e;
        f = motionevent.getX() - c;
        f1 = motionevent.getY() - d;
        obj1 = ((HighlightView) (obj)).a();
        if (j1 != 1)
        {
            if (j1 != 32)
            {
                break; /* Loop/switch isn't completed */
            }
            float f2 = ((HighlightView) (obj)).h.width() / (float)((Rect) (obj1)).width();
            float f4 = ((HighlightView) (obj)).h.height() / (float)((Rect) (obj1)).height();
            obj1 = new Rect(((HighlightView) (obj)).g);
            ((HighlightView) (obj)).h.offset(f * f2, f1 * f4);
            ((HighlightView) (obj)).h.offset(Math.max(0.0F, ((HighlightView) (obj)).k.left - ((HighlightView) (obj)).h.left), Math.max(0.0F, ((HighlightView) (obj)).k.top - ((HighlightView) (obj)).h.top));
            ((HighlightView) (obj)).h.offset(Math.min(0.0F, ((HighlightView) (obj)).k.right - ((HighlightView) (obj)).h.right), Math.min(0.0F, ((HighlightView) (obj)).k.bottom - ((HighlightView) (obj)).h.bottom));
            obj.g = ((HighlightView) (obj)).a();
            ((Rect) (obj1)).union(((HighlightView) (obj)).g);
            ((Rect) (obj1)).inset(-10, -10);
            ((HighlightView) (obj)).d.invalidate(((Rect) (obj1)));
        }
_L8:
        c = motionevent.getX();
        d = motionevent.getY();
        b(b);
        if (true) goto _L3; else goto _L7
_L7:
        if ((j1 & 6) == 0)
        {
            f = 0.0F;
        }
        if ((j1 & 0x18) == 0)
        {
            f1 = 0.0F;
        }
        float f5 = ((HighlightView) (obj)).h.width() / (float)((Rect) (obj1)).width();
        float f3 = ((HighlightView) (obj)).h.height() / (float)((Rect) (obj1)).height();
        int k;
        if ((j1 & 2) != 0)
        {
            k = -1;
        } else
        {
            k = 1;
        }
        f = f * f5 * (float)k;
        if ((j1 & 8) != 0)
        {
            k = -1;
        } else
        {
            k = 1;
        }
        f5 = (float)k * (f3 * f1);
        f1 = f5;
        f3 = f;
        if (((HighlightView) (obj)).l)
        {
            if (f != 0.0F)
            {
                f1 = f / ((HighlightView) (obj)).m;
                f3 = f;
            } else
            {
                f1 = f5;
                f3 = f;
                if (f5 != 0.0F)
                {
                    f3 = ((HighlightView) (obj)).m * f5;
                    f1 = f5;
                }
            }
        }
        obj1 = new RectF(((HighlightView) (obj)).h);
        f5 = f1;
        f = f3;
        if (f3 > 0.0F)
        {
            f5 = f1;
            f = f3;
            if (((RectF) (obj1)).width() + 2.0F * f3 > ((HighlightView) (obj)).k.width())
            {
                f3 = (((HighlightView) (obj)).k.width() - ((RectF) (obj1)).width()) / 2.0F;
                f5 = f1;
                f = f3;
                if (((HighlightView) (obj)).l)
                {
                    f5 = f3 / ((HighlightView) (obj)).m;
                    f = f3;
                }
            }
        }
        f1 = f5;
        f3 = f;
        if (f5 > 0.0F)
        {
            f1 = f5;
            f3 = f;
            if (((RectF) (obj1)).height() + 2.0F * f5 > ((HighlightView) (obj)).k.height())
            {
                f5 = (((HighlightView) (obj)).k.height() - ((RectF) (obj1)).height()) / 2.0F;
                f1 = f5;
                f3 = f;
                if (((HighlightView) (obj)).l)
                {
                    f3 = ((HighlightView) (obj)).m * f5;
                    f1 = f5;
                }
            }
        }
        ((RectF) (obj1)).inset(-f3, -f1);
        if (((RectF) (obj1)).width() < 25F)
        {
            ((RectF) (obj1)).inset(-(25F - ((RectF) (obj1)).width()) / 2.0F, 0.0F);
        }
        if (((HighlightView) (obj)).l)
        {
            f = 25F / ((HighlightView) (obj)).m;
        } else
        {
            f = 25F;
        }
        if (((RectF) (obj1)).height() < f)
        {
            ((RectF) (obj1)).inset(0.0F, -(f - ((RectF) (obj1)).height()) / 2.0F);
        }
        if (((RectF) (obj1)).left < ((HighlightView) (obj)).k.left)
        {
            ((RectF) (obj1)).offset(((HighlightView) (obj)).k.left - ((RectF) (obj1)).left, 0.0F);
        } else
        if (((RectF) (obj1)).right > ((HighlightView) (obj)).k.right)
        {
            ((RectF) (obj1)).offset(-(((RectF) (obj1)).right - ((HighlightView) (obj)).k.right), 0.0F);
        }
        if (((RectF) (obj1)).top < ((HighlightView) (obj)).k.top)
        {
            ((RectF) (obj1)).offset(0.0F, ((HighlightView) (obj)).k.top - ((RectF) (obj1)).top);
        } else
        if (((RectF) (obj1)).bottom > ((HighlightView) (obj)).k.bottom)
        {
            ((RectF) (obj1)).offset(0.0F, -(((RectF) (obj1)).bottom - ((HighlightView) (obj)).k.bottom));
        }
        ((HighlightView) (obj)).h.set(((RectF) (obj1)));
        obj.g = ((HighlightView) (obj)).a();
        ((HighlightView) (obj)).d.invalidate();
          goto _L8
        if (true) goto _L3; else goto _L9
_L9:
        if (b() != 1.0F) goto _L11; else goto _L10
_L10:
        a();
        return true;
    }
}
