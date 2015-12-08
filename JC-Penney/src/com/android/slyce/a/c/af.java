// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.c;
import com.android.slyce.a.ag;
import com.android.slyce.a.ax;

// Referenced classes of package com.android.slyce.a.c:
//            ae, ag, ah

class af
    implements a
{

    final ag a;
    final ae b;

    af(ae ae1, ag ag1)
    {
        b = ae1;
        a = ag1;
        super();
    }

    public void a(Exception exception)
    {
        if (exception != null)
        {
            b.a.a(exception, a);
            return;
        } else
        {
            exception = new ax();
            exception.a(new com.android.slyce.a.c.ag(this));
            a.a(exception);
            a.b(new ah(this));
            return;
        }
    }
}
