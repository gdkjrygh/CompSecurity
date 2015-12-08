// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.image;

import ahn;
import ahs;
import ahv;
import aif;
import aiw;
import ajl;
import ajo;
import ajr;
import aju;
import ajv;
import ajw;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class FixedSizeCropFilter extends ahn
{

    private float mMidPointX;
    private float mMidPointY;
    private int mOutputHeight;
    private int mOutputWidth;

    public FixedSizeCropFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mOutputWidth = 100;
        mOutputHeight = 100;
        mMidPointX = 0.5F;
        mMidPointY = 0.5F;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("outputWidth", 1, aif.a(Integer.TYPE)).a("outputHeight", 1, aif.a(Integer.TYPE)).a("midPointX", 1, aif.a(Float.TYPE)).a("midPointY", 1, aif.a(Float.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("outputWidth"))
        {
            ajo1.a("mOutputWidth");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("outputHeight"))
            {
                ajo1.a("mOutputHeight");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("midPointX"))
            {
                ajo1.a("mMidPointX");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("midPointY"))
            {
                ajo1.a("mMidPointY");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        int ai[] = ahv1.l();
        int ai1[] = new int[2];
        ai1[0] = mOutputWidth;
        ai1[1] = mOutputHeight;
        ahv ahv2 = aju1.a(ai1).h();
        Object obj1 = new RectF(((float)ai[0] * mMidPointX - (float)ai1[0] * 0.5F) / (float)ai[0], ((float)ai[1] * mMidPointY - (float)ai1[1] * 0.5F) / (float)ai[1], (float)mOutputWidth / (float)ai[0], (float)mOutputHeight / (float)ai[1]);
        Object obj = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
        if (aiw.a().f())
        {
            ajl ajl1 = ajv.a().g();
            ajl1.a(((RectF) (obj1)).left, ((RectF) (obj1)).top, ((RectF) (obj1)).right - ((RectF) (obj1)).left, ((RectF) (obj1)).bottom - ((RectF) (obj1)).top);
            ajl1.a(((RectF) (obj)));
            ajl1.a(ahv1, ahv2);
            ajl1.a(0.0F, 0.0F, 1.0F, 1.0F);
            ajl1.b(0.0F, 0.0F, 1.0F, 1.0F);
        } else
        {
            Rect rect = new Rect((int)(((RectF) (obj1)).left * (float)ahv1.m()), (int)(((RectF) (obj1)).top * (float)ahv1.n()), (int)(((RectF) (obj1)).right * (float)ahv1.m()), (int)(((RectF) (obj1)).bottom * (float)ahv1.n()));
            Rect rect1 = new Rect((int)(((RectF) (obj)).left * (float)ahv2.m()), (int)(((RectF) (obj)).top * (float)ahv2.n()), (int)(((RectF) (obj)).right * (float)ahv2.m()), (int)(((RectF) (obj)).bottom * (float)ahv2.n()));
            obj1 = ahv2.q();
            obj = obj1;
            if (obj1 == null)
            {
                obj = Bitmap.createBitmap(ahv2.m(), ahv2.n(), android.graphics.Bitmap.Config.ARGB_8888);
            }
            obj1 = new Canvas(((Bitmap) (obj)));
            Paint paint = new Paint();
            paint.setFilterBitmap(true);
            ((Canvas) (obj1)).drawBitmap(ahv1.q(), rect, rect1, paint);
            ahv2.a(((Bitmap) (obj)));
        }
        aju1.a(ahv2);
    }
}
