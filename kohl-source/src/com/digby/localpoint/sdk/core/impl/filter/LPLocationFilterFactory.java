// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.filter;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPFilter;
import com.digby.localpoint.sdk.core.filter.ILPLocationFilterFactory;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

// Referenced classes of package com.digby.localpoint.sdk.core.impl.filter:
//            LPAllFilter, LPLocationAllowsCheckInFilter, LPDeviceIsInFilter, LPLocationByTagFilter, 
//            LPLocationWithinDistanceFilter

public class LPLocationFilterFactory
    implements ILPLocationFilterFactory
{

    private final Context mContext;

    public LPLocationFilterFactory(Context context)
    {
        mContext = context;
    }

    private Set jsonArrayToIntegerSet(JSONArray jsonarray)
    {
        HashSet hashset;
        int i;
        hashset = new HashSet(jsonarray.length());
        i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(Integer.valueOf(jsonarray.getInt(i)));
        i++;
        if (true) goto _L2; else goto _L1
        jsonarray;
        Logger.Error("Unable to convert JSONArray to Set of Integer", jsonarray);
_L1:
        return hashset;
    }

    public ILPFilter getAllFilter()
    {
        return new LPAllFilter();
    }

    public ILPFilter getAllowsCheckInFilter()
    {
        return new LPLocationAllowsCheckInFilter(mContext);
    }

    public ILPFilter getDeviceIsInFilter()
    {
        Set set = jsonArrayToIntegerSet(DigbyController.getInstance(mContext).getSharedPrefsManager().getGeoFencesInside());
        return new LPDeviceIsInFilter(mContext, set);
    }

    public ILPFilter getHasTagFilter(String s)
    {
        return new LPLocationByTagFilter(s);
    }

    public ILPFilter getWithinDistanceFilter(int i)
    {
        return new LPLocationWithinDistanceFilter(mContext, i);
    }
}
