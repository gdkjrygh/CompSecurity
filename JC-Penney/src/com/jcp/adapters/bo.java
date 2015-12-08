// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.util.Log;
import com.jcp.storepickup.pojo.Stores;
import java.util.Comparator;

// Referenced classes of package com.jcp.adapters:
//            PickUpFromStoreAdapter

class bo
    implements Comparator
{

    final PickUpFromStoreAdapter a;

    bo(PickUpFromStoreAdapter pickupfromstoreadapter)
    {
        a = pickupfromstoreadapter;
        super();
    }

    public int a(Stores stores, Stores stores1)
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (stores.getDistance() != null)
        {
            i = ((flag) ? 1 : 0);
            if (stores.getDistance().length() > 0)
            {
                i = ((flag) ? 1 : 0);
                if (stores1.getDistance() != null)
                {
                    i = ((flag) ? 1 : 0);
                    if (stores1.getDistance().length() > 0)
                    {
                        float f;
                        float f1;
                        try
                        {
                            f = Float.parseFloat(stores.getDistance());
                            f1 = Float.parseFloat(stores1.getDistance());
                        }
                        // Misplaced declaration of an exception variable
                        catch (Stores stores)
                        {
                            Log.e("Store List Adapter", "NumberFormatException while calculating distance between locations : ", stores);
                            return 0;
                        }
                        if ((double)(f - f1) > 0.0D)
                        {
                            i = 1;
                        } else
                        {
                            i = ((flag) ? 1 : 0);
                            if ((double)(f - f1) < 0.0D)
                            {
                                return -1;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Stores)obj, (Stores)obj1);
    }
}
