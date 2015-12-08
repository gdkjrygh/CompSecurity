// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.profile;

import android.view.View;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.fitbit.onboarding.profile:
//            AboutYouActivity

class a
    implements Runnable
{

    final AboutYouActivity a;

    public void run()
    {
        AboutYouActivity.a(a).setVisibility(0);
        AboutYouActivity.a(a).setAnimation(AnimationUtils.loadAnimation(a, 0x7f050009));
    }

    (AboutYouActivity aboutyouactivity)
    {
        a = aboutyouactivity;
        super();
    }
}
