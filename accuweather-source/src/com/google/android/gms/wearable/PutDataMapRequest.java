// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.lw;
import com.google.android.gms.internal.mf;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            DataMap, PutDataRequest, DataMapItem, Asset

public class PutDataMapRequest
{

    private final DataMap ali = new DataMap();
    private final PutDataRequest alj;

    private PutDataMapRequest(PutDataRequest putdatarequest, DataMap datamap)
    {
        alj = putdatarequest;
        if (datamap != null)
        {
            ali.putAll(datamap);
        }
    }

    public static PutDataMapRequest create(String s)
    {
        return new PutDataMapRequest(PutDataRequest.create(s), null);
    }

    public static PutDataMapRequest createFromDataMapItem(DataMapItem datamapitem)
    {
        return new PutDataMapRequest(PutDataRequest.j(datamapitem.getUri()), datamapitem.getDataMap());
    }

    public static PutDataMapRequest createWithAutoAppendedId(String s)
    {
        return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(s), null);
    }

    public PutDataRequest asPutDataRequest()
    {
        com.google.android.gms.internal.lw.a a = lw.a(ali);
        alj.setData(mf.d(a.amm));
        int j = a.amn.size();
        for (int i = 0; i < j; i++)
        {
            String s = Integer.toString(i);
            Asset asset = (Asset)a.amn.get(i);
            if (s == null)
            {
                throw new IllegalStateException((new StringBuilder()).append("asset key cannot be null: ").append(asset).toString());
            }
            if (asset == null)
            {
                throw new IllegalStateException((new StringBuilder()).append("asset cannot be null: key=").append(s).toString());
            }
            if (Log.isLoggable("DataMap", 3))
            {
                Log.d("DataMap", (new StringBuilder()).append("asPutDataRequest: adding asset: ").append(s).append(" ").append(asset).toString());
            }
            alj.putAsset(s, asset);
        }

        return alj;
    }

    public DataMap getDataMap()
    {
        return ali;
    }

    public Uri getUri()
    {
        return alj.getUri();
    }
}
