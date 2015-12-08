// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.DialogInterface;
import android.os.Bundle;

// Referenced classes of package com.skype.android.app.chat:
//            MediaUploadRetryDialogFragment, RetryDialogCallback

final class this._cls0
    implements android.content.Fragment._cls1
{

    final MediaUploadRetryDialogFragment this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (MediaUploadRetryDialogFragment.access$000(MediaUploadRetryDialogFragment.this) != null)
        {
            MediaUploadRetryDialogFragment.access$000(MediaUploadRetryDialogFragment.this).onRetryButtonClick(getArguments().getInt("messageId"), getArguments().getInt("mediaDocumentId"));
        }
    }

    A()
    {
        this$0 = MediaUploadRetryDialogFragment.this;
        super();
    }
}
