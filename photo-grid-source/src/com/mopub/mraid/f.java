// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


// Referenced classes of package com.mopub.mraid:
//            af, h, MraidBridge, MraidJavascriptCommand

final class f
    implements af
{

    final MraidJavascriptCommand a;
    final MraidBridge b;

    f(MraidBridge mraidbridge, MraidJavascriptCommand mraidjavascriptcommand)
    {
        b = mraidbridge;
        a = mraidjavascriptcommand;
        super();
    }

    public final void onFailure(h h1)
    {
        MraidBridge.a(b, a, h1.getMessage());
    }
}
