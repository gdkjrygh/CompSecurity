// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.InputStream;

// Referenced classes of package org.apache.cordova:
//            CordovaResourceApi

public static final class assetFd
{

    public final AssetFileDescriptor assetFd;
    public final InputStream inputStream;
    public final long length;
    public final String mimeType;
    public final Uri uri;

    (Uri uri1, InputStream inputstream, String s, long l, AssetFileDescriptor assetfiledescriptor)
    {
        uri = uri1;
        inputStream = inputstream;
        mimeType = s;
        length = l;
        assetFd = assetfiledescriptor;
    }
}
