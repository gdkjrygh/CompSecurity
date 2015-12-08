// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.contacts;

import android.content.Intent;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;

// Referenced classes of package org.apache.cordova.contacts:
//            ContactManager

class val.plugin
    implements Runnable
{

    final ContactManager this$0;
    final CordovaPlugin val$plugin;

    public void run()
    {
        Intent intent = new Intent("android.intent.action.PICK", android.provider.Contacts.CONTENT_URI);
        val$plugin.cordova.startActivityForResult(val$plugin, intent, 1000);
    }

    ()
    {
        this$0 = final_contactmanager;
        val$plugin = CordovaPlugin.this;
        super();
    }
}
