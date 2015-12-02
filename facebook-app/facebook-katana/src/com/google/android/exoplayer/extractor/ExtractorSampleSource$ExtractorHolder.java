// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import java.io.EOFException;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            Extractor, ExtractorInput, ExtractorOutput

final class b
{

    private final Extractor a[];
    private final ExtractorOutput b;
    private Extractor c;

    public final Extractor a(ExtractorInput extractorinput)
    {
        Extractor aextractor[];
        int i;
        int j;
        if (c != null)
        {
            return c;
        }
        aextractor = a;
        j = aextractor.length;
        i = 0;
_L2:
        Extractor extractor;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        extractor = aextractor[i];
        if (!extractor.a(extractorinput))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        c = extractor;
        EOFException eofexception;
        if (c == null)
        {
            throw new tFormatException(a);
        } else
        {
            c.a(b);
            return c;
        }
        eofexception;
        extractorinput.a();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public tFormatException(Extractor aextractor[], ExtractorOutput extractoroutput)
    {
        a = aextractor;
        b = extractoroutput;
    }
}
