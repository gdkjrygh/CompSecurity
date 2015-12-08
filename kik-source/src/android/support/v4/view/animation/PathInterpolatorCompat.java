// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.view.animation:
//            PathInterpolatorCompatApi21, PathInterpolatorCompatBase

public class PathInterpolatorCompat
{

    private PathInterpolatorCompat()
    {
    }

    public static Interpolator create(float f, float f1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return PathInterpolatorCompatApi21.create(f, f1);
        } else
        {
            return PathInterpolatorCompatBase.create(f, f1);
        }
    }

    public static Interpolator create(float f, float f1, float f2, float f3)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return PathInterpolatorCompatApi21.create(f, f1, f2, f3);
        } else
        {
            return PathInterpolatorCompatBase.create(f, f1, f2, f3);
        }
    }

    public static Interpolator create(Path path)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return PathInterpolatorCompatApi21.create(path);
        } else
        {
            return PathInterpolatorCompatBase.create(path);
        }
    }
}
