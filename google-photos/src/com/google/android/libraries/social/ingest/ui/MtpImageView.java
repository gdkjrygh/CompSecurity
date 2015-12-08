// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.ingest.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.mtp.MtpDevice;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Set;
import ndc;
import ndg;
import ndh;
import ndl;
import ndu;
import ndv;

public class MtpImageView extends ImageView
{

    private static final ndu i = ndu.a();
    private static final ndv j = new ndv();
    private int a;
    private int b;
    private WeakReference c;
    private final Object d;
    private boolean e;
    private ndg f;
    private MtpDevice g;
    private Object h;
    private float k;
    private float l;
    private int m;
    private Matrix n;

    public MtpImageView(Context context)
    {
        super(context);
        c = new WeakReference(this);
        d = new Object();
        e = false;
        n = new Matrix();
        c();
    }

    public MtpImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new WeakReference(this);
        d = new Object();
        e = false;
        n = new Matrix();
        c();
    }

    public MtpImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new WeakReference(this);
        d = new Object();
        e = false;
        n = new Matrix();
        c();
    }

    public static MtpDevice a(MtpImageView mtpimageview, MtpDevice mtpdevice)
    {
        mtpimageview.g = null;
        return null;
    }

    public static Object a(MtpImageView mtpimageview)
    {
        return mtpimageview.d;
    }

    public static Object a(MtpImageView mtpimageview, Object obj)
    {
        mtpimageview.h = obj;
        return obj;
    }

    public static ndg a(MtpImageView mtpimageview, ndg ndg1)
    {
        mtpimageview.f = null;
        return null;
    }

    public static boolean a(MtpImageView mtpimageview, boolean flag)
    {
        mtpimageview.e = false;
        return false;
    }

    public static MtpDevice b(MtpImageView mtpimageview)
    {
        return mtpimageview.g;
    }

    public static ndv b()
    {
        return j;
    }

    public static ndg c(MtpImageView mtpimageview)
    {
        return mtpimageview.f;
    }

    private void c()
    {
        setImageResource(0x106000d);
    }

    public static WeakReference d(MtpImageView mtpimageview)
    {
        return mtpimageview.c;
    }

    private void d()
    {
        n.reset();
        float f4 = getHeight();
        float f5 = getWidth();
        float f1;
        float f2;
        float f3;
        boolean flag;
        if (m % 180 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f2 = l;
            f1 = k;
        } else
        {
            f2 = k;
            f1 = l;
        }
        if (f2 <= f5 && f1 <= f4)
        {
            f3 = 1.0F;
        } else
        {
            f3 = Math.min(f5 / f2, f4 / f1);
        }
        n.setScale(f3, f3);
        if (flag)
        {
            n.postTranslate(-f1 * f3 * 0.5F, -f2 * f3 * 0.5F);
            n.postRotate(m);
            n.postTranslate(f2 * f3 * 0.5F, f1 * f3 * 0.5F);
        }
        n.postTranslate((f5 - f2 * f3) * 0.5F, (f4 - f3 * f1) * 0.5F);
        if (!flag && m > 0)
        {
            n.postRotate(m, f5 / 2.0F, f4 / 2.0F);
        }
        setImageMatrix(n);
    }

    public static Object e(MtpImageView mtpimageview)
    {
        return mtpimageview.h;
    }

    public Object a(MtpDevice mtpdevice, ndg ndg1)
    {
        if (ndg1.d <= 0x800000 && ndl.a.contains(Integer.valueOf(ndg1.c)))
        {
            return ndh.b(mtpdevice, ndg1);
        } else
        {
            return new ndc(ndh.a(mtpdevice, ndg1), 0);
        }
    }

    protected void a()
    {
        synchronized (d)
        {
            g = null;
            f = null;
            h = null;
        }
        animate().cancel();
        setImageResource(0x106000d);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(MtpDevice mtpdevice, ndg ndg1, int i1)
    {
        int j1 = ndg1.a;
        if (j1 == a && i1 == b)
        {
            return;
        }
        a();
        setImageResource(0x106000d);
        b = i1;
        a = j1;
        synchronized (d)
        {
            f = ndg1;
            g = mtpdevice;
            if (!e)
            {
                break MISSING_BLOCK_LABEL_81;
            }
        }
        return;
        mtpdevice;
        obj;
        JVM INSTR monitorexit ;
        throw mtpdevice;
        e = true;
        i.sendMessage(i.obtainMessage(0, c));
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(Object obj)
    {
        obj = (ndc)obj;
        if (getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
        {
            l = ((ndc) (obj)).a.getHeight();
            k = ((ndc) (obj)).a.getWidth();
            m = ((ndc) (obj)).b;
            d();
        } else
        {
            setRotation(((ndc) (obj)).b);
        }
        setAlpha(0.0F);
        setImageBitmap(((ndc) (obj)).a);
        animate().alpha(1.0F);
    }

    public void onDetachedFromWindow()
    {
        a();
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (flag && getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
        {
            d();
        }
    }

}
