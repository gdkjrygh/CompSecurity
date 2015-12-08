// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.statusbar;

import android.app.Activity;
import android.view.Window;
import org.apache.cordova.CordovaInterface;

// Referenced classes of package org.apache.cordova.statusbar:
//            StatusBar

class val.cordova
    implements Runnable
{

    final StatusBar this$0;
    final CordovaInterface val$cordova;

    public void run()
    {
        val$cordova.getActivity().getWindow().clearFlags(2048);
    }

    ()
    {
        this$0 = final_statusbar;
        val$cordova = CordovaInterface.this;
        super();
    }
}
