// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient;


// Referenced classes of package com.netflix.mediaclient.service.webclient:
//            WebClientInitParameters

public interface WebClient
{

    public abstract void init(WebClientInitParameters webclientinitparameters);

    public abstract boolean isSynchronous();

    public abstract void setTimeout(int i);
}
