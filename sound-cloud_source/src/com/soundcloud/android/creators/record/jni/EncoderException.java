// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.jni;

import java.io.IOException;

// Referenced classes of package com.soundcloud.android.creators.record.jni:
//            VorbisConstants

public class EncoderException extends IOException
{

    public EncoderException(String s, int i)
    {
        super((new StringBuilder()).append(s).append(": ").append(VorbisConstants.getString(i)).toString());
    }
}
