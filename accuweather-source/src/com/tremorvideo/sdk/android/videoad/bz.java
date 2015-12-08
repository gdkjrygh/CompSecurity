// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bk, ea, cf, gd, 
//            ca, ct, cb, cc, 
//            cd, ce

public class bz
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/bz$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("Left", 0);
            b = new a("Middle", 1);
            c = new a("Right", 2);
            d = new a("Solo", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }

    private class b extends View
    {

        a a;
        Bitmap b;
        boolean c;
        TextPaint d;
        String e;
        boolean f;
        float g;
        Timer h;
        long i;
        final bz j;

        private void a(Canvas canvas)
        {
            Bitmap bitmap;
            Bitmap bitmap1;
            Bitmap bitmap2;
            if (c)
            {
                bitmap = j.a[3];
            } else
            {
                bitmap = j.a[1];
            }
            if (c)
            {
                bitmap1 = j.a[6];
            } else
            {
                bitmap1 = j.a[0];
            }
            if (c)
            {
                bitmap2 = j.a[7];
            } else
            {
                bitmap2 = j.a[2];
            }
            if (a == a.b)
            {
                a(canvas, bitmap, new Rect(0, 0, bitmap1.getWidth(), bitmap.getHeight()));
                a(canvas, bitmap, bitmap1.getWidth(), 0);
            } else
            {
                if (a == a.a)
                {
                    a(canvas, bitmap1, 0, 0);
                    a(canvas, bitmap, bitmap1.getWidth(), 0);
                    return;
                }
                if (a == a.c)
                {
                    a(canvas, bitmap, 0, 0);
                    a(canvas, bitmap2, bitmap.getWidth(), 0);
                    return;
                }
                if (a == a.d)
                {
                    a(canvas, bitmap1, 0, 0);
                    a(canvas, bitmap, bitmap1.getWidth(), 0);
                    int i1 = bitmap1.getWidth();
                    a(canvas, bitmap2, bitmap.getWidth() + i1, 0);
                    return;
                }
            }
        }

        private void a(Canvas canvas, Bitmap bitmap, int i1, int j1)
        {
            if (!f)
            {
                canvas.drawBitmap(bitmap, i1, j1, null);
                return;
            } else
            {
                Matrix matrix = new Matrix();
                matrix.postTranslate(0.0F, -bitmap.getHeight());
                matrix.postScale(1.0F, -1F);
                matrix.postTranslate(i1, j1);
                canvas.drawBitmap(bitmap, matrix, null);
                return;
            }
        }

        private void a(Canvas canvas, Bitmap bitmap, Rect rect)
        {
            if (!f)
            {
                canvas.drawBitmap(bitmap, rect, rect, null);
                return;
            }
            canvas.save(2);
            if (canvas.clipRect(rect))
            {
                Matrix matrix = new Matrix();
                matrix.postTranslate(0.0F, -bitmap.getHeight());
                matrix.postScale(1.0F, -1F);
                matrix.postTranslate(rect.left, rect.top);
                canvas.drawBitmap(bitmap, matrix, null);
            }
            canvas.restore();
        }

        private int b()
        {
            int i1 = 0;
            Bitmap bitmap = j.a[1];
            Bitmap bitmap1 = j.a[0];
            Bitmap bitmap2 = j.a[0];
            if (a == a.a)
            {
                i1 = bitmap1.getWidth() + bitmap.getWidth();
            } else
            {
                if (a == a.c)
                {
                    return bitmap2.getWidth() + bitmap.getWidth();
                }
                if (a == a.b)
                {
                    return bitmap1.getWidth() + bitmap.getWidth();
                }
                if (a == a.d)
                {
                    return bitmap1.getWidth() + bitmap2.getWidth() + bitmap.getWidth();
                }
            }
            return i1;
        }

        private int c()
        {
            return j.a[1].getHeight();
        }

        public void a()
        {
            i = GregorianCalendar.getInstance().getTimeInMillis();
            g = 3F;
            h = new Timer();
            h.scheduleAtFixedRate(new ce(this), 10L, 10L);
        }

        public void a(boolean flag)
        {
            f = flag;
        }

        public void b(boolean flag)
        {
            if (c != flag)
            {
                c = flag;
                invalidate();
            }
        }

        protected void onDraw(Canvas canvas)
        {
            int j1 = b();
            int k1 = c();
            a(canvas);
            float f1 = g;
            float f2 = (int)g;
            float f3 = Math.round(-15F * ct.I());
            f1 = (float)(Math.sin((double)(f1 - f2) * 3.1415926535897931D) * (double)f3);
            if (b == null)
            {
                Rect rect = new Rect();
                d.getTextBounds(e, 0, e.length(), rect);
                f2 = (j1 - rect.width()) / 2;
                f3 = (k1 - rect.height()) / 2;
                canvas.drawText(e, f2, f3 + 10F + f1, d);
                return;
            }
            Rect rect1;
            int i1;
            byte byte0;
            int l1;
            if (f)
            {
                i1 = 0;
            } else
            {
                i1 = -5;
            }
            if (f)
            {
                byte0 = 5;
            } else
            {
                byte0 = 0;
            }
            rect1 = new Rect();
            d.getTextBounds(e, 0, e.length(), rect1);
            l1 = Math.round(d.getTextSize() + (float)d.baselineShift);
            f2 = (float)(j1 - b.getWidth()) / 2.0F;
            f3 = (k1 - (byte0 + l1) - b.getHeight()) / 2;
            canvas.drawBitmap(b, f2, f3 + f1, null);
            f1 = (j1 - rect1.width()) / 2;
            f2 = k1 - l1 - i1;
            canvas.drawText(e, f1, f2, d);
        }

        protected void onMeasure(int i1, int j1)
        {
            Bitmap bitmap = j.a[1];
            setMeasuredDimension(b(), bitmap.getHeight());
        }

        public b(Context context, Bitmap bitmap, String s, a a1)
        {
            j = bz.this;
            super(context);
            a = a1;
            b = bitmap;
            e = s;
            g = 0.0F;
            c = false;
            f = false;
            d = new TextPaint();
            d.setTextSize(ct.G());
            d.setColor(bz.this.j.a(gd.a.a));
            d.setTypeface(Typeface.create("helvetica", 1));
            d.setShadowLayer(5F, 0.0F, 0.0F, bz.this.j.a(gd.a.b));
            d.setAntiAlias(true);
            e = (String)TextUtils.ellipsize(e, d, bz.this.a[1].getWidth() - 5, android.text.TextUtils.TruncateAt.END);
            setOnTouchListener(new cb(this, bz.this));
            setOnFocusChangeListener(new cc(this, bz.this));
            setOnKeyListener(new cd(this, bz.this));
        }
    }

    private class c
        implements Runnable
    {

        View a;
        boolean b;
        final bz c;

        public void run()
        {
            if (!b)
            {
                b = true;
                TranslateAnimation translateanimation = new TranslateAnimation(0, 0.0F, 0, 0.0F, 1, 1.0F, 1, 0.0F);
                translateanimation.setInterpolator(new DecelerateInterpolator());
                translateanimation.setDuration(1000L);
                a.setVisibility(0);
                a.startAnimation(translateanimation);
                a.getParent().requestLayout();
            }
        }

        c(View view)
        {
            c = bz.this;
            super();
            b = false;
            a = view;
            a.setVisibility(4);
        }
    }


    static int l = 20;
    Bitmap a[];
    int b;
    int c;
    View d;
    View e;
    boolean f;
    Context g;
    int h;
    android.view.View.OnClickListener i;
    gd j;
    List k;

    public bz(Context context, android.view.View.OnClickListener onclicklistener, bk bk1, int i1)
    {
        a = new Bitmap[8];
        g = context;
        i = onclicklistener;
        h = i1;
        e = null;
        f = false;
        j = bk1.r();
        k = new ArrayList();
        j();
        c = a(bk1.L());
        b = a(a, bk1.H(), i1);
        context = new LinearLayout(g);
        b(context, 10);
        onclicklistener = bk1.L().iterator();
        int j1 = 0;
        do
        {
label0:
            {
                if (onclicklistener.hasNext())
                {
                    Object obj = (ea)onclicklistener.next();
                    i1 = j1;
                    if (((ea) (obj)).m())
                    {
                        j1++;
                        if (Math.min(c, b) == 1)
                        {
                            a(context, ((ea) (obj)), a.d);
                        } else
                        if (j1 == 1)
                        {
                            a(context, ((ea) (obj)), a.a);
                        } else
                        if (j1 < c && j1 < b)
                        {
                            a(context, ((ea) (obj)), a.b);
                        } else
                        {
                            a(context, ((ea) (obj)), a.c);
                        }
                        i1 = j1;
                        if (j1 < c)
                        {
                            i1 = j1;
                            if (j1 < b)
                            {
                                a(context, 5);
                                i1 = j1;
                            }
                        }
                    }
                    if (i1 < b)
                    {
                        break label0;
                    }
                }
                if (bk1.H())
                {
                    onclicklistener = new View(g);
                    onclicklistener.setVisibility(4);
                    onclicklistener.setFocusable(false);
                    obj = new android.widget.LinearLayout.LayoutParams(0, 0);
                    obj.weight = 1.0F;
                    context.addView(onclicklistener, ((android.view.ViewGroup.LayoutParams) (obj)));
                    a(context, bk1);
                    b(context, 10);
                }
                d = context;
                d.setFocusableInTouchMode(false);
                d.setFocusable(false);
                i();
                return;
            }
            j1 = i1;
        } while (true);
    }

    public bz(Context context, android.view.View.OnClickListener onclicklistener, bk bk1, int i1, int j1)
    {
        a = new Bitmap[8];
        g = context;
        i = onclicklistener;
        h = j1;
        e = null;
        f = true;
        j = bk1.r();
        k = new ArrayList();
        j();
        int k1 = a(bk1.L());
        c = i1;
        b = a(a, false, j1);
        onclicklistener = new LinearLayout(g);
        b(onclicklistener, 10);
        bk1 = bk1.L().iterator();
        j1 = 0;
        k1 -= i1;
        i1 = j1;
        do
        {
label0:
            {
                if (bk1.hasNext())
                {
                    context = (ea)bk1.next();
                    j1 = i1;
                    if (context.m())
                    {
                        if (k1 > 0)
                        {
                            k1--;
                            continue;
                        }
                        i1++;
                        if (Math.min(c, b) == 1)
                        {
                            context = a(onclicklistener, context, a.d);
                        } else
                        if (i1 == 1)
                        {
                            context = a(onclicklistener, context, a.a);
                        } else
                        if (i1 < c && i1 < b)
                        {
                            context = a(onclicklistener, context, a.b);
                        } else
                        {
                            context = a(onclicklistener, context, a.c);
                        }
                        if (context != null)
                        {
                            context.a(true);
                        }
                        j1 = i1;
                        if (i1 < c)
                        {
                            j1 = i1;
                            if (i1 < b)
                            {
                                a(onclicklistener, 5);
                                j1 = i1;
                            }
                        }
                    }
                    if (j1 < b)
                    {
                        break label0;
                    }
                }
                d = onclicklistener;
                d.setFocusableInTouchMode(false);
                d.setFocusable(true);
                i();
                return;
            }
            i1 = j1;
        } while (true);
    }

    public bz(Context context, android.view.View.OnClickListener onclicklistener, List list, gd gd1, boolean flag, String s, int i1)
    {
        a = new Bitmap[8];
        g = context;
        i = onclicklistener;
        h = i1;
        e = null;
        f = false;
        j = gd1;
        k = new ArrayList();
        j();
        c = list.size();
        b = a(a, flag, i1);
        onclicklistener = new LinearLayout(g);
        b(onclicklistener, 10);
        context = list.iterator();
        i1 = 0;
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            list = (cf)context.next();
            int j1 = i1 + 1;
            gd1 = j.a(((cf) (list)).b);
            if (Math.min(c, b) == 1)
            {
                a(onclicklistener, ((cf) (list)).a, gd1, a.d);
            } else
            if (j1 == 1)
            {
                a(onclicklistener, ((cf) (list)).a, gd1, a.a);
            } else
            if (j1 < c)
            {
                a(onclicklistener, ((cf) (list)).a, gd1, a.b);
            } else
            {
                a(onclicklistener, ((cf) (list)).a, gd1, a.c);
            }
            if (j1 < c)
            {
                a(onclicklistener, 5);
            }
            i1 = j1;
        } while (j1 < b);
        if (flag)
        {
            context = new View(g);
            context.setVisibility(4);
            list = new android.widget.LinearLayout.LayoutParams(0, 0);
            list.weight = 1.0F;
            onclicklistener.addView(context, list);
            context = s;
            if (s == null)
            {
                context = ea.b(ea.b.v);
            }
            e = a(onclicklistener, context, j.a(gd.b.i), a.d);
            b(onclicklistener, 10);
        }
        d = onclicklistener;
        d.setFocusableInTouchMode(false);
        d.setFocusable(true);
        i();
    }

    public bz(Context context, android.view.View.OnClickListener onclicklistener, ea.b ab[], gd gd1, boolean flag, String s, int i1)
    {
        a = new Bitmap[8];
        g = context;
        i = onclicklistener;
        h = i1;
        e = null;
        f = false;
        j = gd1;
        k = new ArrayList();
        j();
        c = ab.length;
        b = a(a, flag, i1);
        onclicklistener = new LinearLayout(g);
        b(onclicklistener, 10);
        int j1 = 0;
        int k1 = ab.length;
        i1 = 0;
        do
        {
label0:
            {
                if (i1 < k1)
                {
                    gd1 = ab[i1];
                    j1++;
                    context = gd1.c();
                    gd1 = j.a(gd1.b());
                    if (Math.min(c, b) == 1)
                    {
                        a(onclicklistener, context, gd1, a.d);
                    } else
                    if (j1 == 1)
                    {
                        a(onclicklistener, context, gd1, a.a);
                    } else
                    if (j1 < c)
                    {
                        a(onclicklistener, context, gd1, a.b);
                    } else
                    {
                        a(onclicklistener, context, gd1, a.c);
                    }
                    if (j1 < c)
                    {
                        a(onclicklistener, 5);
                    }
                    if (j1 < b)
                    {
                        break label0;
                    }
                }
                if (flag)
                {
                    context = new View(g);
                    context.setVisibility(4);
                    ab = new android.widget.LinearLayout.LayoutParams(0, 0);
                    ab.weight = 1.0F;
                    onclicklistener.addView(context, ab);
                    context = s;
                    if (s == null)
                    {
                        context = ea.b(ea.b.v);
                    }
                    e = a(onclicklistener, context, j.a(gd.b.i), a.d);
                    b(onclicklistener, 10);
                }
                d = onclicklistener;
                d.setFocusableInTouchMode(false);
                d.setFocusable(false);
                i();
                return;
            }
            i1++;
        } while (true);
    }

    private static int a(List list)
    {
        list = list.iterator();
        int i1 = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (((ea)list.next()).m())
            {
                i1++;
            }
        } while (true);
        return i1;
    }

    private static int a(Bitmap abitmap[], boolean flag, int i1)
    {
        int j1 = abitmap[0].getWidth();
        int k1 = abitmap[2].getWidth() + j1;
        j1 = i1 - k1 - 20;
        i1 = j1;
        if (flag)
        {
            i1 = j1 - (k1 + 5) - abitmap[1].getWidth();
        }
        return i1 / (abitmap[0].getWidth() + abitmap[1].getWidth() + abitmap[5].getWidth());
    }

    private b a(LinearLayout linearlayout, ea ea1, a a1)
    {
        Bitmap bitmap1 = j.a(ea1.p());
        Bitmap bitmap = bitmap1;
        if (bitmap1 == null)
        {
            bitmap = j.a(ea1.a().b());
        }
        a1 = new b(g, bitmap, ea1.i(), a1);
        int i1 = l;
        l = i1 + 1;
        a1.setId(i1);
        a1.setTag(ea1);
        a1.setVisibility(0);
        a1.setFocusable(false);
        a1.setFocusableInTouchMode(false);
        a1.setOnClickListener(i);
        linearlayout.addView(a1);
        k.add(a1);
        return a1;
    }

    private b a(LinearLayout linearlayout, String s, Bitmap bitmap, a a1)
    {
        bitmap = new b(g, bitmap, s, a1);
        int i1 = l;
        l = i1 + 1;
        bitmap.setId(i1);
        bitmap.setTag(s);
        bitmap.setVisibility(0);
        bitmap.setFocusable(false);
        bitmap.setFocusableInTouchMode(false);
        bitmap.setOnClickListener(i);
        k.add(bitmap);
        linearlayout.addView(bitmap);
        return bitmap;
    }

    private void a(LinearLayout linearlayout, int i1)
    {
        ImageView imageview = new ImageView(g);
        imageview.setImageDrawable(new ca(this, a[i1]));
        imageview.setLayoutParams(new android.widget.Gallery.LayoutParams(-2, -2));
        linearlayout.addView(imageview);
    }

    private void a(LinearLayout linearlayout, bk bk1)
    {
label0:
        {
            if (!bk1.H())
            {
                break label0;
            }
            bk1 = bk1.m().iterator();
            ea ea1;
            do
            {
                if (!bk1.hasNext())
                {
                    break label0;
                }
                ea1 = (ea)bk1.next();
            } while (ea1.a() != ea.b.v);
            e = a(linearlayout, ea1, a.d);
            e.setVisibility(4);
        }
    }

    private void b(LinearLayout linearlayout, int i1)
    {
        linearlayout.addView(new View(g), new android.widget.LinearLayout.LayoutParams(i1, 0));
    }

    private void h()
    {
        if (e != null)
        {
            e.setFocusable(true);
            if (k.size() > 0)
            {
                ((b)k.get(k.size() - 1)).setNextFocusRightId(e.getId());
            }
        }
    }

    private void i()
    {
        d.setFocusable(true);
        for (int i1 = 0; i1 < k.size(); i1++)
        {
            b b1 = (b)k.get(i1);
            b1.setFocusable(true);
            if (i1 > 0)
            {
                b1.setNextFocusLeftId(((b)k.get(i1 - 1)).getId());
            }
            if (i1 < k.size() - 1)
            {
                b1.setNextFocusRightId(((b)k.get(i1 + 1)).getId());
            }
        }

        h();
        if (k.size() > 0)
        {
            ((b)k.get(0)).requestFocus();
        } else
        if (e != null)
        {
            e.requestFocus();
            return;
        }
    }

    private void j()
    {
        a[0] = j.a(gd.b.p);
        a[1] = j.a(gd.b.q);
        a[2] = j.a(gd.b.r);
        a[3] = j.a(gd.b.t);
        a[5] = j.a(gd.b.o);
        a[6] = j.a(gd.b.s);
        a[7] = j.a(gd.b.u);
    }

    public void a(ea ea1)
    {
        Iterator iterator = d.getTouchables().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (View)iterator.next();
            if (obj instanceof b)
            {
                obj = (b)obj;
                if (((b) (obj)).getTag() == ea1)
                {
                    ((b) (obj)).a();
                }
            }
        } while (true);
    }

    public boolean a()
    {
        return c > b;
    }

    public int b()
    {
        return c - b;
    }

    public int c()
    {
        return a[0].getWidth() + a[2].getWidth() + (a[0].getWidth() + a[1].getWidth() + a[5].getWidth()) * c;
    }

    public View d()
    {
        return d;
    }

    public void e()
    {
        if (e != null)
        {
            e.post(new c(e));
            h();
        }
    }

    public void f()
    {
        if (e != null)
        {
            e.setVisibility(0);
            h();
        }
    }

    public void g()
    {
        Iterator iterator = d.getTouchables().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            View view = (View)iterator.next();
            if (view instanceof b)
            {
                ((b)view).b(false);
            }
        } while (true);
    }

}
