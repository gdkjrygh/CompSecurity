// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.mopub.nativeads:
//            ae, ax, ah, NativeErrorCode, 
//            NativeResponse

final class ag
    implements MoPubNative.MoPubNativeNetworkListener
{

    final ae a;

    ag(ae ae1)
    {
        a = ae1;
        super();
    }

    public final void onNativeFail(NativeErrorCode nativeerrorcode)
    {
        a.a = false;
        if (a.d >= 0x493e0)
        {
            a.d = 1000;
            return;
        }
        nativeerrorcode = a;
        nativeerrorcode.d = (int)((double)((ae) (nativeerrorcode)).d * 2D);
        if (((ae) (nativeerrorcode)).d > 0x493e0)
        {
            nativeerrorcode.d = 0x493e0;
        }
        a.b = true;
        ae.e(a).postDelayed(ae.d(a), a.d);
    }

    public final void onNativeLoad(NativeResponse nativeresponse)
    {
        if (ae.a(a) == null)
        {
            return;
        }
        a.a = false;
        ae ae1 = a;
        ae1.c = ae1.c + 1;
        a.d = 1000;
        ae.b(a).add(new ax(nativeresponse));
        if (ae.b(a).size() == 1 && ae.c(a) != null)
        {
            ae.c(a).onAdsAvailable();
        }
        a.c();
    }
}
