// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;

import android.animation.ValueAnimator;

// Referenced classes of package com.google.android.libraries.view.pagingindicator:
//            PagingIndicator

public abstract class hasStarted extends ValueAnimator
{

    protected boolean hasStarted;
    protected hasStarted predicate;
    final PagingIndicator this$0;

    public final void startIfNecessary(float f)
    {
        if (!hasStarted && predicate.Start(f))
        {
            start();
            hasStarted = true;
        }
    }

    public ( )
    {
        this$0 = PagingIndicator.this;
        super();
        predicate = ;
        hasStarted = false;
    }
}
