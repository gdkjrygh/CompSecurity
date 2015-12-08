// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.DialogInterface;
import android.graphics.Bitmap;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            AttachmentPreviewDialog

class val.thumbnail
    implements android.content.istener
{

    final AttachmentPreviewDialog this$0;
    final Bitmap val$thumbnail;

    public void onDismiss(DialogInterface dialoginterface)
    {
        val$thumbnail.recycle();
        System.gc();
    }

    ()
    {
        this$0 = final_attachmentpreviewdialog;
        val$thumbnail = Bitmap.this;
        super();
    }
}
