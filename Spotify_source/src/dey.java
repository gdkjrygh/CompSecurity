// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import com.spotify.android.glue.organisms.header.transformations.TransformationSet;
import java.util.Arrays;

public final class dey extends dex
{

    private dfc f;
    private dex g;

    private dey(float f1, float f2, int i, dez dez, TransformationSet transformationset)
    {
        super(f1, f2, i, dez);
        c = transformationset;
    }

    static dey a(dex dex1, dfc dfc1)
    {
        dey dey1 = new dey(dex1.d, dex1.e, dex1.b, dex1.a, dex1.c);
        dey1.g = dex1;
        dey1.f = dfc1;
        return dey1;
    }

    public final transient dex a(dfb adfb[])
    {
        f.b = Arrays.asList(adfb);
        return g;
    }

    public final dey a(TimeInterpolator timeinterpolator)
    {
        f.a = timeinterpolator;
        return this;
    }
}
