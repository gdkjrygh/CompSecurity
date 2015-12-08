// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.tremorvideo.sdk.android.googleAdapter.GoogleAdapterCalls;

// Referenced classes of package com.tremorvideo.sdk.android.d:
//            b, v

class c extends b
{

    c(v v1)
    {
        super(v1);
    }

    protected void a(String s)
    {
        v v1 = a();
        if (v1.n() != null)
        {
            v1.n().a(v1);
        }
        if (URLUtil.isValidUrl(s))
        {
            a().getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            GoogleAdapterCalls.onLeaveApp();
            return;
        } else
        {
            v1.a("Attempting to open invalid url: ", s);
            return;
        }
    }
}
