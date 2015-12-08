// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.InputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            e

abstract class g extends InputStream
{

    protected final InputStream a;
    private int b;

    g(InputStream inputstream, int i)
    {
        a = inputstream;
        b = i;
    }

    int a()
    {
        return b;
    }

    protected final void c()
    {
        if (a instanceof e)
        {
            ((e)a).a(true);
        }
    }
}
