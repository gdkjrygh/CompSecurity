// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.connect.view;

import com.spotify.mobile.android.spotlets.connect.Tech;

// Referenced classes of package com.spotify.mobile.android.spotlets.connect.view:
//            ConnectView

final class 
{

    static final int a[];

    static 
    {
        a = new int[Tech.values().length];
        try
        {
            a[Tech.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[Tech.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
