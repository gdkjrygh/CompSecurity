// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.appboy;

import android.net.Uri;
import com.appboy.f;

// Referenced classes of package com.soundcloud.android.analytics.appboy:
//            AppboyWrapper

class val.authority
    implements f
{

    final AppboyWrapper this$0;
    final String val$authority;

    public Uri getApiEndpoint(Uri uri)
    {
        return uri.buildUpon().ority(val$authority).d();
    }

    public Uri getResourceEndpoint(Uri uri)
    {
        return uri;
    }

    ()
    {
        this$0 = final_appboywrapper;
        val$authority = String.this;
        super();
    }
}
