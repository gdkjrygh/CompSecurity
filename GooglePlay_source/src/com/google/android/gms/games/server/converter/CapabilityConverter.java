// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.constants.Capability;
import java.util.ArrayList;
import java.util.List;

public class CapabilityConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public CapabilityConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        int i = 0;
        obj = (List)obj;
        if (obj != null)
        {
            int k = ((List) (obj)).size();
            int j = 0;
            i = 0;
            for (; j < k; j++)
            {
                i |= 1 << Capability.fromString((String)((List) (obj)).get(j));
            }

        }
        return Integer.valueOf(i);
    }

    public final volatile Object convertBack(Object obj)
    {
        obj = (Integer)obj;
        ArrayList arraylist = new ArrayList();
        if (obj != null)
        {
            int j = ((Integer) (obj)).intValue();
            for (int i = 0; j > 0; i++)
            {
                if ((j & 1) != 0)
                {
                    arraylist.add(Capability.fromInt(i));
                }
                j >>= 1;
            }

        }
        return arraylist;
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
