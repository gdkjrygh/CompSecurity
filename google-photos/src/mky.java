// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

abstract class mky
{

    private mky()
    {
    }

    mky(byte byte0)
    {
        this();
    }

    protected abstract Object a(JSONArray jsonarray);

    public final List b(JSONArray jsonarray)
    {
        ArrayList arraylist;
        int i;
        if (jsonarray == null)
        {
            i = 0;
        } else
        {
            i = jsonarray.length();
        }
        arraylist = new ArrayList(i);
        if (jsonarray != null && jsonarray.length() >= 2)
        {
            double d = jsonarray.optJSONArray(0).optDouble(0);
            Object obj = a(jsonarray.optJSONArray(0));
            android.animation.TimeInterpolator timeinterpolator = mkt.e(jsonarray.optJSONArray(0).optJSONObject(2));
            for (i = 1; i < jsonarray.length();)
            {
                JSONArray jsonarray1 = jsonarray.optJSONArray(i);
                if (jsonarray1 == null)
                {
                    jsonarray = String.valueOf(Integer.toString(i));
                    if (jsonarray.length() != 0)
                    {
                        jsonarray = "Unexpected keyframe at index ".concat(jsonarray);
                    } else
                    {
                        jsonarray = new String("Unexpected keyframe at index ");
                    }
                    throw new mlb(jsonarray);
                }
                if (jsonarray1.length() < 2)
                {
                    jsonarray = String.valueOf(Integer.toString(i));
                    if (jsonarray.length() != 0)
                    {
                        jsonarray = "Not enough values in keyframe at index ".concat(jsonarray);
                    } else
                    {
                        jsonarray = new String("Not enough values in keyframe at index ");
                    }
                    throw new mlb(jsonarray);
                }
                double d1 = jsonarray1.optDouble(0);
                Object obj1 = a(jsonarray1);
                arraylist.add(new mkz(d, d1 - d, obj, obj1, timeinterpolator));
                timeinterpolator = mkt.e(jsonarray1.optJSONObject(2));
                i++;
                obj = obj1;
                d = d1;
            }

        }
        return arraylist;
    }
}
