// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

// Referenced classes of package com.amobee.richmedia.view:
//            Browser

class this._cls0
    implements DownloadListener
{

    final Browser this$0;

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        s1 = new Intent("android.intent.action.VIEW");
        s1.setData(Uri.parse(s));
        startActivity(s1);
        finish();
    }

    ()
    {
        this$0 = Browser.this;
        super();
    }
}
