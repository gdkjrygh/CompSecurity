// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import android.location.Location;
import com.vungle.log.Logger;
import com.vungle.publisher.cn;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            MessageFactory

public static class  extends MessageFactory
{

    cn a;

    protected final Object a()
    {
        return new ();
    }

    protected final volatile Object[] a(int i)
    {
        return new [i];
    }

    protected final  b()
    {
        Location location = a.b();
        if (location == null)
        {
            Logger.d("VungleProtocol", "detailed location not available");
            return null;
        } else
        {
              = new a();
            .a = Float.valueOf(location.getAccuracy());
            .a = Double.valueOf(location.getLatitude());
            .a = Double.valueOf(location.getLongitude());
            .a = Float.valueOf(location.getSpeed());
            .a = Long.valueOf(location.getTime());
            return ;
        }
    }

    protected ()
    {
    }
}
