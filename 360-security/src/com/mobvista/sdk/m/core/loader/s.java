// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.util.Log;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            n

final class s
    implements Runnable
{

    final n a;

    s(n n1)
    {
        a = n1;
        super();
    }

    public final void run()
    {
        Log.e(n.a(), (new StringBuilder("http\u8D85\u65F6\uFF01\u8D85\u65F6\u4E0A\u9650\uFF1A")).append(n.l(a)).append("ms").toString());
        n.c(a);
    }
}
