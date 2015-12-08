// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public final class me extends oV
{

    private final pn mFile;
    private final String mUrl;

    public me(String s, File file)
    {
        mUrl = s;
        mFile = new oK(file);
    }

    public final pn getRequestPayload()
    {
        return mFile;
    }

    public final String getUrl()
    {
        return mUrl;
    }
}
