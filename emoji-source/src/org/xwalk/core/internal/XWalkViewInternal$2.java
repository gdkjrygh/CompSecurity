// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal

class val.packageName
    implements android.content.ickListener
{

    final XWalkViewInternal this$0;
    final Activity val$activity;
    final String val$packageName;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        val$activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(val$packageName).toString())));
        val$activity.finish();
    }

    ner()
    {
        this$0 = final_xwalkviewinternal;
        val$activity = activity1;
        val$packageName = String.this;
        super();
    }
}
