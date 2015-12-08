// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.api.QuitIntent;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.common.base.Optional;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            TosAcceptanceCheckFilter

final class this._cls0
    implements AsyncCallback
{

    final TosAcceptanceCheckFilter this$0;

    private void onSuccess(Optional optional)
    {
        TosAcceptanceCheckFilter.access$500(TosAcceptanceCheckFilter.this, optional);
    }

    public final void onFailure(Exception exception)
    {
        TosAcceptanceCheckFilter.access$300(TosAcceptanceCheckFilter.this).startActivity(QuitIntent.create());
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Optional)obj);
    }

    I()
    {
        this$0 = TosAcceptanceCheckFilter.this;
        super();
    }
}
