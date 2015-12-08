// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


// Referenced classes of package com.mopub.mraid:
//            MraidBridge

final class e
    implements MraidBridge.MraidWebView.OnVisibilityChangedListener
{

    final MraidBridge a;

    e(MraidBridge mraidbridge)
    {
        a = mraidbridge;
        super();
    }

    public final void onVisibilityChanged(boolean flag)
    {
        if (MraidBridge.a(a) != null)
        {
            MraidBridge.a(a).onVisibilityChanged(flag);
        }
    }
}
