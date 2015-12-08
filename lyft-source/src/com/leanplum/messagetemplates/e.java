// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.os.Handler;
import android.view.animation.Animation;

// Referenced classes of package com.leanplum.messagetemplates:
//            f, BaseMessageDialog

final class e
    implements android.view.animation.Animation.AnimationListener
{

    private BaseMessageDialog a;

    e(BaseMessageDialog basemessagedialog)
    {
        a = basemessagedialog;
        super();
    }

    static BaseMessageDialog a(e e1)
    {
        return e1.a;
    }

    public final void onAnimationEnd(Animation animation)
    {
        (new Handler()).postDelayed(new f(this), 10L);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
