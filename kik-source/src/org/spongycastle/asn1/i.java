// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.InputStream;

// Referenced classes of package org.spongycastle.asn1:
//            f

abstract class i extends InputStream
{

    protected final InputStream a;
    private int b;

    i(InputStream inputstream, int j)
    {
        a = inputstream;
        b = j;
    }

    int a()
    {
        return b;
    }

    protected final void c()
    {
        if (a instanceof f)
        {
            ((f)a).a(true);
        }
    }
}
