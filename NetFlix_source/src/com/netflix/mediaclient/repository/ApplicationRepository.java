// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.repository;

import com.netflix.mediaclient.NetflixApplication;

// Referenced classes of package com.netflix.mediaclient.repository:
//            PlayerRepository

public final class ApplicationRepository
{

    private PlayerRepository playerRepository;

    public ApplicationRepository(NetflixApplication netflixapplication)
    {
        playerRepository = new PlayerRepository(netflixapplication);
    }

    public void destroy()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public PlayerRepository getPlayerRepository()
    {
        return playerRepository;
    }
}
