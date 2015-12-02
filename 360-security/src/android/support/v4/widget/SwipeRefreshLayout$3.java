// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout

class <init> extends <init>
{

    final SwipeRefreshLayout a;

    public void onAnimationEnd(Animation animation)
    {
        SwipeRefreshLayout.b(a, 0);
    }

    (SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super(swiperefreshlayout, null);
    }
}
