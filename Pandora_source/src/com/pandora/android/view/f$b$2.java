// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.pandora.android.view:
//            f

class nerAdapter extends AnimatorListenerAdapter
{

    final  a;

    public void onAnimationEnd(Animator animator)
    {
        nerAdapter(a).setVisibility(8);
    }

    nerAdapter(nerAdapter neradapter)
    {
        a = neradapter;
        super();
    }
}
