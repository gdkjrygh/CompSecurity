// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import bde;
import java.util.Map;

public final class headerFields extends headerFields
{

    public final Map headerFields;
    public final int responseCode;

    public (int i, Map map, bde bde)
    {
        super((new StringBuilder("Response code: ")).append(i).toString(), bde);
        responseCode = i;
        headerFields = map;
    }
}
