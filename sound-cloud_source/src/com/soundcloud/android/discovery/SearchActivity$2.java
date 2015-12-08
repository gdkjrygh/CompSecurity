// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchActivity

class this._cls0 extends AnimatorListenerAdapter
{

    final SearchActivity this$0;

    public void onAnimationEnd(Animator animator)
    {
        supportFinishAfterTransition();
    }

    ()
    {
        this$0 = SearchActivity.this;
        super();
    }
}
