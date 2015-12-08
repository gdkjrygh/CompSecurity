// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.follow;

import cuf;
import hfw;

// Referenced classes of package com.spotify.mobile.android.spotlets.follow:
//            RxFollowersCountResolver

final class 
    implements hfw
{

    public final Object call(Object obj)
    {
        obj = (unt[])obj;
        if (obj.length == 0)
        {
            throw cuf.a(new Exception("No count data, expected one."));
        } else
        {
            return obj[0];
        }
    }

    ()
    {
    }
}
