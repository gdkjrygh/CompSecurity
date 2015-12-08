// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.ad;

import com.vungle.log.Logger;
import com.vungle.publisher.ag;
import com.vungle.publisher.av;
import com.vungle.publisher.by;
import com.vungle.publisher.db.model.Ad;
import com.vungle.publisher.q;

// Referenced classes of package com.vungle.publisher.ad:
//            AdManager

static class  extends by
{

    final String a = "VunglePrepare";
    AdManager b;
    com.vungle.publisher.db.model.ster c;

    public void onEvent(ag ag1)
    {
        try
        {
            ag1.a().b(com.vungle.publisher.db.model.A);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ag ag1)
        {
            c.A("VunglePrepare", "error processing start play ad event", ag1);
        }
    }

    public void onEvent(av av)
    {
        Logger.d("VunglePrepare", "play ad failure - unregistering play ad listener");
        unregister();
    }

    public void onEvent(q q)
    {
        Logger.d("VunglePrepare", "sent ad report - unregistering play ad listener");
        unregister();
    }

    ()
    {
    }
}
