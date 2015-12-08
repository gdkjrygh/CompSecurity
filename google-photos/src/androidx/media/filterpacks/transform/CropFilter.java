// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.transform;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import ako;
import akp;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import b;

public class CropFilter extends ahn
{

    private ako mCropRect;
    private akp mImageCropper;
    private int mOutputHeight;
    private int mOutputWidth;
    private boolean mUseMipmaps;

    public CropFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mCropRect = ako.a(0.0F, 0.0F, 1.0F, 1.0F);
        mOutputWidth = 0;
        mOutputHeight = 0;
        mUseMipmaps = false;
        mImageCropper = null;
    }

    protected int a(int i, int j)
    {
        if (mOutputWidth <= 0)
        {
            return i;
        } else
        {
            return mOutputWidth;
        }
    }

    protected int b(int i, int j)
    {
        if (mOutputHeight <= 0)
        {
            return j;
        } else
        {
            return mOutputHeight;
        }
    }

    public ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("cropRect", 2, aif.a(ako)).a("outputWidth", 1, aif.a(Integer.TYPE)).a("outputHeight", 1, aif.a(Integer.TYPE)).a("useMipmaps", 1, aif.a(Boolean.TYPE)).b("image", 2, aif2).a();
    }

    public void b(ajo ajo1)
    {
        if (ajo1.b.equals("cropRect"))
        {
            ajo1.a("mCropRect");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("outputWidth"))
            {
                ajo1.a("mOutputWidth");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("outputHeight"))
            {
                ajo1.a("mOutputHeight");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("useMipmaps"))
            {
                ajo1.a("mUseMipmaps");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void c()
    {
        mImageCropper = new akp(r());
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        int ai[] = akp.a(ahv1.l(), mCropRect);
        ahv ahv2 = aju1.a(new int[] {
            a(ai[0], ai[1]), b(ai[0], ai[1])
        }).h();
        akp akp1 = mImageCropper;
        Object obj = mCropRect;
        boolean flag = mUseMipmaps;
        int ai1[] = ahv1.l();
        int ai2[] = akp.a(ai1, ((ako) (obj)));
        int i = ahv2.m();
        int j = ahv2.n();
        if (akp1.c)
        {
            if (i < ai2[0] || j < ai2[1])
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0 && flag)
            {
                akp1.a = b.a(akp1.a, ai2);
                ai1 = akp1.a.l();
                ai1 = ako.a(0.0F, 0.0F, (float)ai2[0] / (float)ai1[0], (float)ai2[1] / (float)ai1[1]);
                akp1.b.a(((ako) (obj)));
                akp1.b.b(ai1);
                akp1.b.a(ahv1, akp1.a);
                b.a(akp1.a);
                ahv1 = akp1.a;
                obj = ai1;
            }
            akp1.b.a(((ako) (obj)));
            akp1.b.b(0.0F, 0.0F, 1.0F, 1.0F);
            akp1.b.a(ahv1, ahv2);
        } else
        {
            float f1 = ai1[0];
            float f2 = ai1[1];
            obj = ako.a(new ako(((ako) (obj)).a.x * f1, ((ako) (obj)).a.y * f2, ((ako) (obj)).b.x * f1, ((ako) (obj)).b.y * f2, ((ako) (obj)).c.x * f1, ((ako) (obj)).c.y * f2, f1 * ((ako) (obj)).d.x, ((ako) (obj)).d.y * f2), ako.a(0.0F, 0.0F, ai1[0], ai1[1]));
            ((Matrix) (obj)).postScale((float)i / (float)ai1[0], (float)j / (float)ai1[1]);
            Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            paint.setFilterBitmap(flag);
            canvas.drawBitmap(ahv1.q(), ((Matrix) (obj)), paint);
            ahv2.a(bitmap);
        }
        aju1.a(ahv2);
    }

    protected final void f()
    {
        if (mImageCropper != null)
        {
            akp akp1 = mImageCropper;
            if (akp1.a != null)
            {
                akp1.a.i();
                akp1.a = null;
                akp1.b = null;
            }
            mImageCropper = null;
        }
    }
}
