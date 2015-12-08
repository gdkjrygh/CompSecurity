// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.vibration;

import android.app.Activity;
import android.os.Vibrator;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class Vibration extends CordovaPlugin
{

    public Vibration()
    {
    }

    public void cancelVibration()
    {
        ((Vibrator)cordova.getActivity().getSystemService("vibrator")).cancel();
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        boolean flag = false;
        if (s.equals("vibrate"))
        {
            vibrate(jsonarray.getLong(0));
        } else
        {
            if (!s.equals("vibrateWithPattern"))
            {
                continue;
            }
            s = jsonarray.getJSONArray(0);
            int j = jsonarray.getInt(1);
            jsonarray = new long[s.length() + 1];
            jsonarray[0] = 0L;
            for (int i = 0; i < s.length(); i++)
            {
                jsonarray[i + 1] = s.getLong(i);
            }

            vibrateWithPattern(jsonarray, j);
        }
        do
        {
            callbackcontext.success();
            flag = true;
            do
            {
                return flag;
            } while (!s.equals("cancelVibration"));
            cancelVibration();
        } while (true);
    }

    public void vibrate(long l)
    {
        long l1 = l;
        if (l == 0L)
        {
            l1 = 500L;
        }
        ((Vibrator)cordova.getActivity().getSystemService("vibrator")).vibrate(l1);
    }

    public void vibrateWithPattern(long al[], int i)
    {
        ((Vibrator)cordova.getActivity().getSystemService("vibrator")).vibrate(al, i);
    }
}
