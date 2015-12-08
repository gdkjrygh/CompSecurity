// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.geo;

import me.lyft.android.common.INullable;

public class EtaRecord
    implements INullable
{

    private final Long eta;
    private final Boolean isInternal;

    public EtaRecord(Boolean boolean1, Long long1)
    {
        isInternal = boolean1;
        eta = long1;
    }

    public static EtaRecord empty()
    {
        return NullEtaRecord.instance;
    }

    public Long getEta()
    {
        return eta;
    }

    public Boolean isInternal()
    {
        return isInternal;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullEtaRecord extends EtaRecord
    {

        private static final EtaRecord instance = new NullEtaRecord();

        public boolean isNull()
        {
            return true;
        }



        public NullEtaRecord()
        {
            super(null, null);
        }
    }

}
