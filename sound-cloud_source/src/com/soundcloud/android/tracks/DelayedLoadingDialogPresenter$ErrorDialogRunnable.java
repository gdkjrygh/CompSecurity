// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

// Referenced classes of package com.soundcloud.android.tracks:
//            DelayedLoadingDialogPresenter, LoadingAnimationView

private class <init>
    implements Runnable
{

    private final Context context;
    final DelayedLoadingDialogPresenter this$0;

    public void run()
    {
        DelayedLoadingDialogPresenter.access$700(DelayedLoadingDialogPresenter.this).stop();
        DelayedLoadingDialogPresenter.access$600(DelayedLoadingDialogPresenter.this).dismiss();
        DelayedLoadingDialogPresenter.access$602(DelayedLoadingDialogPresenter.this, null);
        Toast.makeText(context, DelayedLoadingDialogPresenter.access$800(DelayedLoadingDialogPresenter.this), 0).show();
    }

    private (Context context1)
    {
        this$0 = DelayedLoadingDialogPresenter.this;
        super();
        context = context1;
    }

    context(Context context1, context context2)
    {
        this(context1);
    }
}
