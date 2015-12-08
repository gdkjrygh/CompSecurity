// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.router;


// Referenced classes of package com.spotify.cosmos.router:
//            Response

public interface ResolveCallback
{

    public abstract void onError(Throwable throwable);

    public abstract boolean onResolved(Response response);
}
