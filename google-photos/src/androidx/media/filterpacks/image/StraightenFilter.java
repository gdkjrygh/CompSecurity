// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import android.graphics.PointF;

public class StraightenFilter extends ahn
{

    private static final float DEGREE_TO_RADIAN = 0.01745329F;
    private float mAngle;
    private int mHeight;
    private float mMaxAngle;
    private ajl mShader;
    private int mWidth;

    public StraightenFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mAngle = 0.0F;
        mMaxAngle = 45F;
        mWidth = 0;
        mHeight = 0;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("angle", 1, aif.a(Float.TYPE)).a("maxAngle", 1, aif.a(Float.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("angle"))
        {
            ajo1.a("mAngle");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("maxAngle"))
        {
            ajo1.a("mMaxAngle");
            ajo1.g = true;
            return;
        }
    }

    protected final void c()
    {
        mShader = ajl.a();
    }

    protected final void e()
    {
        float f = 90F;
        this;
        JVM INSTR monitorenter ;
        float f1;
        float f2;
        Object obj;
        ahv ahv1;
        ahv ahv2;
        obj = b("image");
        ahv1 = a("image").a().h();
        ahv2 = ((aju) (obj)).a(ahv1.l()).h();
        if (ahv1.m() != mWidth || ahv1.n() != mHeight)
        {
            mWidth = ahv1.m();
            mHeight = ahv1.n();
        }
        f1 = (float)Math.cos(mAngle * 0.01745329F);
        f2 = (float)Math.sin(mAngle * 0.01745329F);
        if (mMaxAngle <= 0.0F)
        {
            throw new RuntimeException("Max angle is out of range (0-180).");
        }
        break MISSING_BLOCK_LABEL_136;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (mMaxAngle <= 90F)
        {
            break MISSING_BLOCK_LABEL_628;
        }
_L1:
        mMaxAngle = f;
        PointF pointf = new PointF(-f1 * (float)mWidth + (float)mHeight * f2, -f2 * (float)mWidth - (float)mHeight * f1);
        PointF pointf1 = new PointF((float)mWidth * f1 + (float)mHeight * f2, (float)mWidth * f2 - (float)mHeight * f1);
        PointF pointf2 = new PointF(-f1 * (float)mWidth - (float)mHeight * f2, -f2 * (float)mWidth + (float)mHeight * f1);
        f = mWidth;
        float f3 = mHeight;
        float f4 = mWidth;
        PointF pointf3 = new PointF(f * f1 - f3 * f2, f1 * (float)mHeight + f2 * f4);
        f = Math.max(Math.abs(pointf.x), Math.abs(pointf1.x));
        f1 = Math.max(Math.abs(pointf.y), Math.abs(pointf1.y));
        f = Math.min((float)mWidth / f, (float)mHeight / f1) * 0.5F;
        pointf.set((pointf.x * f) / (float)mWidth + 0.5F, (pointf.y * f) / (float)mHeight + 0.5F);
        pointf1.set((pointf1.x * f) / (float)mWidth + 0.5F, (pointf1.y * f) / (float)mHeight + 0.5F);
        pointf2.set((pointf2.x * f) / (float)mWidth + 0.5F, (pointf2.y * f) / (float)mHeight + 0.5F);
        pointf3.set((pointf3.x * f) / (float)mWidth + 0.5F, (f * pointf3.y) / (float)mHeight + 0.5F);
        mShader.a(new float[] {
            pointf.x, pointf.y, pointf1.x, pointf1.y, pointf2.x, pointf2.y, pointf3.x, pointf3.y
        });
        mShader.a(ahv1, ahv2);
        ((aju) (obj)).a(ahv2);
        this;
        JVM INSTR monitorexit ;
        return;
        f = mMaxAngle;
          goto _L1
    }
}
