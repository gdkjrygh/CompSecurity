// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk;

import android.app.Activity;

// Referenced classes of package com.apptentive.android.sdk:
//            Apptentive

public class ApptentiveActivity extends Activity
{

    public ApptentiveActivity()
    {
    }

    protected void onStart()
    {
        super.onStart();
        Apptentive.onStart(this);
    }

    protected void onStop()
    {
        super.onStop();
        Apptentive.onStop(this);
    }
}
