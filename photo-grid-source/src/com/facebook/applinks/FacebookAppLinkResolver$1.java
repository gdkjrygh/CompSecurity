// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.applinks;

import android.net.Uri;
import bolts.c;
import bolts.i;
import bolts.j;
import java.util.Map;

// Referenced classes of package com.facebook.applinks:
//            FacebookAppLinkResolver

class val.uri
    implements i
{

    final FacebookAppLinkResolver this$0;
    final Uri val$uri;

    public c then(j j1)
    {
        return (c)((Map)j1.d()).get(val$uri);
    }

    public volatile Object then(j j1)
    {
        return then(j1);
    }

    ()
    {
        this$0 = final_facebookapplinkresolver;
        val$uri = Uri.this;
        super();
    }
}
