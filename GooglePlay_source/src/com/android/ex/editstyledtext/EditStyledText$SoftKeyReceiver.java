// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.editstyledtext;

import android.os.Bundle;
import android.os.ResultReceiver;

// Referenced classes of package com.android.ex.editstyledtext:
//            EditStyledText

private static class  extends ResultReceiver
{

    int mNewEnd;
    int mNewStart;

    protected void onReceiveResult(int i, Bundle bundle)
    {
        if (i != 2)
        {
            throw new NullPointerException();
        } else
        {
            return;
        }
    }
}
