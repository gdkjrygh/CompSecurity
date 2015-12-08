// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package com.amobee.pulse3d:
//            FetchTask, Pulse3DView, Pulse3DViewListener, Log, 
//            Pulse3DWebView

class t> extends FetchTask
{

    final Pulse3DView this$0;
    final String val$URL;

    public void callBack(Object obj)
    {
        if (obj == null)
        {
            if (mPulse3DViewListener != null)
            {
                mPulse3DViewListener.onFailLoadingSceneAtURL(Pulse3DView.this, val$URL, new Error("onFailLoadingSceneAtURL"));
            }
            Log.e("Pulse3DView", "failed to loadSceneAtURL (no connection or 404/500)");
        } else
        {
            obj = ((String)obj).replace("\"__ADJITSU_JS_INITIALIZATION__\"", "var __adjitsuRuntime = { version: \"2.1\", platform: \"android\" }");
            Uri uri;
            try
            {
                uri = Uri.parse(mURL);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
            Log.d("Pulse3DView", (new StringBuilder()).append("3d ad html: ").append(((String) (obj))).toString());
            if (mPulse3dWebView != null)
            {
                mPulse3dWebView.isLoadingNewUrl = true;
                mPulse3dWebView.loadDataWithBaseURL(mURL, ((String) (obj)), "text/html", "UTF-8", uri.getHost());
                return;
            }
        }
    }

    public void prepare(Object obj)
    {
    }

    (String s)
    {
        this$0 = final_pulse3dview;
        val$URL = s;
        super(Context.this);
    }
}
