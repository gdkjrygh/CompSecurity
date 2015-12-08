// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public final class oK extends pn
{

    private final File mPayload;

    public oK(File file)
    {
        mPayload = file;
    }

    public final boolean a()
    {
        return false;
    }

    public final Xz b()
    {
        if (mPayload == null)
        {
            return null;
        }
        Xu xu = BYTE_STREAM_MEDIA_TYPE;
        File file = mPayload;
        if (file == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            return new Xz._cls2(xu, file);
        }
    }
}
