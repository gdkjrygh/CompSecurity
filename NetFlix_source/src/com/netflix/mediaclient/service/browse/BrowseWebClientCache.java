// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;


public interface BrowseWebClientCache
{

    public abstract String getCWId();

    public abstract String getIQId();

    public abstract String getLoLoMoId();

    public abstract void setCWId(String s);

    public abstract void setIQId(String s);

    public abstract void setLoLoMoId(String s);
}
