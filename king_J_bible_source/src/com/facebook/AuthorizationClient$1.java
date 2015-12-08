// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Intent;

// Referenced classes of package com.facebook:
//            AuthorizationClient

class val.activity
    implements artActivityDelegate
{

    final AuthorizationClient this$0;
    private final Activity val$activity;

    public Activity getActivityContext()
    {
        return val$activity;
    }

    public void startActivityForResult(Intent intent, int i)
    {
        val$activity.startActivityForResult(intent, i);
    }

    artActivityDelegate()
    {
        this$0 = final_authorizationclient;
        val$activity = Activity.this;
        super();
    }
}
