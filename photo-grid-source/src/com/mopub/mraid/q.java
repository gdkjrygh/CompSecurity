// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.os.Handler;
import android.view.View;

// Referenced classes of package com.mopub.mraid:
//            r

final class q
{

    private final Handler a = new Handler();
    private r b;

    q()
    {
    }

    final transient r a(View aview[])
    {
        b = new r(a, aview, (byte)0);
        return b;
    }

    final void a()
    {
        if (b != null)
        {
            b.a();
            b = null;
        }
    }
}
