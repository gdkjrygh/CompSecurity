// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;

// Referenced classes of package org.apache.cordova:
//            CordovaActivity

class val.me
    implements android.content.CancelListener
{

    final CordovaActivity this$0;
    final CordovaActivity val$me;

    public void onCancel(DialogInterface dialoginterface)
    {
        val$me.spinnerDialog = null;
    }

    celListener()
    {
        this$0 = final_cordovaactivity;
        val$me = CordovaActivity.this;
        super();
    }
}
