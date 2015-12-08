// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import com.nbcsports.liveextra.library.api.models.VideoSource;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AltCamOverlay, AltCamPresenter

class urce
    implements android.view.ener
{

    final AltCamOverlay this$0;
    final VideoSource val$source;

    public void onClick(View view)
    {
        presenter.selectSource(val$source);
        post(new Runnable() {

            final AltCamOverlay._cls1 this$1;

            public void run()
            {
                AltCamOverlay.access$000(this$0);
            }

            
            {
                this$1 = AltCamOverlay._cls1.this;
                super();
            }
        });
    }

    urce()
    {
        this$0 = final_altcamoverlay;
        val$source = VideoSource.this;
        super();
    }
}
