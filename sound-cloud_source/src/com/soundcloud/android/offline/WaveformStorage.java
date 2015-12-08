// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.ContentValues;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.android.waveform.WaveformData;
import com.soundcloud.android.waveform.WaveformSerializer;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Exists;
import com.soundcloud.propeller.query.Query;

class WaveformStorage
{

    private static final String HAS_WAVEFORM = "has_waveform";
    private final DateProvider dateProvider;
    private final PropellerDatabase propeller;
    private final WaveformSerializer serializer;

    WaveformStorage(PropellerDatabase propellerdatabase, CurrentDateProvider currentdateprovider, WaveformSerializer waveformserializer)
    {
        propeller = propellerdatabase;
        dateProvider = currentdateprovider;
        serializer = waveformserializer;
    }

    private ContentValues buildContentValues(Urn urn, WaveformData waveformdata)
    {
        return ContentValuesBuilder.values().put("track_id", urn.getNumericId()).put("max_amplitude", waveformdata.maxAmplitude).put("samples", serializer.serialize(waveformdata.samples)).put("created_at", dateProvider.getCurrentTime()).get();
    }

    public boolean hasWaveform(Urn urn)
    {
        urn = Query.apply(ColumnFunctions.exists((Query)Query.from(new String[] {
            Table.Waveforms.name()
        }).whereEq("track_id", Long.valueOf(urn.getNumericId()))).as("has_waveform"));
        return ((Boolean)propeller.query(urn).first(java/lang/Boolean)).booleanValue();
    }

    public void store(Urn urn, WaveformData waveformdata)
    {
        propeller.upsert(Table.Waveforms, buildContentValues(urn, waveformdata));
    }
}
