// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.face;

import ahn;
import ahs;
import aif;
import aih;
import ajo;
import ajr;
import aju;
import ajw;
import ako;
import android.graphics.Point;
import android.graphics.PointF;

public final class FaceToQuadFilter extends ahn
{

    private float mScale;

    public FaceToQuadFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mScale = 2.0F;
    }

    public final ajw b()
    {
        aif aif1 = aif.b(android/hardware/Camera$Face);
        aif aif2 = aif.b(ako);
        aif aif3 = aif.a(Float.TYPE);
        return (new ajw()).a("faces", 2, aif1).a("scale", 1, aif3).b("quads", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("scale"))
        {
            ajo1.a("mScale");
            ajo1.g = true;
        }
    }

    protected final void e()
    {
        android.hardware.Camera.Face aface[] = (android.hardware.Camera.Face[])a("faces").a().e().n();
        ako aako[] = new ako[aface.length];
        for (int i = 0; i < aako.length; i++)
        {
            Object obj = aface[i];
            PointF pointf = new PointF((float)((android.hardware.Camera.Face) (obj)).leftEye.x / 2000F + 0.5F, (float)((android.hardware.Camera.Face) (obj)).leftEye.y / 2000F + 0.5F);
            PointF pointf1 = new PointF((float)((android.hardware.Camera.Face) (obj)).rightEye.x / 2000F + 0.5F, (float)((android.hardware.Camera.Face) (obj)).rightEye.y / 2000F + 0.5F);
            obj = new PointF((float)((android.hardware.Camera.Face) (obj)).mouth.x / 2000F + 0.5F, (float)((android.hardware.Camera.Face) (obj)).mouth.y / 2000F + 0.5F);
            aako[i] = ako.a(pointf, pointf1, Math.abs((pointf1.x - pointf.x) * (pointf.y - ((PointF) (obj)).y) - (pointf.x - ((PointF) (obj)).x) * (pointf1.y - pointf.y)) / (float)Math.sqrt((pointf1.x - pointf.x) * (pointf1.x - pointf.x) + (pointf1.y - pointf.y) * (pointf1.y - pointf.y))).a(mScale);
        }

        aju aju1 = b("quads");
        aih aih1 = aju1.a(new int[] {
            aface.length
        }).e();
        aih1.b(aako);
        aju1.a(aih1);
    }
}
