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

private static final class Xb
    implements com.google.android.gms.games.request.
{

    private final Status CM;
    private final Bundle Xb;

    public GameRequestBuffer getRequests(int i)
    {
        String s = RequestType.dH(i);
        if (!Xb.containsKey(s))
        {
            return null;
        } else
        {
            return new GameRequestBuffer((DataHolder)Xb.get(s));
        }
    }

    public Status getStatus()
    {
        return CM;
    }

    public void release()
    {
        Iterator iterator = Xb.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = (DataHolder)Xb.getParcelable(((String) (obj)));
            if (obj != null)
            {
                ((DataHolder) (obj)).close();
            }
        } while (true);
    }

    (Status status, Bundle bundle)
    {
        CM = status;
        Xb = bundle;
    }
}
