// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.appboy.ui.inappmessage:
//            ai

final class aj extends AnimatorListenerAdapter
{

    final ai a;

    aj(ai ai1)
    {
        a = ai1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.a();
    }
}
