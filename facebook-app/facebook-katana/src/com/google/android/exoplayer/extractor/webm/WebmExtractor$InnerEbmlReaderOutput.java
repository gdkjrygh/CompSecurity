// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.extractor.ExtractorInput;

// Referenced classes of package com.google.android.exoplayer.extractor.webm:
//            EbmlReaderOutput, WebmExtractor

final class <init>
    implements EbmlReaderOutput
{

    final WebmExtractor a;

    public final int a(int i)
    {
        return WebmExtractor.a(i);
    }

    public final void a(int i, double d)
    {
        a.a(i, d);
    }

    public final void a(int i, int j, ExtractorInput extractorinput)
    {
        a.a(i, j, extractorinput);
    }

    public final void a(int i, long l)
    {
        a.a(i, l);
    }

    public final void a(int i, long l, long l1)
    {
        a.a(i, l, l1);
    }

    public final void a(int i, String s)
    {
        a.a(i, s);
    }

    public final void b(int i)
    {
        a.b(i);
    }

    private (WebmExtractor webmextractor)
    {
        a = webmextractor;
        super();
    }

    a(WebmExtractor webmextractor, byte byte0)
    {
        this(webmextractor);
    }
}
