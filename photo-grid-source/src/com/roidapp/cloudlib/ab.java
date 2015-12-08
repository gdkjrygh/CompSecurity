// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.DialogInterface;
import android.util.Log;

// Referenced classes of package com.roidapp.cloudlib:
//            t

final class ab
    implements android.content.DialogInterface.OnDismissListener
{

    final t a;

    ab(t t1)
    {
        a = t1;
        super();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        a.h = false;
        Log.i("BaseFragment", "download dialog is dismiss, set mIsDownloadDialogShow false.");
    }
}
