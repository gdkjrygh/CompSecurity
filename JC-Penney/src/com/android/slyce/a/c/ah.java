// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.c;
import com.android.slyce.a.ag;
import java.io.IOException;

// Referenced classes of package com.android.slyce.a.c:
//            af, ae

class ah
    implements a
{

    final af a;

    ah(af af1)
    {
        a = af1;
        super();
    }

    public void a(Exception exception)
    {
        Object obj = exception;
        if (!a.a.i())
        {
            obj = exception;
            if (exception == null)
            {
                obj = new IOException("socket closed before proxy connect response");
            }
        }
        a.b.a.a(((Exception) (obj)), a.a);
    }
}
