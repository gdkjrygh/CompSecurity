// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.h;

// Referenced classes of package com.android.slyce.a:
//            i

class o
    implements Runnable
{

    final i a;

    o(i j)
    {
        a = j;
        super();
    }

    public void run()
    {
        if (a.j != null)
        {
            a.j.a();
        }
    }
}
