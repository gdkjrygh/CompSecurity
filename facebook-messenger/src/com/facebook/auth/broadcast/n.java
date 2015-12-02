// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.broadcast;

import android.widget.Toast;

// Referenced classes of package com.facebook.auth.broadcast:
//            m

class n
    implements Runnable
{

    final String a;
    final int b;
    final m c;

    n(m m1, String s, int i)
    {
        c = m1;
        a = s;
        b = i;
        super();
    }

    public void run()
    {
        Toast.makeText(m.a(c), a, b).show();
    }
}
