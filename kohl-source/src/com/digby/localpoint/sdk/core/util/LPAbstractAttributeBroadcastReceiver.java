// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.digby.localpoint.sdk.core.impl.LPAttributeValue;
import com.digby.localpoint.sdk.core.impl.LPError;
import com.digby.localpoint.sdk.core.profile.ILPAttributeListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class LPAbstractAttributeBroadcastReceiver extends BroadcastReceiver
    implements ILPAttributeListener
{

    private Context mContext;

    public LPAbstractAttributeBroadcastReceiver()
    {
    }

    private Map getAttributesFromIntent(Intent intent)
    {
        Object obj;
        obj = intent.getExtras().getString("attributesInUpdateRequest");
        intent = new HashMap();
        Iterator iterator;
        obj = new JSONObject(((String) (obj)));
        iterator = ((JSONObject) (obj)).keys();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s;
        Object obj1;
        s = (String)iterator.next();
        obj1 = ((JSONObject) (obj)).get(s);
        if (!(obj1 instanceof Integer)) goto _L4; else goto _L3
_L3:
        intent.put(s, new LPAttributeValue((Integer)obj1));
          goto _L5
        JSONException jsonexception;
        jsonexception;
        Log.e("DigbyLibrary", Arrays.toString(jsonexception.getStackTrace()));
_L2:
        return intent;
_L4:
label0:
        {
            if (!(obj1 instanceof Double))
            {
                break label0;
            }
            intent.put(s, new LPAttributeValue((Double)obj1));
        }
          goto _L5
label1:
        {
            if (!(obj1 instanceof Float))
            {
                break label1;
            }
            intent.put(s, new LPAttributeValue((Float)obj1));
        }
          goto _L5
        if (!(obj1 instanceof Boolean)) goto _L7; else goto _L6
_L6:
        intent.put(s, new LPAttributeValue((Boolean)obj1));
          goto _L5
_L7:
        if (!(obj1 instanceof String)) goto _L5; else goto _L8
_L8:
        intent.put(s, new LPAttributeValue((String)obj1));
          goto _L5
    }

    private LPError getErrorFromIntent(Intent intent)
    {
        try
        {
            intent = new LPError(intent.getExtras().getInt("errorCode"), intent.getExtras().getString("errorMessage"));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return new LPError(440, intent.getMessage());
        }
        return intent;
    }

    public Context getContext()
    {
        return mContext;
    }

    public void onReceive(Context context, Intent intent)
    {
        mContext = context;
        context = intent.getAction();
        if (context.equals("com.digby.localpoint.AttributesUpdateSuccess"))
        {
            onUpdateSuccess(getAttributesFromIntent(intent));
            return;
        }
        try
        {
            if (context.equals("com.digby.localpoint.AttributesUpdateFailure"))
            {
                onUpdateFailure(getAttributesFromIntent(intent), getErrorFromIntent(intent));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DigbyLibrary", Arrays.toString(context.getStackTrace()));
        }
        return;
    }
}
