// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.database.AbstractCursor;
import com.pandora.radio.data.PromotedStation;
import com.pandora.radio.data.StationRecommendation;
import com.pandora.radio.data.StationRecommendations;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.pandora.radio.provider:
//            k

public class j extends AbstractCursor
{

    private StationRecommendation a[];
    private final StationRecommendation b;

    public j()
    {
        a = null;
        b = null;
    }

    public j(StationRecommendations stationrecommendations, PromotedStation promotedstation, boolean flag, boolean flag1)
    {
        if (stationrecommendations == null)
        {
            throw new InvalidParameterException("allStationRecommendations parameter cannot be null");
        }
        if (!flag || flag1) goto _L2; else goto _L1
_L1:
        StationRecommendation astationrecommendation[];
        Iterator iterator;
        astationrecommendation = k.a(stationrecommendations, null, null, false);
        iterator = stationrecommendations.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        StationRecommendation stationrecommendation = (StationRecommendation)iterator.next();
        if (a(stationrecommendation, astationrecommendation)) goto _L5; else goto _L4
_L4:
        b = stationrecommendation;
        if (flag1)
        {
            a = k.b(stationrecommendations);
            return;
        } else
        {
            a = k.a(stationrecommendations, promotedstation, b, false);
            return;
        }
_L2:
        stationrecommendation = null;
        if (true) goto _L4; else goto _L6
_L6:
    }

    private static boolean a(StationRecommendation stationrecommendation, StationRecommendation astationrecommendation[])
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < astationrecommendation.length)
                {
                    if (astationrecommendation[i] != stationrecommendation)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public StationRecommendation a(int i)
    {
        return a[i];
    }

    public StationRecommendation[] a()
    {
        return (StationRecommendation[])Arrays.copyOf(a, a.length);
    }

    public StationRecommendation b()
    {
        return b;
    }

    public byte[] getBlob(int i)
    {
        throw new UnsupportedOperationException("getBlob not supported");
    }

    public String[] getColumnNames()
    {
        return (new String[] {
            "_id", "stations.StationRecommendation"
        });
    }

    public int getCount()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.length;
        }
    }

    public double getDouble(int i)
    {
        throw new UnsupportedOperationException("getDouble not supported");
    }

    public float getFloat(int i)
    {
        throw new UnsupportedOperationException("getFloat not supported");
    }

    public int getInt(int i)
    {
        throw new UnsupportedOperationException("getInt not supported");
    }

    public long getLong(int i)
    {
        if (i == 0)
        {
            return (long)(0x5f5e100 + mPos);
        } else
        {
            throw new UnsupportedOperationException("getLong not supported for columns other than 0");
        }
    }

    public short getShort(int i)
    {
        throw new UnsupportedOperationException("getShort not supported");
    }

    public String getString(int i)
    {
        throw new UnsupportedOperationException("getString not supported");
    }

    public int getType(int i)
    {
        return 4;
    }

    public boolean isNull(int i)
    {
        return false;
    }
}
