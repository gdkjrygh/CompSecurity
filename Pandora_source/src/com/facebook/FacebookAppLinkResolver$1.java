// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.net.Uri;
import java.util.Map;
import p.i.b;
import p.i.e;
import p.i.f;

// Referenced classes of package com.facebook:
//            FacebookAppLinkResolver

class val.uri
    implements e
{

    final FacebookAppLinkResolver this$0;
    final Uri val$uri;

    public volatile Object then(f f1)
        throws Exception
    {
        return then(f1);
    }

    public b then(f f1)
        throws Exception
    {
        return (b)((Map)f1.e()).get(val$uri);
    }

    ()
    {
        this$0 = final_facebookapplinkresolver;
        val$uri = Uri.this;
        super();
    }
}
