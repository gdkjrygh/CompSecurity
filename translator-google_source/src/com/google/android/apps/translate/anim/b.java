// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.anim;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.google.android.apps.translate.anim:
//            a

public final class b extends a
{

    private final View a[];

    public transient b(View aview[])
    {
        a = aview;
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (a != null)
        {
            animation = a;
            int j = animation.length;
            for (int i = 0; i < j; i++)
            {
                View view = animation[i];
                if (view != null)
                {
                    view.setVisibility(8);
                }
            }

        }
    }
}
