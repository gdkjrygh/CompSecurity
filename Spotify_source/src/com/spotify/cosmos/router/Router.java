// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.router;


// Referenced classes of package com.spotify.cosmos.router:
//            Request, ResolveCallback

public interface Router
{

    public abstract void destroy();

    public abstract void resolve(Request request, ResolveCallback resolvecallback);
}
