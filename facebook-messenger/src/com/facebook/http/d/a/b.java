// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.d.a;

import com.facebook.http.a.a.a.i;
import java.io.OutputStream;

// Referenced classes of package com.facebook.http.d.a:
//            c, a

public class b extends i
{

    a a;

    public b()
    {
        a = null;
    }

    public void a(a a1)
    {
        a = a1;
    }

    public void writeTo(OutputStream outputstream)
    {
        Object obj = outputstream;
        if (a != null)
        {
            obj = new c(outputstream, a);
        }
        super.writeTo(((OutputStream) (obj)));
    }
}
