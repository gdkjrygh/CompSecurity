// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils.images;

import android.app.Activity;
import android.content.DialogInterface;
import java.io.File;

// Referenced classes of package com.soundcloud.android.utils.images:
//            ImageUtils

final class val.newImageLocation
    implements android.content.ce.OnClickListener
{

    final Activity val$activity;
    final File val$newImageLocation;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ImageUtils.startTakeNewPictureIntent(val$activity, val$newImageLocation, 9001);
    }

    ()
    {
        val$activity = activity1;
        val$newImageLocation = file;
        super();
    }
}
