// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.wearable.DataItem;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            k, l

public final class o extends d
    implements DataItem
{

    private final int Ya;

    public o(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        Ya = j;
    }

    public Object freeze()
    {
        return rp();
    }

    public Map getAssets()
    {
        HashMap hashmap = new HashMap(Ya);
        int i = 0;
        while (i < Ya) 
        {
            k k1 = new k(JG, KZ + i);
            if (k1.getDataItemKey() != null)
            {
                hashmap.put(k1.getDataItemKey(), k1);
            }
            i++;
        }
        return hashmap;
    }

    public byte[] getData()
    {
        return getByteArray("data");
    }

    public Uri getUri()
    {
        return Uri.parse(getString("path"));
    }

    public DataItem rp()
    {
        return new l(this);
    }

    public DataItem setData(byte abyte0[])
    {
        throw new UnsupportedOperationException();
    }
}
