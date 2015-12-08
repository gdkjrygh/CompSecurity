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

public class RotateFilter extends ahn
{

    private float mRotateAngle;
    private ajl mShader;
    private ako mSourceRect;

    public RotateFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mSourceRect = ako.a(0.0F, 0.0F, 1.0F, 1.0F);
        mRotateAngle = 0.0F;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("rotateAngle", 2, aif.a(Float.TYPE)).a("sourceRect", 1, aif.a(ako)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("rotateAngle"))
        {
            ajo1.a("mRotateAngle");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("sourceRect"))
        {
            ajo1.a("mSourceRect");
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
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahv ahv2 = aju1.a(ahv1.l()).h();
        mShader.a(mSourceRect);
        ako ako1 = mSourceRect;
        float f1 = (float)((double)(mRotateAngle / 180F) * 3.1415926535897931D);
        android.graphics.PointF pointf = ako1.a();
        float f = (float)Math.cos(f1);
        f1 = (float)Math.sin(f1);
        ako1 = new ako(ako.a(ako1.a, pointf, f, f1), ako.a(ako1.b, pointf, f, f1), ako.a(ako1.c, pointf, f, f1), ako.a(ako1.d, pointf, f, f1));
        mShader.b(ako1);
        mShader.a(ahv1, ahv2);
        aju1.a(ahv2);
    }
}
