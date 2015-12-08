// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.worklight.common.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NativePage extends CordovaPlugin
{

    public static final String ACTION_SHOW = "show";
    public static int NATIVE_ACTIVITY_REQ_CODE = 54681;
    private Logger logger;

    public NativePage()
    {
        logger = Logger.getInstance("NativePage");
    }

    private Intent createIntentFromJSONData(String s)
        throws JSONException
    {
        Intent intent = new Intent();
        s = new JSONObject(s);
        for (Iterator iterator = s.keys(); iterator.hasNext();)
        {
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
                logger.debug((new StringBuilder()).append("NAtivePage.createIntentFromJSONData: ").append(obj.getClass().toString()).append(" is not supported type.").toString());
            }
        }

        return intent;
    }

    private void show(JSONArray jsonarray)
        throws Exception
    {
        if (jsonarray.length() < 1)
        {
            throw new Exception("Expected parameters: activityClassName");
        }
        String s1 = jsonarray.getString(1);
        String s = null;
        if (jsonarray.length() > 2)
        {
            s = jsonarray.getString(2);
        }
        jsonarray = new Intent(cordova.getActivity().getApplicationContext(), Class.forName(s1));
        if (s != null && s.contains("{") && s.contains("}"))
        {
            jsonarray.putExtras(createIntentFromJSONData(s));
        }
        cordova.startActivityForResult(this, jsonarray, NATIVE_ACTIVITY_REQ_CODE);
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if (!"show".equals(s))
        {
            break MISSING_BLOCK_LABEL_26;
        }
        show(jsonarray);
        callbackcontext.success(org.apache.cordova.PluginResult.Status.OK.name());
        return true;
        try
        {
            callbackcontext.error((new StringBuilder()).append("Invalid action: ").append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            logger.debug((new StringBuilder()).append("NativePage.show failed. Reason is: ").append(s.getMessage()).toString(), s);
            callbackcontext.error((new StringBuilder()).append("NativePage.show failed. Reason is: ").append(s.getMessage()).toString());
            return true;
        }
        return true;
    }

    protected String getIntentDataInJSONFormat(Intent intent)
    {
        String s = "";
        Object obj = s;
        if (intent != null)
        {
            obj = s;
            if (intent.getExtras() != null)
            {
                Object obj1 = intent.getExtras().keySet();
                obj = new HashMap();
                String s1;
                for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((Map) (obj)).put(s1, intent.getExtras().get(s1)))
                {
                    s1 = (String)((Iterator) (obj1)).next();
                }

                obj = (new JSONObject(((Map) (obj)))).toString();
            }
        }
        return ((String) (obj));
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == NATIVE_ACTIVITY_REQ_CODE)
        {
            if (j == -1)
            {
                logger.debug("NativePage returned OK result code");
            } else
            {
                logger.debug((new StringBuilder()).append("Code returned from NativePage is ").append(j).toString());
            }
            intent = (new StringBuilder()).append("WL.NativePage.onNativePageClose(").append(getIntentDataInJSONFormat(intent)).append(")").toString();
            webView.sendJavascript(intent);
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

}
