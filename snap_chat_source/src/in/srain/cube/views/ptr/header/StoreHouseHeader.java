// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views.ptr.header;

import afA;
import afF;
import afG;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Transformation;
import in.srain.cube.views.ptr.PtrFrameLayout;
import java.util.ArrayList;

public class StoreHouseHeader extends View
    implements afA
{
    final class a
        implements Runnable
    {

        private int a;
        private int b;
        private int c;
        private int d;
        private boolean e;
        private StoreHouseHeader f;

        static void a(a a1)
        {
            a1.e = true;
            a1.a = 0;
            a1.d = StoreHouseHeader.a(a1.f) / a1.f.a.size();
            a1.b = StoreHouseHeader.b(a1.f) / a1.d;
            a1.c = a1.f.a.size() / a1.b + 1;
            a1.run();
        }

        static void b(a a1)
        {
            a1.e = false;
            a1.f.removeCallbacks(a1);
        }

        public final void run()
        {
            int j1 = a;
            int k1 = b;
            for (int i1 = 0; i1 < c; i1++)
            {
                int l1 = b * i1 + j1 % k1;
                if (l1 <= a)
                {
                    int i2 = f.a.size();
                    afF aff = (afF)f.a.get(l1 % i2);
                    aff.setFillAfter(false);
                    aff.setFillEnabled(true);
                    aff.setFillBefore(false);
                    aff.setDuration(StoreHouseHeader.c(f));
                    aff.a(StoreHouseHeader.d(f), StoreHouseHeader.e(f));
                }
            }

            a = a + 1;
            if (e)
            {
                f.postDelayed(this, d);
            }
        }

        private a()
        {
            f = StoreHouseHeader.this;
            super();
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = true;
        }

        a(byte byte0)
        {
            this();
        }
    }


    public ArrayList a;
    private int b;
    private float c;
    private int d;
    private float e;
    private int f;
    private int g;
    private float h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private Transformation n;
    private boolean o;
    private a p;

    public StoreHouseHeader(Context context)
    {
        super(context);
        a = new ArrayList();
        b = afG.a(40F);
        c = 0.7F;
        d = afG.a / 2;
        e = 0.0F;
        f = 0;
        g = 0;
        h = 0.4F;
        i = 1.0F;
        j = 0.4F;
        k = 1000;
        l = 1000;
        m = 400;
        n = new Transformation();
        o = false;
        p = new a((byte)0);
    }

    public StoreHouseHeader(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        b = afG.a(40F);
        c = 0.7F;
        d = afG.a / 2;
        e = 0.0F;
        f = 0;
        g = 0;
        h = 0.4F;
        i = 1.0F;
        j = 0.4F;
        k = 1000;
        l = 1000;
        m = 400;
        n = new Transformation();
        o = false;
        p = new a((byte)0);
    }

    public StoreHouseHeader(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = new ArrayList();
        b = afG.a(40F);
        c = 0.7F;
        d = afG.a / 2;
        e = 0.0F;
        f = 0;
        g = 0;
        h = 0.4F;
        i = 1.0F;
        j = 0.4F;
        k = 1000;
        l = 1000;
        m = 400;
        n = new Transformation();
        o = false;
        p = new a((byte)0);
    }

    private int a()
    {
        return getPaddingTop() + afG.a(10F);
    }

    static int a(StoreHouseHeader storehouseheader)
    {
        return storehouseheader.k;
    }

    static int b(StoreHouseHeader storehouseheader)
    {
        return storehouseheader.l;
    }

    private void b()
    {
        o = false;
        a.b(p);
    }

    static int c(StoreHouseHeader storehouseheader)
    {
        return storehouseheader.m;
    }

    static float d(StoreHouseHeader storehouseheader)
    {
        return storehouseheader.i;
    }

    static float e(StoreHouseHeader storehouseheader)
    {
        return storehouseheader.j;
    }

    public final void a(PtrFrameLayout ptrframelayout)
    {
        b();
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            ((afF)a.get(i1)).a(d);
        }

    }

    public final void a(PtrFrameLayout ptrframelayout, boolean flag, byte byte0, int i1, int j1, float f1, float f2)
    {
        e = Math.min(1.0F, f2);
        invalidate();
    }

    public final void b(PtrFrameLayout ptrframelayout)
    {
    }

    public final void c(PtrFrameLayout ptrframelayout)
    {
        o = true;
        a.a(p);
        invalidate();
    }

    public final void d(PtrFrameLayout ptrframelayout)
    {
        b();
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f1 = e;
        int i1 = canvas.save();
        int j1 = a.size();
        if (j1 < 0)
        {
            canvas.save();
            canvas = (afF)a.get(0);
            float f2 = f;
            throw new NullPointerException();
        }
        if (o)
        {
            invalidate();
        }
        canvas.restoreToCount(i1);
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, android.view.View.MeasureSpec.makeMeasureSpec(a() + (getPaddingBottom() + afG.a(10F)), 0x40000000));
        f = getMeasuredWidth() / 2;
        g = a();
        b = a();
    }

    public void setLoadingAniDuration(int i1)
    {
        k = i1;
        l = i1;
    }

    public void setScale(float f1)
    {
    }
}
