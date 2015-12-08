// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.models.MetadataStatus;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerToolbar, PlayerPresenter

class val.authNResult
    implements Runnable
{

    final val.authNResult this$1;
    final String val$authNResult;

    public void run()
    {
        getMenu().findItem(0x7f0f020a).setVisible(true);
        playerPresenter.showTempPass(false);
        PlayerToolbar.access$000(_fld0, val$authNResult);
    }

    it>()
    {
        this$1 = final_it>;
        val$authNResult = String.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/PlayerToolbar$3

/* anonymous class */
    class PlayerToolbar._cls3 extends AuthDelegate
    {

        final PlayerToolbar this$0;

        public void selectedProvider(Mvpd mvpd)
        {
            super.selectedProvider(mvpd);
            if (mvpd != null && mvpd.getId().startsWith("TempPass"))
            {
                pass.getAuthNTTL();
            }
        }

        public void setMetadataStatus(MetadataKey metadatakey, MetadataStatus metadatastatus)
        {
            super.setMetadataStatus(metadatakey, metadatastatus);
            if (metadatakey == null) goto _L2; else goto _L1
_L1:
            metadatakey.getKey();
            JVM INSTR tableswitch 0 0: default 32
        //                       0 33;
               goto _L2 _L3
_L2:
            return;
_L3:
            metadatakey = metadatastatus.getSimpleResult();
            if (pass.getSelectedMvpd() != null && pass.getSelectedMvpd().getId().startsWith("TempPass") && !TextUtils.isEmpty(metadatakey) && !playerPresenter.isFree())
            {
                post(metadatakey. new PlayerToolbar._cls3._cls1());
                return;
            }
            if (true) goto _L2; else goto _L4
_L4:
        }

            
            {
                this$0 = PlayerToolbar.this;
                super();
            }
    }

}
