// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.cards;

import android.view.View;
import com.tinder.utils.o;

// Referenced classes of package com.tinder.cards:
//            a

public final class d
{

    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;

    public d()
    {
    }

    public static d a(a a1)
    {
        (new StringBuilder("build transform ")).append(a1.getTranslationX());
        d d1 = new d();
        d1.c = a1.getTranslationY();
        d1.e = a1.getTranslationX();
        d1.g = a1.getScaleX();
        d1.k = a1.getRotation();
        d1.i = a1.getDimView().getAlpha();
        if (o.a())
        {
            d1.a = a1.getTranslationZ();
        }
        return d1;
    }

    public static boolean b(a a1)
    {
        return a1.getTranslationY() == 0.0F && a1.getTranslationX() == 0.0F;
    }

    public final String toString()
    {
        return (new StringBuilder("CardTransform{startZ=")).append(a).append(", endZ=").append(b).append(", startY=").append(c).append(", endY=").append(d).append(", startX=").append(e).append(", endX=").append(f).append(", startScale=").append(g).append(", endScale=").append(h).append(", startDim=").append(i).append(", endDim=").append(j).append(", startRotation=").append(k).append(", endRotation=").append(l).append('}').toString();
    }
}
