// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.extractor.ExtractorInput;

// Referenced classes of package com.google.android.exoplayer.extractor.webm:
//            EbmlReaderOutput

interface EbmlReader
{

    public abstract void a();

    public abstract void a(EbmlReaderOutput ebmlreaderoutput);

    public abstract boolean a(ExtractorInput extractorinput);
}
