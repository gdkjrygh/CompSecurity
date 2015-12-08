// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils.images;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.soundcloud.android.utils.images:
//            ImageUtils

final class val.activity
    implements android.content.ce.OnClickListener
{

    final Activity val$activity;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ImageUtils.startPickImageIntent(val$activity, 9000);
    }

    ()
    {
        val$activity = activity1;
        super();
    }
}
