// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;

public final class ava
    implements anj
{

    private final anj a;
    private final Resources b;
    private final aqm c;

    public ava(Resources resources, aqm aqm1, anj anj1)
    {
        b = (Resources)b.a(resources, "Argument must not be null");
        c = (aqm)b.a(aqm1, "Argument must not be null");
        a = (anj)b.a(anj1, "Argument must not be null");
    }

    public final aqa a(Object obj, int i, int j, ani ani)
    {
        obj = a.a(obj, i, j, ani);
        if (obj == null)
        {
            return null;
        } else
        {
            return avx.a(b, c, (Bitmap)((aqa) (obj)).b());
        }
    }

    public final boolean a(Object obj, ani ani)
    {
        return a.a(obj, ani);
    }
}
