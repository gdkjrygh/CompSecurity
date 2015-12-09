// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.applink;

import com.ford.syncV4.proxy.rpc.enums.HMILevel;
import com.ford.syncV4.proxy.rpc.enums.SystemContext;

// Referenced classes of package com.spotify.mobile.android.spotlets.applink:
//            AppLinkImpl

final class 
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[HMILevel.values().length];
        try
        {
            b[HMILevel.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[HMILevel.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[HMILevel.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[HMILevel.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        a = new int[SystemContext.values().length];
        try
        {
            a[SystemContext.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[SystemContext.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[SystemContext.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[SystemContext.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[SystemContext.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
