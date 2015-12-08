// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;
import com.google.android.gms.wearable.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ke, kf

public final class kg extends b
    implements c
{

    private final int LE;

    public kg(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        LE = j;
    }

    public Object freeze()
    {
        return mg();
    }

    public byte[] getData()
    {
        return getByteArray("data");
    }

    public Uri getUri()
    {
        return Uri.parse(getString("path"));
    }

    public Map ma()
    {
        HashMap hashmap = new HashMap(LE);
        int i = 0;
        while (i < LE) 
        {
            ke ke1 = new ke(BB, BD + i);
            if (ke1.mc() != null)
            {
                hashmap.put(ke1.mc(), ke1);
            }
            i++;
        }
        return hashmap;
    }

    public Set mb()
    {
        HashSet hashset = new HashSet();
        String s = getString("tags");
        if (s != null)
        {
            String as[] = s.split("\\|");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                hashset.add(as[i]);
            }

        }
        return hashset;
    }

    public c mg()
    {
        return new kf(this);
    }
}
