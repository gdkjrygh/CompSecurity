// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;


// Referenced classes of package com.google.android.exoplayer.extractor:
//            ExtractorInput, PositionHolder, ExtractorOutput

public interface Extractor
{

    public abstract int a(ExtractorInput extractorinput, PositionHolder positionholder);

    public abstract void a(ExtractorOutput extractoroutput);

    public abstract boolean a(ExtractorInput extractorinput);

    public abstract void b();
}
