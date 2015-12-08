// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.event.nrdp.media.MediaEvent;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            ErrorManager

class nt
    implements Runnable
{

    final ErrorManager this$0;
    final MediaEvent val$pe;

    public void run()
    {
        ErrorManager.access$000(ErrorManager.this, val$pe);
    }

    nt()
    {
        this$0 = final_errormanager;
        val$pe = MediaEvent.this;
        super();
    }
}
