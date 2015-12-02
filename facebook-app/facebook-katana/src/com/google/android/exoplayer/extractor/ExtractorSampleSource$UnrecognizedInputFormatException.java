// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            Extractor

public final class  extends ParserException
{

    public (Extractor aextractor[])
    {
        super((new StringBuilder("None of the available extractors (")).append(Util.a(aextractor)).append(") could read the stream.").toString());
    }
}
