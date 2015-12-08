// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.Intent;
import android.net.Uri;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            ErrorManager, PlayerActivity

class val.urlLink
    implements Runnable
{

    final nish this$1;
    final String val$urlLink;

    public void run()
    {
        if (Log.isLoggable("ErrorManager", 3))
        {
            Log.d("ErrorManager", (new StringBuilder()).append("Open browser to ").append(val$urlLink).toString());
        }
        ErrorManager.access$100(_fld0).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(val$urlLink)));
        Log.d("ErrorManager", "Exit from playback after browser is started");
        ErrorManager.access$100(_fld0).finish();
    }

    Tag()
    {
        this$1 = final_tag;
        val$urlLink = String.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/ui/player/ErrorManager$3

/* anonymous class */
    class ErrorManager._cls3
        implements Runnable
    {

        final ErrorManager this$0;
        final ErrorManager.LinkTag val$link;

        public void run()
        {
            String s;
            if (link.href.toLowerCase(ErrorManager.access$200()).trim().startsWith("http"))
            {
                s = link.href;
            } else
            {
                s = (new StringBuilder()).append("http://www.netflix.com").append("/").append(link.href).toString();
            }
            Log.d("ErrorManager", "Launch browser");
            ErrorManager.access$100(ErrorManager.this).runOnUiThread(s. new ErrorManager._cls3._cls1());
        }

            
            {
                this$0 = final_errormanager;
                link = ErrorManager.LinkTag.this;
                super();
            }
    }

}
