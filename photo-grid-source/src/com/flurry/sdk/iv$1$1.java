// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.widget.Toast;

// Referenced classes of package com.flurry.sdk:
//            jo

class >
    implements Runnable
{

    final int a;
    final how b;

    public void run()
    {
        Toast.makeText(jo.a().c(), (new StringBuilder("SD HTTP Response Code: ")).append(a).toString(), 0).show();
    }

    r(r r, int i)
    {
        b = r;
        a = i;
        super();
    }
}
