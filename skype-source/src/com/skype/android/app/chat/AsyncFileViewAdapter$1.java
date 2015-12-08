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
//            AsyncFileViewAdapter

final class this._cls0
    implements android.view.ViewAdapter._cls1
{

    final AsyncFileViewAdapter this$0;

    public final void onClick(View view)
    {
        view = getContext().getResources().getQuantityString(0x7f0b0016, ecsConfiguration.getAsyncFileExpirationPeriod(), new Object[] {
            Integer.valueOf(ecsConfiguration.getAsyncFileExpirationPeriod())
        });
        view = getContext().getString(0x7f080472, new Object[] {
            view
        });
        android.app.lickListener licklistener = new android.app.it>(getContext());
        licklistener.Message(view);
        licklistener.NegativeButton(0x7f0802f6, null);
        licklistener.ate().show();
    }

    ()
    {
        this$0 = AsyncFileViewAdapter.this;
        super();
    }
}
