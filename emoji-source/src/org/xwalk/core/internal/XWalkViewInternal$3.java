// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal

class val.activity
    implements android.content.ncelListener
{

    final XWalkViewInternal this$0;
    final Activity val$activity;

    public void onCancel(DialogInterface dialoginterface)
    {
        val$activity.finish();
    }

    ener()
    {
        this$0 = final_xwalkviewinternal;
        val$activity = Activity.this;
        super();
    }
}
