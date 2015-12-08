// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.contacts;

import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.contacts:
//            ContactManager, ContactAccessor

class val.callbackContext
    implements Runnable
{

    final ContactManager this$0;
    final CallbackContext val$callbackContext;
    final JSONArray val$filter;
    final JSONObject val$options;

    public void run()
    {
        JSONArray jsonarray = ContactManager.access$000(ContactManager.this).search(val$filter, val$options);
        val$callbackContext.success(jsonarray);
    }

    ()
    {
        this$0 = final_contactmanager;
        val$filter = jsonarray;
        val$options = jsonobject;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
