// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.applink;

import egc;

// Referenced classes of package com.spotify.mobile.android.spotlets.applink:
//            AppLinkImpl

final class a
    implements egc
{

    private AppLinkImpl a;

    public final void a(boolean flag)
    {
        boolean flag1 = true;
        AppLinkImpl applinkimpl = a;
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        applinkimpl.a = flag;
    }

    (AppLinkImpl applinkimpl)
    {
        a = applinkimpl;
        super();
    }
}
