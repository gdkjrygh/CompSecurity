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
import android.graphics.RectF;

public final class FaceToRectFilter extends ahn
{

    private float mScale;

    public FaceToRectFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mScale = 1.0F;
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
        Object aobj[] = (android.hardware.Camera.Face[])a("faces").a().e().n();
        android.hardware.Camera.Face aface[] = ((android.hardware.Camera.Face []) (aobj));
        if (aobj == null)
        {
            aface = new android.hardware.Camera.Face[0];
        }
        aobj = new ako[aface.length];
        for (int i = 0; i < aobj.length; i++)
        {
            RectF rectf = new RectF(aface[i].rect);
            rectf.left = rectf.left / 2000F + 0.5F;
            rectf.right = rectf.right / 2000F + 0.5F;
            rectf.top = rectf.top / 2000F + 0.5F;
            rectf.bottom = rectf.bottom / 2000F + 0.5F;
            aobj[i] = ako.a(rectf).a(mScale);
        }

        aju aju1 = b("quads");
        aih aih1 = aju1.a(new int[] {
            aface.length
        }).e();
        aih1.b(((Object) (aobj)));
        aju1.a(aih1);
    }
}
