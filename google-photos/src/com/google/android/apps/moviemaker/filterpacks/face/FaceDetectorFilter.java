// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.face;

import ahn;
import ahs;
import ahu;
import aif;
import aih;
import ajo;
import ajr;
import aju;
import ajw;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import cdw;
import java.util.Vector;

public class FaceDetectorFilter extends ahn
    implements cdw
{

    private static final float FACE_THRESHOLD = 0.2F;
    private FaceDetector.Module mDetectorModule;

    public FaceDetectorFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mDetectorModule = null;
    }

    private static int a(float f, int i)
    {
        return (int)(2000F * (f / (float)i)) - 1000;
    }

    private static Point a(PointF pointf, int ai[])
    {
        return new Point(a(pointf.x, ai[0]), a(pointf.y, ai[1]));
    }

    public final void a(FaceDetector.Module module)
    {
        if (n())
        {
            throw new IllegalStateException("Cannot call setCustomModule while tracker is running!");
        }
        if (mDetectorModule != null)
        {
            mDetectorModule.c();
        }
        if (module != null)
        {
            mDetectorModule = FaceDetector.Module.a(module.a);
            return;
        } else
        {
            mDetectorModule = null;
            return;
        }
    }

    public final ajw b()
    {
        aif aif1 = aif.b(100);
        return (new ajw()).a("image", 2, aif1).b("faces", 2, aif.b(android/hardware/Camera$Face)).a();
    }

    protected final void e()
    {
        if (mDetectorModule == null)
        {
            mDetectorModule = FaceDetector.Module.a();
        }
        Object obj = a("image").a().g();
        int i = ((ahu) (obj)).m();
        int j = ((ahu) (obj)).n();
        int ai[] = new int[2];
        ai[0] = i;
        ai[1] = j;
        FaceDetector.DCR dcr = new FaceDetector.DCR();
        dcr.b(((ahu) (obj)).a(1), i, j);
        dcr.a(mDetectorModule);
        Vector vector = new Vector();
        do
        {
            if (!dcr.b(mDetectorModule).b())
            {
                break;
            }
            if (dcr.c() > 0.2F)
            {
                android.hardware.Camera.Face face = new android.hardware.Camera.Face();
                face.leftEye = a(dcr.a(0), ai);
                face.rightEye = a(dcr.a(1), ai);
                face.mouth = a(dcr.a(45), ai);
                RectF rectf = dcr.d();
                face.rect = new Rect(a(rectf.left, ai[0]), a(rectf.top, ai[1]), a(rectf.right, ai[0]), a(rectf.bottom, ai[1]));
                face.score = (int)(100F * dcr.c());
                vector.add(face);
            }
        } while (true);
        dcr.a();
        ((ahu) (obj)).k();
        obj = b("faces");
        ahs ahs1 = ((aju) (obj)).a(new int[] {
            vector.size()
        });
        ahs1.e().b(((Object) (vector.toArray(new android.hardware.Camera.Face[0]))));
        ((aju) (obj)).a(ahs1);
    }

    protected final void g()
    {
        if (mDetectorModule != null)
        {
            mDetectorModule.c();
            mDetectorModule = null;
        }
    }
}
