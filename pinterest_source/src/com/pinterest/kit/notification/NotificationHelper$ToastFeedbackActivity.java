// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.notification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.pinterest.base.Application;

// Referenced classes of package com.pinterest.kit.notification:
//            NotificationHelper

public class  extends Activity
{

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onResume()
    {
        super.onResume();
        Intent intent = getIntent();
        if (intent.hasExtra("com.pinterest.EXTRA_MESSAGE"))
        {
            Application.showToast(intent.getStringExtra("com.pinterest.EXTRA_MESSAGE"));
        }
        NotificationHelper.cancelAll();
        finish();
    }

    public ()
    {
    }
}
