// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            NetworkPolicy

public class responseCode extends IOException
{

    public final boolean localCacheOnly;
    public final int responseCode;

    public (String s, int i, int j)
    {
        super(s);
        localCacheOnly = NetworkPolicy.c(i);
        responseCode = j;
    }
}
