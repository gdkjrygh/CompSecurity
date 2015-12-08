// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;

import android.view.View;

// Referenced classes of package android.support.v4.animation:
//            HoneycombMr1AnimatorCompatProvider, DonutAnimatorCompatProvider, AnimatorProvider

public abstract class AnimatorCompatHelper
{

    static AnimatorProvider a;

    public static void a(View view)
    {
        a.a(view);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            a = new HoneycombMr1AnimatorCompatProvider();
        } else
        {
            a = new DonutAnimatorCompatProvider();
        }
    }
}
