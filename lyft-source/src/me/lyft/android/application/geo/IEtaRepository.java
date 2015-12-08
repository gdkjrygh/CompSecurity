// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;


public interface IEtaRepository
{

    public abstract Long getClosestDriverEta(String s);

    public abstract Long getEta();

    public abstract Long getEtd();

    public abstract void updateClosestDriverEtas(String s, Long long1);

    public abstract void updateEta(Long long1);

    public abstract void updateEtd(Long long1);
}
