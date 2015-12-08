// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.DialogInterface;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity

class this._cls2
    implements android.content.ckListener
{

    final  this$2;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        finish();
    }

    ()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerActivity$5

/* anonymous class */
    class PlayerActivity._cls5 extends AuthDelegate
    {

        final PlayerActivity this$0;

        public void setToken(String s, String s1)
        {
            super.setToken(s, s1);
            PlayerActivity.access$302(PlayerActivity.this, s);
            PlayerActivity.access$402(PlayerActivity.this, s1);
            Timber.d("Token Request SUCCESS\n\tResource: %s\n\tToken: %s", new Object[] {
                s1, s
            });
            if (!PlayerActivity.access$000(PlayerActivity.this).isFree())
            {
                verifyAuth();
            }
        }

        public void tokenRequestFailed(String s, final String code, String s1)
        {
            super.tokenRequestFailed(s, code, s1);
            Timber.w("Token Request FAIL\n\tResource: %s\n\tCode: %s\n\tDescription: %s", new Object[] {
                s, code, s1
            });
            runOnUiThread(s1. new PlayerActivity._cls5._cls1());
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    }


    // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerActivity$5$1

/* anonymous class */
    class PlayerActivity._cls5._cls1
        implements Runnable
    {

        final PlayerActivity._cls5 this$1;
        final String val$code;
        final String val$description;

        public void run()
        {
            if (isFinishing())
            {
                return;
            } else
            {
                (new android.app.AlertDialog.Builder(this$0)).setTitle(code).setMessage(description).setPositiveButton(0x104000a, new PlayerActivity._cls5._cls1._cls1()).setCancelable(false).show();
                return;
            }
        }

            
            {
                this$1 = final__pcls5;
                code = s;
                description = String.this;
                super();
            }
    }

}
