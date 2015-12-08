// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.applink;

import android.net.Uri;
import egc;
import egi;

// Referenced classes of package com.spotify.mobile.android.spotlets.applink:
//            AppLinkImpl

final class b
    implements Runnable
{

    private Uri a;
    private egc b;
    private AppLinkImpl c;

    public final void run()
    {
        c.b.a(a, b);
    }

    (AppLinkImpl applinkimpl, Uri uri, egc egc)
    {
        c = applinkimpl;
        a = uri;
        b = egc;
        super();
    }
}
