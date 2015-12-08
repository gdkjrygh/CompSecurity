// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.skype.android.app.location:
//            ReceivedLocationActivity

final class this._cls0
    implements android.view.animation.
{

    final ReceivedLocationActivity this$0;

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        ReceivedLocationActivity.access$700(ReceivedLocationActivity.this).setVisibility(0);
    }

    ()
    {
        this$0 = ReceivedLocationActivity.this;
        super();
    }
}
