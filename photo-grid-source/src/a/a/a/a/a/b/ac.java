// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import java.io.InputStream;

// Referenced classes of package a.a.a.a.a.b:
//            af, ab

final class ac
    implements af
{

    boolean a;
    final StringBuilder b;
    final ab c;

    ac(ab ab, StringBuilder stringbuilder)
    {
        c = ab;
        b = stringbuilder;
        super();
        a = true;
    }

    public final void a(InputStream inputstream, int i)
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
