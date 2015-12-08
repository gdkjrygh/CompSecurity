// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahn;
import ahs;
import ahu;
import ahv;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;

public class ToRgbValuesFilter extends ahn
{

    private aif mImageInType;

    public ToRgbValuesFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private static native boolean toRgbValues(ByteBuffer bytebuffer, ByteBuffer bytebuffer1);

    public final ajw b()
    {
        mImageInType = aif.a(301, 2);
        aif aif1 = aif.b(100);
        return (new ajw()).a("image", 2, mImageInType).b("image", 2, aif1).a();
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        int ai[] = ahv1.l();
        ahu ahu1 = aju1.a(new int[] {
            ai[0] * 3, ai[1]
        }).g();
        if (!toRgbValues(ahv1.a(1), ahu1.a(2)))
        {
            throw new RuntimeException("Native implementation encountered an error during processing!");
        } else
        {
            ahv1.k();
            ahu1.k();
            aju1.a(ahu1);
            return;
        }
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
