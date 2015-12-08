// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amplitude.api;

import android.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amplitude.api:
//            c

class 
    implements Runnable
{

    final JSONObject a;
    final boolean b;
    final c c;

    public void run()
    {
        Object obj1 = c;
        if (a == null)
        {
            if (b)
            {
                obj1.f = null;
            }
        } else
        {
            Object obj;
            JSONObject jsonobject;
            try
            {
                obj = new JSONObject(a.toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("com.amplitude.api.AmplitudeClient", ((JSONException) (obj)).toString());
                return;
            }
            jsonobject = ((c) (obj1)).f;
            if (b || jsonobject == null)
            {
                obj1.f = ((JSONObject) (obj));
                return;
            }
            obj1 = ((JSONObject) (obj)).keys();
            while (((Iterator) (obj1)).hasNext()) 
            {
                String s = (String)((Iterator) (obj1)).next();
                try
                {
                    jsonobject.put(s, ((JSONObject) (obj)).get(s));
                }
                catch (JSONException jsonexception)
                {
                    Log.e("com.amplitude.api.AmplitudeClient", jsonexception.toString());
                }
            }
        }
    }
}
