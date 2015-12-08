// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.request.GameRequestBuffer;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Js extends com.google.android.gms.internal.lback
    implements com.google.android.gms.games.request.
{

    final GamesClientImpl IJ;
    private final Bundle Js;
    private final Status wJ;

    protected void a(Object obj)
    {
        c((com.google.android.gms.common.api.ack.c)obj);
    }

    protected void c(com.google.android.gms.common.api.ack ack)
    {
        ack.ack(this);
    }

    protected void dx()
    {
        release();
    }

    public GameRequestBuffer getRequests(int i)
    {
        String s = RequestType.bd(i);
        if (!Js.containsKey(s))
        {
            return null;
        } else
        {
            return new GameRequestBuffer((DataHolder)Js.get(s));
        }
    }

    public Status getStatus()
    {
        return wJ;
    }

    public void release()
    {
        Iterator iterator = Js.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = (DataHolder)Js.getParcelable(((String) (obj)));
            if (obj != null)
            {
                ((DataHolder) (obj)).close();
            }
        } while (true);
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack, Status status, Bundle bundle)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack);
        wJ = status;
        Js = bundle;
    }
}
