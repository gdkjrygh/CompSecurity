// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.moments;

import android.view.animation.Animation;

// Referenced classes of package com.facebook.moments:
//            NodexMomentsActivity

class a
    implements android.view.animation.ener
{

    final NodexMomentsActivity a;

    public void onAnimationEnd(Animation animation)
    {
        NodexMomentsActivity.d(a);
        NodexMomentsActivity.e(a);
        NodexMomentsActivity.f(a);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    stener(NodexMomentsActivity nodexmomentsactivity)
    {
        a = nodexmomentsactivity;
        super();
    }
}
