// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.view.View;
import com.cmcm.a.a.a;
import com.cmcm.adsdk.b.c.b;
import com.mopub.nativeads.NativeErrorCode;
import com.mopub.nativeads.NativeResponse;
import com.picksinit.PicksMob;
import java.util.List;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            MopubNativeAdLoader, h, d, v

final class i
    implements com.mopub.nativeads.MoPubNative.MoPubNativeListener
{

    final MopubNativeAdLoader a;

    i(MopubNativeAdLoader mopubnativeadloader)
    {
        a = mopubnativeadloader;
        super();
    }

    public final void onNativeClick(View view)
    {
        if (a.mNativeAdListener != null)
        {
            b.a("MopubNativeAdLoader", (new StringBuilder("Mopub handleClickAdtitle:")).append(MopubNativeAdLoader.access$000(a).d()).toString());
            a.mNativeAdListener.b(MopubNativeAdLoader.access$000(a));
            PicksMob.getInstance().doRecommendAdClickReport("com.mopub.ad", a.mPositionId, 3003);
        }
    }

    public final void onNativeFail(NativeErrorCode nativeerrorcode)
    {
        b.a("MopubNativeAdLoader", (new StringBuilder("Mopub adFailedToLoad")).append(nativeerrorcode.toString()).toString());
        MopubNativeAdLoader.access$102(a, false);
        b.a("MopubNativeAdLoader", "isLoading set false");
        b.a("MopubNativeAdLoader", (new StringBuilder("isLoading :")).append(MopubNativeAdLoader.access$100(a)).toString());
        MopubNativeAdLoader.access$400(a, nativeerrorcode.name());
    }

    public final void onNativeImpression(View view)
    {
        b.a("MopubNativeAdLoader", (new StringBuilder("Mopub handleImpressionAdtitle:")).append(MopubNativeAdLoader.access$000(a).d()).toString());
        if ((MopubNativeAdLoader.access$000(a) instanceof d) && !((d)MopubNativeAdLoader.access$000(a)).a)
        {
            b.a("MopubNativeAdLoader", (new StringBuilder("Mopub title:")).append(MopubNativeAdLoader.access$000(a).d()).append(" is a new ad or has setReUse").toString());
            PicksMob.getInstance().doRecommendAdViewReport("com.mopub.ad", a.mPositionId, 3003);
            ((d)MopubNativeAdLoader.access$000(a)).a = true;
        }
    }

    public final void onNativeLoad(NativeResponse nativeresponse)
    {
        MopubNativeAdLoader.access$102(a, false);
        if (nativeresponse != null)
        {
            b.a("MopubNativeAdLoader", "loadAd success");
            nativeresponse = new v(nativeresponse);
            MopubNativeAdLoader.access$200(a).add(nativeresponse);
            b.a("MopubNativeAdLoader", (new StringBuilder("adpool add ad title:")).append(nativeresponse.d()).append(",adpool size :").append(MopubNativeAdLoader.access$200(a).size()).toString());
        }
        MopubNativeAdLoader.access$300(a);
    }
}
