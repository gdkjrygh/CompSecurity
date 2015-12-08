// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.facebook;

import android.os.Bundle;
import android.util.Log;
import com.facebook.widget.FacebookDialog;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;

// Referenced classes of package org.apache.cordova.facebook:
//            ConnectPlugin

class val.me
    implements Runnable
{

    final ConnectPlugin this$0;
    final ConnectPlugin val$me;

    public void run()
    {
        com.facebook.widget.ssageDialogBuilder ssagedialogbuilder = new com.facebook.widget.ssageDialogBuilder(val$me.cordova.getActivity());
        if (ConnectPlugin.access$500(ConnectPlugin.this).containsKey("link"))
        {
            ssagedialogbuilder.setLink(ConnectPlugin.access$500(ConnectPlugin.this).getString("link"));
        }
        if (ConnectPlugin.access$500(ConnectPlugin.this).containsKey("caption"))
        {
            ssagedialogbuilder.setCaption(ConnectPlugin.access$500(ConnectPlugin.this).getString("caption"));
        }
        if (ConnectPlugin.access$500(ConnectPlugin.this).containsKey("name"))
        {
            ssagedialogbuilder.setName(ConnectPlugin.access$500(ConnectPlugin.this).getString("name"));
        }
        if (ConnectPlugin.access$500(ConnectPlugin.this).containsKey("picture"))
        {
            ssagedialogbuilder.setPicture(ConnectPlugin.access$500(ConnectPlugin.this).getString("picture"));
        }
        if (ConnectPlugin.access$500(ConnectPlugin.this).containsKey("description"))
        {
            ssagedialogbuilder.setDescription(ConnectPlugin.access$500(ConnectPlugin.this).getString("description"));
        }
        if (ssagedialogbuilder.canPresent())
        {
            ssagedialogbuilder.build().present();
            return;
        } else
        {
            ConnectPlugin.access$702(ConnectPlugin.this, false);
            Log.e("ConnectPlugin", "Messaging unavailable.");
            ConnectPlugin.access$100(ConnectPlugin.this).error("Messaging unavailable.");
            return;
        }
    }

    logBuilder()
    {
        this$0 = final_connectplugin;
        val$me = ConnectPlugin.this;
        super();
    }
}
