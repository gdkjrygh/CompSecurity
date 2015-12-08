// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;

final class ang.Object
    implements hfw
{

    private gkn a;

    public final Object call(Object obj)
    {
        obj = (Request)obj;
        return gkn.a(a).resolve(((Request) (obj)));
    }

    (gkn gkn1)
    {
        a = gkn1;
        super();
    }
}
