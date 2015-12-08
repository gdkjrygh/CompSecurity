// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.DialogInterface;

// Referenced classes of package com.skype.android.app.calling:
//            AfterCallEndedActivity

final class this._cls0
    implements android.content.Listener
{

    final AfterCallEndedActivity this$0;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        finish();
    }

    ()
    {
        this$0 = AfterCallEndedActivity.this;
        super();
    }
}
