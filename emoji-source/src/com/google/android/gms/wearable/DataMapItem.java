// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.internal.lv;
import com.google.android.gms.internal.lw;
import com.google.android.gms.internal.md;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable:
//            DataItem, DataMap, DataItemAsset, Asset

public class DataMapItem
{

    private final DataMap all;
    private final Uri mUri;

    private DataMapItem(DataItem dataitem)
    {
        mUri = dataitem.getUri();
        all = a((DataItem)dataitem.freeze());
    }

    private DataMap a(DataItem dataitem)
    {
        ArrayList arraylist;
        DataItemAsset dataitemasset;
        int i;
        if (dataitem.getData() == null && dataitem.getAssets().size() > 0)
        {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (dataitem.getData() == null)
        {
            return new DataMap();
        }
        int j;
        try
        {
            arraylist = new ArrayList();
            j = dataitem.getAssets().size();
        }
        // Misplaced declaration of an exception variable
        catch (DataItem dataitem)
        {
            throw new IllegalStateException("Unable to parse. Not a DataItem.");
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        dataitemasset = (DataItemAsset)dataitem.getAssets().get(Integer.toString(i));
        if (dataitemasset != null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        throw new IllegalStateException((new StringBuilder()).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(dataitem).toString());
        arraylist.add(Asset.createFromRef(dataitemasset.getId()));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        dataitem = lv.a(new com.google.android.gms.internal.lv.a(lw.n(dataitem.getData()), arraylist));
        return dataitem;
    }

    public static DataMapItem fromDataItem(DataItem dataitem)
    {
        if (dataitem == null)
        {
            throw new IllegalStateException("provided dataItem is null");
        } else
        {
            return new DataMapItem(dataitem);
        }
    }

    public DataMap getDataMap()
    {
        return all;
    }

    public Uri getUri()
    {
        return mUri;
    }
}
