// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder;


// Referenced classes of package com.skype.android.video.hw.codec.encoder:
//            AbstractVideoEncoder

public static class failedApiName extends Exception
{

    private static final long serialVersionUID = 1L;
    private String failedApiName;

    public String getFailedApiName()
    {
        return failedApiName;
    }

    public (String s, String s1)
    {
        super(s1);
        failedApiName = s;
    }
}
