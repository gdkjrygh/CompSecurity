// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.contacts;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

// Referenced classes of package org.apache.cordova.contacts:
//            ContactManager, ContactAccessor

class val.callbackContext
    implements Runnable
{

    final ContactManager this$0;
    final CallbackContext val$callbackContext;
    final String val$contactId;

    public void run()
    {
        if (ContactManager.access$000(ContactManager.this).remove(val$contactId))
        {
            val$callbackContext.success();
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
        val$contactId = s;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
