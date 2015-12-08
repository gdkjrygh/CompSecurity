// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.translate.widget:
//            HandwritingInputView

final class t extends BroadcastReceiver
{

    final HandwritingInputView a;

    t(HandwritingInputView handwritinginputview)
    {
        a = handwritinginputview;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (!intent.getAction().equals("com.google.android.apps.handwriting.ime.MODEL_DOWNLOAD_FAILED") && intent.getAction().equals("com.google.android.apps.handwriting.ime.DOWNLOADS_FINISHED"))
        {
            HandwritingInputView.a(a);
            HandwritingInputView.b(a);
        }
    }
}
