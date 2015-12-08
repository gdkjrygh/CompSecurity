// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.pinterest.activity.task.dialog.BaseDialog;
import java.util.List;

final class val.context
    implements com.pinterest.activity.task.dialog.lickListener
{

    final List val$apps;
    final Context val$context;
    final Intent val$intent;

    public final void onClick(BaseDialog basedialog, int i)
    {
        val$intent.putExtra("com.pinterest.EXTRA_SOURCE_PACKAGE", ((ResolveInfo)val$apps.get(i)).activityInfo.packageName);
        val$context.startActivity(val$intent);
        basedialog.dismiss();
    }

    ckListener()
    {
        val$intent = intent1;
        val$apps = list;
        val$context = context1;
        super();
    }
}
