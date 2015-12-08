// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.view.View;
import com.skype.android.config.ecs.EcsConfiguration;

// Referenced classes of package com.skype.android.app.chat:
//            AsyncVideoMessageViewAdapter

final class this._cls0
    implements android.view.ViewAdapter._cls1
{

    final AsyncVideoMessageViewAdapter this$0;

    public final void onClick(View view)
    {
        view = getContext().getResources().getQuantityString(0x7f0b0016, ecsConfiguration.getAsyncVideoExpirationPeriod(), new Object[] {
            Integer.valueOf(ecsConfiguration.getAsyncVideoExpirationPeriod())
        });
        view = getContext().getString(0x7f0801b7, new Object[] {
            view
        });
        android.app.ener ener = new android.app.eViewAdapter.getContext(getContext());
        ener.getContext(view);
        ener.Button(0x7f0802f6, null);
        ener.ener().show();
    }

    ()
    {
        this$0 = AsyncVideoMessageViewAdapter.this;
        super();
    }
}
