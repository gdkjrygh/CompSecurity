// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.c;
import com.android.slyce.a.b.l;
import java.io.IOException;
import java.nio.channels.SocketChannel;

// Referenced classes of package com.android.slyce.a:
//            r, s

class ac extends l
{

    SocketChannel a;
    c b;
    final r c;

    private ac(r r)
    {
        c = r;
        super();
    }

    ac(r r, s s)
    {
        this(r);
    }

    protected void a()
    {
        super.a();
        try
        {
            if (a != null)
            {
                a.close();
            }
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }
}
