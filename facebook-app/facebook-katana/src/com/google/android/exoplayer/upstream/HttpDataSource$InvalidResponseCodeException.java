// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import java.util.Map;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            DataSpec

public final class headerFields extends headerFields
{

    public final Map headerFields;
    public final int responseCode;

    public (int i, Map map, DataSpec dataspec)
    {
        super((new StringBuilder("Response code: ")).append(i).toString(), dataspec);
        responseCode = i;
        headerFields = map;
    }
}
