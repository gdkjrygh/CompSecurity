// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import me.lyft.android.common.Objects;
import me.lyft.android.domain.geo.EtaRecord;

// Referenced classes of package me.lyft.android.application.geo:
//            IEtaAnalyticService

public class EtaAnalyticService
    implements IEtaAnalyticService
{

    private EtaRecord etaRecord;

    public EtaAnalyticService()
    {
    }

    public void clear()
    {
        etaRecord = null;
    }

    public EtaRecord getRecord()
    {
        return (EtaRecord)Objects.firstNonNull(etaRecord, EtaRecord.empty());
    }

    public void record(Boolean boolean1, Long long1)
    {
        etaRecord = new EtaRecord(boolean1, long1);
    }
}
