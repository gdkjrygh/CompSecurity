// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.utils;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.phunware.nbc.sochi.utils:
//            DialogUtil

static final class val.context
    implements android.content.ce.OnClickListener
{

    final Activity val$context;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        val$context.finish();
    }

    tener(Activity activity)
    {
        val$context = activity;
        super();
    }
}
