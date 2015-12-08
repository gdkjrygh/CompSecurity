// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.content.Context;
import android.view.View;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.help.api.HelpUrls;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinView

final class this._cls0
    implements android.view.ckListener
{

    final PinView this$0;

    public final void onClick(View view)
    {
        view = HelpUrls.createPinHelpUrl();
        getContext().startActivity(UriIntents.create(getContext(), view));
    }

    ()
    {
        this$0 = PinView.this;
        super();
    }
}
