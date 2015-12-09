// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.content.Intent;
import com.worklight.common.WLUtils;
import com.worklight.wlclient.api.WLCookieExtractor;
import java.util.Iterator;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NativePage extends Plugin
{

    public static int NATIVE_ACTIVITY_REQ_CODE = 54681;
    private CordovaInterface myactivity;

    public NativePage()
    {
        myactivity = null;
    }

    private Intent createIntentFromJSONData(String s)
        throws JSONException
    {
        Intent intent = new Intent();
        s = new JSONObject(s);
        Iterator iterator = s.keys();
        do
        {
            if (!iterator.hasNext())
            {
                return intent;
            }
            String s1 = (String)iterator.next();
            Object obj = s.get(s1);
            if (s.isNull(s1))
            {
                intent.putExtra(s1, null);
            } else
            if (obj.getClass() == java/lang/Boolean)
            {
                intent.putExtra(s1, (Boolean)obj);
            } else
            if (obj.getClass() == java/lang/Byte)
            {
                intent.putExtra(s1, (Byte)obj);
            } else
            if (obj.getClass() == java/lang/Character)
            {
                intent.putExtra(s1, (Character)obj);
            } else
            if (obj.getClass() == java/lang/Double)
            {
                intent.putExtra(s1, (Double)obj);
            } else
            if (obj.getClass() == java/lang/Float)
            {
                intent.putExtra(s1, (Float)obj);
            } else
            if (obj.getClass() == java/lang/Integer)
            {
                intent.putExtra(s1, (Integer)obj);
            } else
            if (obj.getClass() == java/lang/Long)
            {
                intent.putExtra(s1, (Long)obj);
            } else
            if (obj.getClass() == java/lang/Short)
            {
                intent.putExtra(s1, (Short)obj);
            } else
            if (obj.getClass() == java/lang/String)
            {
                intent.putExtra(s1, (String)obj);
            } else
            {
                WLUtils.debug((new StringBuilder("NAtivePage.createIntentFromJSONData: ")).append(obj.getClass().toString()).append(" is not supported type.").toString());
            }
        } while (true);
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        s1 = org.apache.cordova.api.PluginResult.Status.OK;
        try
        {
            if (s.equals("show"))
            {
                if (jsonarray.length() > 2)
                {
                    show(jsonarray.getString(0), jsonarray.getString(1), jsonarray.getString(2));
                } else
                {
                    show(jsonarray.getString(0), jsonarray.getString(1), null);
                }
            }
            return new PluginResult(s1, "");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLUtils.error(s.getMessage(), s);
        }
        return new PluginResult(org.apache.cordova.api.PluginResult.Status.JSON_EXCEPTION);
    }

    public boolean isSynch(String s)
    {
        return true;
    }

    public void setContext(CordovaInterface cordovainterface)
    {
        myactivity = cordovainterface;
    }

    public void show(String s, String s1, String s2)
    {
        try
        {
            WLCookieExtractor.cookies = s;
            s = new Intent(((Activity)myactivity).getApplicationContext(), Class.forName(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLUtils.error(s.getMessage(), s);
            return;
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (s2.contains("{") && s2.contains("}"))
        {
            s.putExtras(createIntentFromJSONData(s2));
        }
        myactivity.startActivityForResult(this, s, NATIVE_ACTIVITY_REQ_CODE);
        return;
    }

}
