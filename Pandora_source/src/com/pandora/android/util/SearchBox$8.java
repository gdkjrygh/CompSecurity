// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.pandora.android.util:
//            SearchBox

class pter extends AnimatorListenerAdapter
{

    final SearchBox a;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        SearchBox.d(a).setVisibility(8);
    }

    pter(SearchBox searchbox)
    {
        a = searchbox;
        super();
    }
}
