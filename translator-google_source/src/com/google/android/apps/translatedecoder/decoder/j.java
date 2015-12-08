// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;


// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            i

public final class j extends i
{

    public j(DecoderOutput.ErrorCode errorcode, Exception exception)
    {
        super(errorcode.name(), exception.getMessage(), null);
    }

    public j(DecoderOutput.ErrorCode errorcode, String s, String s1)
    {
        super(errorcode.name(), s, s1);
    }

    public final volatile String a()
    {
        return super.a();
    }
}
