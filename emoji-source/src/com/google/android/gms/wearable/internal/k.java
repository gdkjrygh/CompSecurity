// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            i

public class k extends d
    implements DataItemAsset
{

    public k(DataHolder dataholder, int j)
    {
        super(dataholder, j);
    }

    public Object freeze()
    {
        return nq();
    }

    public String getDataItemKey()
    {
        return getString("asset_key");
    }

    public String getId()
    {
        return getString("asset_id");
    }

    public DataItemAsset nq()
    {
        return new i(this);
    }
}
