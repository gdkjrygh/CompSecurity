// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText

class a extends ResultReceiver
{

    private CaptionEditText a;

    public void onReceiveResult(int i, Bundle bundle)
    {
        Timber.c("CaptionEditText", "CaptionDebug: result from IME is %d", new Object[] {
            Integer.valueOf(i)
        });
        if (i == 2 || i == 0)
        {
            CaptionEditText.a(a, true);
        } else
        if (i == 3 || i == 1)
        {
            CaptionEditText.a(a, false);
            return;
        }
    }

    public (CaptionEditText captionedittext)
    {
        a = captionedittext;
        super(null);
    }
}
