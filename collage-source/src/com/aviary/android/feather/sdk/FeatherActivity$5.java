// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.aviary.android.feather.sdk:
//            FeatherActivity

class a
    implements android.view.animation.nListener
{

    final FeatherActivity a;

    public void onAnimationEnd(Animation animation)
    {
        FeatherActivity.b(a).setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    r(FeatherActivity featheractivity)
    {
        a = featheractivity;
        super();
    }
}
