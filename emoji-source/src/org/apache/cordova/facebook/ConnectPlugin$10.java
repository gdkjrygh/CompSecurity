// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.facebook;

import com.facebook.Session;
import com.facebook.widget.WebDialog;
import org.apache.cordova.CordovaInterface;

// Referenced classes of package org.apache.cordova.facebook:
//            ConnectPlugin

class ner
    implements Runnable
{

    final ConnectPlugin this$0;
    final com.facebook.widget.eteListener val$dialogCallback;
    final ConnectPlugin val$me;

    public void run()
    {
        ((com.facebook.widget.logBuilder)(new com.facebook.widget.logBuilder(val$me.cordova.getActivity(), Session.getActiveSession(), ConnectPlugin.access$500(ConnectPlugin.this))).setOnCompleteListener(val$dialogCallback)).build().show();
    }

    ner()
    {
        this$0 = final_connectplugin;
        val$me = connectplugin1;
        val$dialogCallback = com.facebook.widget.eteListener.this;
        super();
    }
}
