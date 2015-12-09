// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.app.Dialog;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GooglePlayServicesUpdatedReceiver, SupportLifecycleFragment

final class val.updatingDialog extends GooglePlayServicesUpdatedReceiver
{

    final val.updatingDialog this$1;
    final Dialog val$updatingDialog;

    protected final void onUpdated()
    {
        SupportLifecycleFragment.access$400(_fld0);
        val$updatingDialog.dismiss();
    }

    ()
    {
        this$1 = final_;
        val$updatingDialog = Dialog.this;
        super();
    }
}
