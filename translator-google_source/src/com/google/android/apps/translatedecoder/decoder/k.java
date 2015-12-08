// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;


// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            i

public final class k extends i
{

    public k(DecoderOutput.FatalErrorCode fatalerrorcode, Exception exception)
    {
        super(fatalerrorcode.name(), exception.getMessage(), null);
    }

    public k(DecoderOutput.FatalErrorCode fatalerrorcode, String s, String s1)
    {
        super(fatalerrorcode.name(), s, s1);
    }

    public final volatile String a()
    {
        return super.a();
    }
}
