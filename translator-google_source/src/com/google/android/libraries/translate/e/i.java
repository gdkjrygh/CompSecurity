// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.os.Bundle;

// Referenced classes of package com.google.android.libraries.translate.e:
//            h

final class i
    implements Runnable
{

    final int a;
    final Bundle b;

    i(int j, Bundle bundle)
    {
        a = j;
        b = bundle;
        super();
    }

    public final void run()
    {
        h.b(a, b);
    }
}
