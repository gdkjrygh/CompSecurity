// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.f;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            c, b, m

final class a extends f
{

    final m a;
    final a c;

    public final void b()
    {
        try
        {
            c.c.i.a(a);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient ( , String s, Object aobj[], m m)
    {
        c = ;
        a = m;
        super(s, aobj);
    }
}
