// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import me.lyft.android.domain.geo.EtaRecord;

public interface IEtaAnalyticService
{

    public abstract void clear();

    public abstract EtaRecord getRecord();

    public abstract void record(Boolean boolean1, Long long1);
}
