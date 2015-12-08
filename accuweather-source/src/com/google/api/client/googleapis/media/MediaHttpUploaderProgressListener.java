// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.media;

import java.io.IOException;

// Referenced classes of package com.google.api.client.googleapis.media:
//            MediaHttpUploader

public interface MediaHttpUploaderProgressListener
{

    public abstract void progressChanged(MediaHttpUploader mediahttpuploader)
        throws IOException;
}
