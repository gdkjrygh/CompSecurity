// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.contacts;

import android.util.Log;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.contacts:
//            ContactManager, ContactAccessor

class val.callbackContext
    implements Runnable
{

    final ContactManager this$0;
    final CallbackContext val$callbackContext;
    final JSONObject val$contact;

    public void run()
    {
        Object obj = null;
        String s = ContactManager.access$000(ContactManager.this).save(val$contact);
        JSONObject jsonobject = obj;
        if (s != null)
        {
            try
            {
                jsonobject = ContactManager.access$000(ContactManager.this).getContactById(s);
            }
            catch (JSONException jsonexception)
            {
                Log.e("Contact Query", "JSON fail.", jsonexception);
                jsonexception = obj;
            }
        }
        if (jsonobject != null)
        {
            val$callbackContext.success(jsonobject);
            return;
        } else
        {
            val$callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.us.ERROR, 0));
            return;
        }
    }

    ()
    {
        this$0 = final_contactmanager;
        val$contact = jsonobject;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
