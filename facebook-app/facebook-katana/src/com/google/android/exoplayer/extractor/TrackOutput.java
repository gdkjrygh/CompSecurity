// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            ExtractorInput

public interface TrackOutput
{

    public abstract int a(ExtractorInput extractorinput, int i, boolean flag);

    public abstract void a(long l, int i, int j, int k, byte abyte0[]);

    public abstract void a(MediaFormat mediaformat);

    public abstract void a(ParsableByteArray parsablebytearray, int i);
}
