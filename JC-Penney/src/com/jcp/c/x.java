// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;

// Referenced classes of package com.jcp.c:
//            w, u

class x
    implements Runnable
{

    final w a;

    x(w w1)
    {
        a = w1;
        super();
    }

    public void run()
    {
        Toast.makeText(u.d(a.a), u.d(a.a).getResources().getString(0x7f0701be), 0).show();
    }
}
