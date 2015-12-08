// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import android.content.ContentValues;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import rx.b;

// Referenced classes of package com.soundcloud.android.waveform:
//            WaveformData, WaveformSerializer

class WaveformStorage
{
    private static class WaveformMapper extends RxResultMapper
    {

        private final WaveformSerializer serializer;

        public WaveformData map(CursorReader cursorreader)
        {
            return new WaveformData(cursorreader.getInt("max_amplitude"), serializer.deserialize(cursorreader.getString("samples")));
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private WaveformMapper(WaveformSerializer waveformserializer)
        {
            serializer = waveformserializer;
        }

        WaveformMapper(WaveformSerializer waveformserializer, _cls1 _pcls1)
        {
            this(waveformserializer);
        }
    }


    private final DateProvider dateProvider;
    private final PropellerRx propellerRx;
    private final WaveformSerializer serializer;

    public WaveformStorage(PropellerRx propellerrx, CurrentDateProvider currentdateprovider, WaveformSerializer waveformserializer)
    {
        propellerRx = propellerrx;
        dateProvider = currentdateprovider;
        serializer = waveformserializer;
    }

    private ContentValues buildContentValues(Urn urn, WaveformData waveformdata)
    {
        return ContentValuesBuilder.values().put("track_id", urn.getNumericId()).put("max_amplitude", waveformdata.maxAmplitude).put("samples", serializer.serialize(waveformdata.samples)).put("created_at", dateProvider.getCurrentTime()).get();
    }

    private Query waveformQuery(Urn urn)
    {
        return (Query)Query.from(new String[] {
            Table.Waveforms.name()
        }).select(new Object[] {
            "max_amplitude", "samples"
        }).whereEq("track_id", Long.valueOf(urn.getNumericId()));
    }

    public b load(Urn urn)
    {
        return propellerRx.query(waveformQuery(urn)).map(new WaveformMapper(serializer, null));
    }

    public b store(Urn urn, WaveformData waveformdata)
    {
        return propellerRx.upsert(Table.Waveforms, buildContentValues(urn, waveformdata));
    }
}
