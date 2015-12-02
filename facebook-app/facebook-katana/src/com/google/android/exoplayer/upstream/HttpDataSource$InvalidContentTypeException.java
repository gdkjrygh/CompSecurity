// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;


// Referenced classes of package com.google.android.exoplayer.upstream:
//            DataSpec

public final class contentType extends contentType
{

    public final String contentType;

    public (String s, DataSpec dataspec)
    {
        super((new StringBuilder("Invalid content type: ")).append(s).toString(), dataspec);
        contentType = s;
    }
}
