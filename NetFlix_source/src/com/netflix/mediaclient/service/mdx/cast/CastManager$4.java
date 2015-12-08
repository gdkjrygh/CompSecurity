// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;

import android.support.v7.media.MediaRouter;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            CastManager

class val.id
    implements Runnable
{

    final CastManager this$0;
    final String val$id;

    public void run()
    {
        CastManager.access$802(CastManager.this, null);
        Iterator iterator = CastManager.access$900(CastManager.this).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.support.v7.media.uteInfo uteinfo = (android.support.v7.media.uteInfo)iterator.next();
            if (val$id.equalsIgnoreCase(CastManager.access$1000(CastManager.this, uteinfo.getId())))
            {
                CastManager.access$802(CastManager.this, uteinfo);
                CastManager.access$1102(CastManager.this, val$id);
            }
        } while (true);
        if (CastManager.access$800(CastManager.this) == null)
        {
            return;
        }
        CastManager.access$1202(CastManager.this, true);
        if (!CastManager.access$000(CastManager.this).getSelectedRoute().equals(CastManager.access$800(CastManager.this)))
        {
            CastManager.access$000(CastManager.this).selectRoute(CastManager.access$800(CastManager.this));
            return;
        } else
        {
            CastManager.access$1300(CastManager.this, CastManager.access$800(CastManager.this));
            return;
        }
    }

    ()
    {
        this$0 = final_castmanager;
        val$id = String.this;
        super();
    }
}
