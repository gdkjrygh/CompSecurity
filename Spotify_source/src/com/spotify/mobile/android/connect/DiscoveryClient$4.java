// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.connect;


// Referenced classes of package com.spotify.mobile.android.connect:
//            DiscoveryClient

final class 
{

    static final int a[];

    static 
    {
        a = new int[com.spotify.mobile.android.connect.model.s().length];
        try
        {
            a[com.spotify.mobile.android.connect.model.NFO_RESPONSE.al()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.spotify.mobile.android.connect.model.SER_RESPONSE.al()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.spotify.mobile.android.connect.model.SER_ERROR.al()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
