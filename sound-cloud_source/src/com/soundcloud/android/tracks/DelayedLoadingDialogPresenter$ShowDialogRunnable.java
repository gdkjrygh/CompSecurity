// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.app.AlertDialog;

// Referenced classes of package com.soundcloud.android.tracks:
//            DelayedLoadingDialogPresenter, LoadingAnimationView

private class <init>
    implements Runnable
{

    final DelayedLoadingDialogPresenter this$0;

    public void run()
    {
        DelayedLoadingDialogPresenter.access$502(DelayedLoadingDialogPresenter.this, System.currentTimeMillis());
        DelayedLoadingDialogPresenter.access$600(DelayedLoadingDialogPresenter.this).show();
        DelayedLoadingDialogPresenter.access$700(DelayedLoadingDialogPresenter.this).start();
    }

    private ()
    {
        this$0 = DelayedLoadingDialogPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
