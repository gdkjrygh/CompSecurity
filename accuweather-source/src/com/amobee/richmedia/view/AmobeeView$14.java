// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class this._cls0
    implements DownloadListener
{

    final AmobeeView this$0;

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        (new Intent("android.intent.action.VIEW")).setDataAndType(Uri.parse(s), s3);
    }

    ()
    {
        this$0 = AmobeeView.this;
        super();
    }
}
