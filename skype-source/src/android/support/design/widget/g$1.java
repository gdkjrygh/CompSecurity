// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.design.widget:
//            g

final class <init> extends <init>
{

    final g a;

    public final void onAnimationEnd(Animation animation)
    {
        g.a(a, false);
        a.e.setVisibility(8);
    }

    public final void onAnimationStart(Animation animation)
    {
        g.a(a, true);
    }

    (g g1)
    {
        a = g1;
        super();
    }
}
