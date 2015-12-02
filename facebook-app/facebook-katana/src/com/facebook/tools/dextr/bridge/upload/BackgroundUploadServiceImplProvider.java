// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge.upload;

import com.facebook.common.executors.ListeningExecutorService_DefaultExecutorServiceMethodAutoProvider;
import com.facebook.http.protocol.SingleMethodRunner;
import com.facebook.http.protocol.SingleMethodRunnerImpl;
import com.facebook.inject.AbstractAssistedProvider;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.tools.dextr.bridge.upload:
//            BackgroundUploadServiceImpl, UploadConstraints

public class BackgroundUploadServiceImplProvider extends AbstractAssistedProvider
{

    public BackgroundUploadServiceImplProvider()
    {
    }

    public final BackgroundUploadServiceImpl a(ExecutorService executorservice)
    {
        return new BackgroundUploadServiceImpl((UploadConstraints)UploadConstraints.a(this), (ExecutorService)ListeningExecutorService_DefaultExecutorServiceMethodAutoProvider.a(this), executorservice, (SingleMethodRunner)SingleMethodRunnerImpl.a(this));
    }
}
