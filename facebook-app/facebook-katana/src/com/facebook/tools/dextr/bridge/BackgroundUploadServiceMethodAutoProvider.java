// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge;

import com.facebook.inject.AbstractProvider;
import com.facebook.inject.InjectorLike;
import com.facebook.tools.dextr.bridge.upload.BackgroundUploadService;
import com.facebook.tools.dextr.bridge.upload.BackgroundUploadServiceImplProvider;

// Referenced classes of package com.facebook.tools.dextr.bridge:
//            DextrModule

public final class BackgroundUploadServiceMethodAutoProvider extends AbstractProvider
{

    public BackgroundUploadServiceMethodAutoProvider()
    {
    }

    private BackgroundUploadService a()
    {
        return DextrModule.a((BackgroundUploadServiceImplProvider)getOnDemandAssistedProviderForStaticDi(com/facebook/tools/dextr/bridge/upload/BackgroundUploadServiceImplProvider));
    }

    public static BackgroundUploadService a(InjectorLike injectorlike)
    {
        return b(injectorlike);
    }

    private static BackgroundUploadService b(InjectorLike injectorlike)
    {
        return DextrModule.a((BackgroundUploadServiceImplProvider)injectorlike.getOnDemandAssistedProviderForStaticDi(com/facebook/tools/dextr/bridge/upload/BackgroundUploadServiceImplProvider));
    }

    public final Object get()
    {
        return a();
    }
}
