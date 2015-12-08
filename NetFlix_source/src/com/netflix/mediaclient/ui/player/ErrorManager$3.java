// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.Intent;
import android.net.Uri;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            ErrorManager, PlayerActivity

class nkTag
    implements Runnable
{

    final ErrorManager this$0;
    final nkTag val$link;

    public void run()
    {
        final String urlLink;
        if (val$link.href.toLowerCase(ErrorManager.access$200()).trim().startsWith("http"))
        {
            urlLink = val$link.href;
        } else
        {
            urlLink = (new StringBuilder()).append("http://www.netflix.com").append("/").append(val$link.href).toString();
        }
        Log.d("ErrorManager", "Launch browser");
        ErrorManager.access$100(ErrorManager.this).runOnUiThread(new Runnable() {

            final ErrorManager._cls3 this$1;
            final String val$urlLink;

            public void run()
            {
                if (Log.isLoggable("ErrorManager", 3))
                {
                    Log.d("ErrorManager", (new StringBuilder()).append("Open browser to ").append(urlLink).toString());
                }
                ErrorManager.access$100(this$0).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(urlLink)));
                Log.d("ErrorManager", "Exit from playback after browser is started");
                ErrorManager.access$100(this$0).finish();
            }

            
            {
                this$1 = ErrorManager._cls3.this;
                urlLink = s;
                super();
            }
        });
    }

    nkTag()
    {
        this$0 = final_errormanager;
        val$link = nkTag.this;
        super();
    }
}
