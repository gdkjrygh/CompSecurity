// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.util.Log;
import com.jcp.storepickup.pojo.Stores;
import java.util.Comparator;

// Referenced classes of package com.jcp.adapters:
//            cw

class cx
    implements Comparator
{

    final cw a;

    cx(cw cw)
    {
        a = cw;
        super();
    }

    public int a(Stores stores, Stores stores1)
    {
        if (stores.getDistance() == null || stores.getDistance().length() <= 0 || stores1.getDistance() == null || stores1.getDistance().length() <= 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        if ((double)(Float.parseFloat(stores.getDistance()) - Float.parseFloat(stores1.getDistance())) > 0.0D)
        {
            return 1;
        }
        float f;
        float f1;
        f = Float.parseFloat(stores.getDistance());
        f1 = Float.parseFloat(stores1.getDistance());
        if ((double)(f - f1) < 0.0D)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_96;
        stores;
        Log.e("Store List Adapter", "NumberFormatException while calculating distance between locations : ", stores);
        return 0;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Stores)obj, (Stores)obj1);
    }
}
