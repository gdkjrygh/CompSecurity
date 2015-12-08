// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geofence.impl;

import android.content.Context;
import android.database.Cursor;
import com.digby.localpoint.sdk.core.impl.LPTag;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.geoshape.impl.CircularGeoShape;
import com.digby.mm.android.library.utils.Logger;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GeoFence
    implements IGeoFence
{

    private static final String TAG_SEPARATOR = ",;,";
    private String locationCode;
    private String mBSSID;
    private Context mContext;
    private String mDescription;
    private IGeoShape mGeoShape;
    private int mID;
    private boolean mIsInside;
    private double mLastKnownDistance;
    private String mName;
    private String mSSID;
    private Set mValidEventTypes;
    private Set tags;

    public GeoFence(Cursor cursor, Context context)
    {
        boolean flag;
        flag = true;
        super();
        mID = -1;
        mSSID = "";
        mBSSID = "";
        mContext = context;
        mID = cursor.getInt(0);
        mBSSID = cursor.getString(1);
        mSSID = cursor.getString(2);
        mGeoShape = getGeoShape(cursor.getString(3));
        mLastKnownDistance = cursor.getDouble(4);
        if (cursor.getInt(5) != 1)
        {
            flag = false;
        }
        mIsInside = flag;
        mValidEventTypes = inflateValidEventTypes(cursor.getString(6));
        mName = cursor.getString(7);
        mDescription = cursor.getString(8);
        locationCode = cursor.getString(9);
        tags = getTags(cursor.getString(10));
        return;
        cursor;
        Logger.Error("GeoFence", cursor);
        return;
    }

    private IGeoShape getGeoShape(String s)
    {
        Object obj = null;
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.Error("getGeoShape", s);
            return null;
        }
        s = obj;
        if (jsonobject.getString("type").equals(CircularGeoShape.getTypeID()))
        {
            s = new CircularGeoShape(jsonobject, this, mContext);
        }
        return s;
    }

    private Set getTags(String s)
    {
        HashSet hashset = new HashSet();
        s = new JSONArray(s);
        if (s.length() <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L3:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(new LPTag(s.getString(i)));
        i++;
        if (true) goto _L3; else goto _L2
        s;
        Logger.Error("inflateValidTags", s);
_L2:
        return hashset;
    }

    private Set inflateValidEventTypes(String s)
    {
        HashSet hashset = new HashSet();
        s = new JSONArray(s);
        int i = 0;
_L2:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(s.get(i).toString());
        i++;
        if (true) goto _L2; else goto _L1
        s;
        Logger.Error("inflateValidEventTypes", s);
_L1:
        return hashset;
    }

    public boolean equals(Object obj)
    {
        return ((IGeoFence)obj).getID() == getID();
    }

    public String getBSSID()
    {
        return mBSSID;
    }

    public String getDescription()
    {
        return mDescription;
    }

    public IGeoShape getGeoShape()
    {
        return mGeoShape;
    }

    public long getID()
    {
        return (long)mID;
    }

    public String getLocationCode()
    {
        return locationCode;
    }

    public String getName()
    {
        return mName;
    }

    public String getSSID()
    {
        return mSSID;
    }

    public Set getTags()
    {
        return tags;
    }

    public boolean isValidEventType(Class class1)
    {
        boolean flag;
        try
        {
            class1 = class1.getDeclaredField("TYPE_ID");
            class1.setAccessible(true);
            class1 = class1.get(null).toString();
            flag = mValidEventTypes.contains(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            Logger.Error("isValidEventType", class1);
            return false;
        }
        return flag;
    }
}
