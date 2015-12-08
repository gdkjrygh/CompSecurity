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

class init> extends AuthDelegate
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

    public void setMetadataStatus(final MetadataKey authNResult, MetadataStatus metadatastatus)
    {
        super.setMetadataStatus(authNResult, metadatastatus);
        if (authNResult == null) goto _L2; else goto _L1
_L1:
        authNResult.getKey();
        JVM INSTR tableswitch 0 0: default 32
    //                   0 33;
           goto _L2 _L3
_L2:
        return;
_L3:
        authNResult = metadatastatus.getSimpleResult();
        if (pass.getSelectedMvpd() != null && pass.getSelectedMvpd().getId().startsWith("TempPass") && !TextUtils.isEmpty(authNResult) && !playerPresenter.isFree())
        {
            post(new Runnable() {

                final PlayerToolbar._cls3 this$1;
                final String val$authNResult;

                public void run()
                {
                    getMenu().findItem(0x7f0f020a).setVisible(true);
                    playerPresenter.showTempPass(false);
                    PlayerToolbar.access$000(this$0, authNResult);
                }

            
            {
                this$1 = PlayerToolbar._cls3.this;
                authNResult = s;
                super();
            }
            });
            return;
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    _cls1.val.authNResult()
    {
        this$0 = PlayerToolbar.this;
        super();
    }
}
