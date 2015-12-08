// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;


// Referenced classes of package com.google.android.libraries.view.pagingindicator:
//            PagingIndicator

public abstract class thresholdValue
{

    final PagingIndicator this$0;
    protected float thresholdValue;

    abstract boolean shouldStart(float f);

    public (float f)
    {
        this$0 = PagingIndicator.this;
        super();
        thresholdValue = f;
    }
}
