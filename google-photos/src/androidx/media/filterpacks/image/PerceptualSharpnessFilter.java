// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahn;
import ahs;
import ahv;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;

public class PerceptualSharpnessFilter extends ahn
{

    public PerceptualSharpnessFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private static native float computePerceptualSharpness(int i, int j, ByteBuffer bytebuffer, ByteBuffer bytebuffer1, ByteBuffer bytebuffer2);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        return (new ajw()).a("image", 2, aif1).a("blurredX", 2, aif1).a("blurredY", 2, aif1).b("sharpness", 2, aif.a(Float.TYPE)).a();
    }

    protected final void e()
    {
        Object obj = a("image");
        Object obj1 = a("blurredX");
        Object obj2 = a("blurredY");
        aju aju1 = b("sharpness");
        obj = ((ajo) (obj)).a().h();
        obj1 = ((ajo) (obj1)).a().h();
        obj2 = ((ajo) (obj2)).a().h();
        ByteBuffer bytebuffer = ((ahv) (obj)).a(1);
        ByteBuffer bytebuffer1 = ((ahv) (obj1)).a(1);
        ByteBuffer bytebuffer2 = ((ahv) (obj2)).a(1);
        float f;
        if (((ahv) (obj)).m() == 0 || ((ahv) (obj)).n() == 0)
        {
            f = 0.0F;
        } else
        {
            f = computePerceptualSharpness(((ahv) (obj)).m(), ((ahv) (obj)).n(), bytebuffer, bytebuffer1, bytebuffer2);
        }
        ((ahv) (obj)).k();
        ((ahv) (obj1)).k();
        ((ahv) (obj2)).k();
        obj = aju1.a(null).d();
        ((aig) (obj)).a(Float.valueOf(f));
        aju1.a(((ahs) (obj)));
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
