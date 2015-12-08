// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.DialogInterface;
import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            AlertDialogFactory

static final class val.handler
    implements android.content.ckListener
{

    final Handler val$handler;
    final Runnable val$positiveButtonHandler;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (val$positiveButtonHandler != null)
        {
            val$handler.post(val$positiveButtonHandler);
        }
    }

    A(Runnable runnable, Handler handler1)
    {
        val$positiveButtonHandler = runnable;
        val$handler = handler1;
        super();
    }
}
