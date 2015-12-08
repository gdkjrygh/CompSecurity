// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.f;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            c, i, ErrorCode, d

final class a extends f
{

    final com.squareup.okhttp.internal.framed.d a;
    final ode.b c;

    public final void b()
    {
        try
        {
            com.squareup.okhttp.internal.framed.c.f(c.c).a(a);
            return;
        }
        catch (IOException ioexception)
        {
            d.a.log(Level.INFO, (new StringBuilder("StreamHandler failure for ")).append(com.squareup.okhttp.internal.framed.c.a(c.c)).toString(), ioexception);
        }
        try
        {
            a.a(ErrorCode.b);
            return;
        }
        catch (IOException ioexception1)
        {
            return;
        }
    }

    transient ode(ode ode, String s, Object aobj[], com.squareup.okhttp.internal.framed.d d1)
    {
        c = ode;
        a = d1;
        super(s, aobj);
    }
}
