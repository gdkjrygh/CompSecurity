// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;

public class CellResolution
{

    public static final CellResolution CELL_RESOLUTION_40x19 = new CellResolution(40, 19);
    public static final CellResolution CELL_RESOLUTION_52x19 = new CellResolution(52, 19);
    private static final String TAG = "nf_subtitles";
    private int mHeight;
    private int mWidth;

    private CellResolution(int i, int j)
    {
        mWidth = i;
        mHeight = j;
    }

    public static CellResolution createInstance(String s, String s1, String s2, float f)
    {
        if (!StringUtils.isEmpty(s))
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Cell resolution ").append(s).toString());
            }
            s = StringUtils.extractNumberPair(s);
            if (s != null && ((Integer)((Pair) (s)).first).intValue() > 0 && ((Integer)((Pair) (s)).second).intValue() > 0)
            {
                s = new CellResolution(((Integer)((Pair) (s)).first).intValue(), ((Integer)((Pair) (s)).second).intValue());
                if (Log.isLoggable("nf_subtitles", 3))
                {
                    Log.d("nf_subtitles", (new StringBuilder()).append("New cell resolution: ").append(s).toString());
                }
                return s;
            }
        }
        if (!StringUtils.isEmpty(s1))
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Cell resolution ajust using extent ").append(s1).toString());
            }
            Pair pair = StringUtils.extractNumberPair(s1);
            s1 = StringUtils.extractNumberPair(s2);
            s = s1;
            if (s1 != null)
            {
                s = new Pair(Integer.valueOf(1), Integer.valueOf(1));
            }
            if (pair != null)
            {
                int i = ((Integer)pair.first).intValue();
                int j = ((Integer)((Pair) (s)).first).intValue();
                int k = ((Integer)pair.second).intValue();
                if ((double)(float)((i * j) / (((Integer)((Pair) (s)).second).intValue() * k)) > 1.5D)
                {
                    return CELL_RESOLUTION_52x19;
                } else
                {
                    return CELL_RESOLUTION_40x19;
                }
            }
        } else
        {
            Log.d("nf_subtitles", "Find cell resolution not ajusted to extent");
        }
        if ((double)f > 1.5D)
        {
            return CELL_RESOLUTION_52x19;
        } else
        {
            return CELL_RESOLUTION_40x19;
        }
    }

    public int getHeightCount()
    {
        return mHeight;
    }

    public int getWidthCount()
    {
        return mWidth;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CellResolution [width count=").append(mWidth).append(", height count=").append(mHeight).append("]").toString();
    }

}
