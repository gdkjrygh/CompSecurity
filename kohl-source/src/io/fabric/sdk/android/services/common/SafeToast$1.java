// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.services.concurrency.PriorityRunnable;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            SafeToast

class yRunnable extends PriorityRunnable
{

    final SafeToast this$0;

    public void run()
    {
        SafeToast.access$001(SafeToast.this);
    }

    yRunnable()
    {
        this$0 = SafeToast.this;
        super();
    }
}
