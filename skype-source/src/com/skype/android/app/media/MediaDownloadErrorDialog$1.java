// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.skype.android.app.media:
//            MediaDownloadErrorDialog

final class this._cls0
    implements android.content.ener
{

    final MediaDownloadErrorDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i = 1;
        if (getArguments() == null || !getArguments().getBoolean("finishOnDismiss", true))
        {
            i = 0;
        }
        if (i != 0)
        {
            getActivity().onBackPressed();
            return;
        } else
        {
            dismiss();
            return;
        }
    }

    ()
    {
        this$0 = MediaDownloadErrorDialog.this;
        super();
    }
}
