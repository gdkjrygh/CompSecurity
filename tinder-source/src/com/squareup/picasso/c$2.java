// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            t, c, r

static final class eption extends t
{

    public final boolean a(r r)
    {
        return true;
    }

    public final eption b(r r)
        throws IOException
    {
        throw new IllegalStateException((new StringBuilder("Unrecognized type of request: ")).append(r).toString());
    }

    eption()
    {
    }
}
