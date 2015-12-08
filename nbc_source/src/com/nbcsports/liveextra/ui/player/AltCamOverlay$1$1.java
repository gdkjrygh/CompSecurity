// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import com.nbcsports.liveextra.library.api.models.VideoSource;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AltCamOverlay, AltCamPresenter

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        AltCamOverlay.access$000(_fld0);
    }

    ce()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/AltCamOverlay$1

/* anonymous class */
    class AltCamOverlay._cls1
        implements android.view.View.OnClickListener
    {

        final AltCamOverlay this$0;
        final VideoSource val$source;

        public void onClick(View view)
        {
            presenter.selectSource(source);
            post(new AltCamOverlay._cls1._cls1());
        }

            
            {
                this$0 = final_altcamoverlay;
                source = VideoSource.this;
                super();
            }
    }

}
