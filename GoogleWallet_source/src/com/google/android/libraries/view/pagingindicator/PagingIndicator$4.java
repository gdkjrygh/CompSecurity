// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.google.android.libraries.view.pagingindicator:
//            PagingIndicator

final class this._cls0 extends AnimatorListenerAdapter
{

    final PagingIndicator this$0;

    public final void onAnimationEnd(Animator animator)
    {
        PagingIndicator.access$502(PagingIndicator.this, true);
    }

    public final void onAnimationStart(Animator animator)
    {
        PagingIndicator.access$502(PagingIndicator.this, false);
    }

    I()
    {
        this$0 = PagingIndicator.this;
        super();
    }
}
