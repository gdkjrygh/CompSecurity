// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.DialogInterface;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity

class val.e
    implements Runnable
{

    final sh this$1;
    final IOException val$e;

    public void run()
    {
        if (isFinishing())
        {
            return;
        } else
        {
            (new android.app.(_fld0)).setTitle("Token verification request failed").setMessage(val$e.getMessage()).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final PlayerActivity._cls4._cls1 this$2;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    finish();
                }

            
            {
                this$2 = PlayerActivity._cls4._cls1.this;
                super();
            }
            }).setCancelable(false).show();
            return;
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$e = IOException.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerActivity$4

/* anonymous class */
    class PlayerActivity._cls4
        implements Callback
    {

        final PlayerActivity this$0;

        public void onFailure(Request request, IOException ioexception)
        {
            runOnUiThread(ioexception. new PlayerActivity._cls4._cls1());
        }

        public void onResponse(Response response)
            throws IOException
        {
            if (response.isSuccessful())
            {
                try
                {
                    PlayerActivity.access$000(PlayerActivity.this).setAuthenticatedStreamUrl(response.body().string());
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    Timber.e(response, "Token verification failed", new Object[0]);
                }
                runOnUiThread(new PlayerActivity._cls4._cls2());
                return;
            } else
            {
                runOnUiThread(new PlayerActivity._cls4._cls3());
                return;
            }
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }

        // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerActivity$4$2

/* anonymous class */
        class PlayerActivity._cls4._cls2
            implements Runnable
        {

            final PlayerActivity._cls4 this$1;

            public void run()
            {
                PlayerActivity.access$200(this$0);
            }

                    
                    {
                        this$1 = PlayerActivity._cls4.this;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerActivity$4$3

/* anonymous class */
        class PlayerActivity._cls4._cls3
            implements Runnable
        {

            final PlayerActivity._cls4 this$1;

            public void run()
            {
                if (isFinishing())
                {
                    return;
                } else
                {
                    (new android.app.AlertDialog.Builder(this$0)).setTitle("Token verification failed").setPositiveButton(0x104000a, new PlayerActivity._cls4._cls3._cls1()).setCancelable(false).show();
                    return;
                }
            }

                    
                    {
                        this$1 = PlayerActivity._cls4.this;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerActivity$4$3$1

/* anonymous class */
        class PlayerActivity._cls4._cls3._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final PlayerActivity._cls4._cls3 this$2;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                finish();
            }

                    
                    {
                        this$2 = PlayerActivity._cls4._cls3.this;
                        super();
                    }
        }

    }

}
