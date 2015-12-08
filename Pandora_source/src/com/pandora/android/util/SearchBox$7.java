// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

// Referenced classes of package com.pandora.android.util:
//            SearchBox

class a extends ResultReceiver
{

    final SearchBox a;

    protected void onReceiveResult(int i, Bundle bundle)
    {
        SearchBox.c(a);
    }

    (SearchBox searchbox, Handler handler)
    {
        a = searchbox;
        super(handler);
    }
}
