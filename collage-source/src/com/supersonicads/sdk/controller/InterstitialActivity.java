// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.controller;

import android.os.Bundle;
import com.supersonicads.sdk.b.c;

// Referenced classes of package com.supersonicads.sdk.controller:
//            ControllerActivity

public class InterstitialActivity extends ControllerActivity
{

    private static final String e = com/supersonicads/sdk/controller/ControllerActivity.getSimpleName();

    public InterstitialActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c.a(e, "onCreate");
    }

    protected void onPause()
    {
        super.onPause();
        c.a(e, "onPause");
    }

    protected void onResume()
    {
        super.onResume();
        c.a(e, "onResume");
    }

}
