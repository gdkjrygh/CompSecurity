// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.common.executor;

import com.google.zxing.client.android.common.PlatformSupportManager;

// Referenced classes of package com.google.zxing.client.android.common.executor:
//            AsyncTaskExecInterface, DefaultAsyncTaskExecInterface

public final class AsyncTaskExecManager extends PlatformSupportManager
{

    public AsyncTaskExecManager()
    {
        super(com/google/zxing/client/android/common/executor/AsyncTaskExecInterface, new DefaultAsyncTaskExecInterface());
        addImplementationClass(11, "com.google.zxing.client.android.common.executor.HoneycombAsyncTaskExecInterface");
    }
}
