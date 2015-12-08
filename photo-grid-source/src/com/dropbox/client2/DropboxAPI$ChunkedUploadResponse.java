// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import java.util.Map;

public final class offset
{

    private final long offset;
    private final String uploadId;

    public final long getOffset()
    {
        return offset;
    }

    public final String getUploadId()
    {
        return uploadId;
    }

    public (Map map)
    {
        uploadId = (String)map.get("upload_id");
        offset = ((Long)map.get("offset")).longValue();
    }
}
