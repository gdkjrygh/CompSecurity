// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            NativeResponse, NativeErrorCode

final class t
    implements MoPubNative.MoPubNativeNetworkListener
{

    t()
    {
    }

    public final void onNativeFail(NativeErrorCode nativeerrorcode)
    {
    }

    public final void onNativeLoad(NativeResponse nativeresponse)
    {
        nativeresponse.destroy();
    }
}
