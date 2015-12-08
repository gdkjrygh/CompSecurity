// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.useragent;


// Referenced classes of package com.google.android.apps.wallet.util.useragent:
//            UserAgentFormatter

public class UserAgentModule
{

    public UserAgentModule()
    {
    }

    static String getUserAgent(UserAgentFormatter useragentformatter)
    {
        return useragentformatter.getWalletUserAgent();
    }
}
