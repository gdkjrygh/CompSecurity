// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;

// Referenced classes of package org.apache.cordova:
//            DroidGap

class val.me
    implements android.content.face.OnCancelListener
{

    final DroidGap this$0;
    final DroidGap val$me;

    public void onCancel(DialogInterface dialoginterface)
    {
        val$me.spinnerDialog = null;
    }

    e()
    {
        this$0 = final_droidgap;
        val$me = DroidGap.this;
        super();
    }
}
