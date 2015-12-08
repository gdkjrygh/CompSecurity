// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.netflix.mediaclient.ui:
//            ServiceErrorsHandler

static final class val.activity
    implements android.content.Listener
{

    final Activity val$activity;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        val$activity.finish();
    }

    (Activity activity1)
    {
        val$activity = activity1;
        super();
    }
}
