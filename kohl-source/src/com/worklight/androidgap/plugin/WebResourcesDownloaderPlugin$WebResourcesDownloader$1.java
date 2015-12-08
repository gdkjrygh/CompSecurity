// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.DialogInterface;
import com.worklight.common.Logger;
import org.apache.cordova.CordovaWebView;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WebResourcesDownloaderPlugin

class this._cls1
    implements android.content.cesDownloader._cls1
{

    final this._cls1 this$1;

    public void onCancel(DialogInterface dialoginterface)
    {
        WebResourcesDownloaderPlugin.access$100().debug("OnCancelListeneter called");
        cess._mth200(this._cls1.this).ncel(true);
        cess._mth300(this._cls1.this).sendJavascript("wl_directUpdateChallengeHandler.submitFailure()");
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
