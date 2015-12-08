// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.filter;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPFilter;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.localpoint.sdk.core.impl.LPLocation;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import com.digby.mm.android.library.utils.Logger;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

public class LPDeviceIsInFilter
    implements ILPFilter
{

    private Set geofenceIDsIn;
    private Context mContext;

    public LPDeviceIsInFilter(Context context)
    {
        mContext = context;
        geofenceIDsIn = jsonArrayToIntegerSet(DigbyController.getInstance(mContext).getSharedPrefsManager().getGeoFencesInside());
    }

    public LPDeviceIsInFilter(Context context, Set set)
    {
        geofenceIDsIn = set;
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

    public boolean accept(Object obj)
    {
        if (!(obj instanceof ILPLocation))
        {
            return false;
        }
        boolean flag;
        try
        {
            int i = Integer.parseInt(((LPLocation)obj).getID().getValue());
            flag = geofenceIDsIn.contains(Integer.valueOf(i));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logger.Error("Unable to evaluate if device is in object", ((Exception) (obj)));
            return false;
        }
        return flag;
    }
}
