// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            n

final class a
    implements a
{

    boolean a;
    final StringBuilder b;
    final n c;

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

    (n n1, StringBuilder stringbuilder)
    {
        c = n1;
        b = stringbuilder;
        super();
        a = true;
    }
}
