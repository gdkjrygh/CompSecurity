// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


// Referenced classes of package com.mopub.mraid:
//            MraidBridge

final class c
    implements com.mopub.mobileads.ViewGestureDetector.UserClickListener
{

    final MraidBridge a;

    c(MraidBridge mraidbridge)
    {
        a = mraidbridge;
        super();
    }

    public final void onResetUserClick()
    {
        MraidBridge.a(a, false);
    }

    public final void onUserClick()
    {
        MraidBridge.a(a, true);
    }

    public final boolean wasClicked()
    {
        return MraidBridge.b(a);
    }
}
