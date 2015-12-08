// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.widgets;

import android.view.View;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.widgets:
//            MiniController

class this._cls0
    implements android.view.ner
{

    final MiniController this$0;

    public void onClick(View view)
    {
        if (MiniController.access$100(MiniController.this) == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        MiniController.access$200(MiniController.this, true);
        MiniController.access$100(MiniController.this).onPlayPauseClicked(view);
        return;
        view;
        MiniController.access$100(MiniController.this).onFailed(com.google.android.libraries.cast.companionlibrary.ed_perform_action, -1);
        return;
        view;
        MiniController.access$100(MiniController.this).onFailed(com.google.android.libraries.cast.companionlibrary.ed_no_connection_trans, -1);
        return;
        view;
        MiniController.access$100(MiniController.this).onFailed(com.google.android.libraries.cast.companionlibrary.ed_no_connection, -1);
        return;
    }

    ionException()
    {
        this$0 = MiniController.this;
        super();
    }
}
