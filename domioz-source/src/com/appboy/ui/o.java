// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

// Referenced classes of package com.appboy.ui:
//            AppboyWebViewActivity

final class o
    implements DownloadListener
{

    final AppboyWebViewActivity a;

    o(AppboyWebViewActivity appboywebviewactivity)
    {
        a = appboywebviewactivity;
        super();
    }

    public final void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        s1 = new Intent("android.intent.action.VIEW");
        s1.setData(Uri.parse(s));
        a.startActivity(s1);
    }
}
