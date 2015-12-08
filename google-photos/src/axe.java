// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;

public final class axe
    implements axg
{

    private final Resources a;
    private final aqm b;

    public axe(Resources resources, aqm aqm1)
    {
        a = (Resources)b.a(resources, "Argument must not be null");
        b = (aqm)b.a(aqm1, "Argument must not be null");
    }

    public final aqa a(aqa aqa1)
    {
        return avx.a(a, b, (Bitmap)aqa1.b());
    }
}
