// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package b.a.a.a.a.b:
//            w

final class x
    implements w.c
{

    boolean a;
    final StringBuilder b;
    final w c;

    x(w w, StringBuilder stringbuilder)
    {
        c = w;
        b = stringbuilder;
        super();
        a = true;
    }

    public final void a(InputStream inputstream, int i)
        throws IOException
    {
        if (a)
        {
            a = false;
        } else
        {
            b.append(", ");
        }
        b.append(i);
    }
}
