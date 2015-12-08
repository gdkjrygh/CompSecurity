// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.zzrb;
import com.google.android.gms.internal.zzrc;
import com.google.android.gms.internal.zzrm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable:
//            DataItem, DataMap, DataItemAsset, Asset

public class DataMapItem
{

    private final Uri a;
    private final DataMap b;

    private DataMapItem(DataItem dataitem)
    {
        a = dataitem.b();
        b = b((DataItem)dataitem.a());
    }

    public static DataMapItem a(DataItem dataitem)
    {
        if (dataitem == null)
        {
            throw new IllegalStateException("provided dataItem is null");
        } else
        {
            return new DataMapItem(dataitem);
        }
    }

    private DataMap b(DataItem dataitem)
    {
        if (dataitem.c() == null && dataitem.d().size() > 0)
        {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (dataitem.c() == null)
        {
            return new DataMap();
        }
        Object obj;
        int j;
        obj = new ArrayList();
        j = dataitem.d().size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        DataItemAsset dataitemasset = (DataItemAsset)dataitem.d().get(Integer.toString(i));
        if (dataitemasset == null)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder()).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(dataitem).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            Log.w("DataItem", (new StringBuilder()).append("Unable to parse datamap from dataItem. uri=").append(dataitem.b()).append(", data=").append(Base64.encodeToString(dataitem.c(), 0)).toString());
            throw new IllegalStateException((new StringBuilder()).append("Unable to parse datamap from dataItem.  uri=").append(dataitem.b()).toString(), ((Throwable) (obj)));
        }
        ((List) (obj)).add(Asset.a(dataitemasset.b()));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = zzrb.a(new com.google.android.gms.internal.zzrb.zza(zzrc.a(dataitem.c()), ((List) (obj))));
        return ((DataMap) (obj));
    }

    public DataMap a()
    {
        return b;
    }
}
