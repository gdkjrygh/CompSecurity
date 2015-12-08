// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.facebook;

import android.os.Bundle;
import com.facebook.UiLifecycleHelper;
import com.facebook.widget.FacebookDialog;
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
        FacebookDialog facebookdialog = ((com.facebook.widget.hareDialogBuilder)((com.facebook.widget.hareDialogBuilder)((com.facebook.widget.hareDialogBuilder)((com.facebook.widget.hareDialogBuilder)((com.facebook.widget.hareDialogBuilder)(new com.facebook.widget.hareDialogBuilder(val$me.cordova.getActivity())).setName(ConnectPlugin.access$500(ConnectPlugin.this).getString("name"))).setCaption(ConnectPlugin.access$500(ConnectPlugin.this).getString("caption"))).setDescription(ConnectPlugin.access$500(ConnectPlugin.this).getString("description"))).setLink(ConnectPlugin.access$500(ConnectPlugin.this).getString("href"))).setPicture(ConnectPlugin.access$500(ConnectPlugin.this).getString("picture"))).build();
        ConnectPlugin.access$600(ConnectPlugin.this).trackPendingDialogCall(facebookdialog.present());
    }

    ogBuilder()
    {
        this$0 = final_connectplugin;
        val$me = ConnectPlugin.this;
        super();
    }
}
