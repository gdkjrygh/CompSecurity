// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.net.Uri;

// Referenced classes of package com.google.android.libraries.uploader.service.lib.service:
//            Uploader

final class listener
{

    private final String authorizationHeader;
    private final listener listener;
    private final String metadata;
    private final long size;
    final Uploader this$0;
    private final String uploadID;
    private final Uri uri;
    private final String url;








    (String s, String s1, Uri uri1, long l, String s2, 
            String s3,  )
    {
        this$0 = Uploader.this;
        super();
        url = s;
        authorizationHeader = s1;
        uri = uri1;
        size = l;
        metadata = s2;
        uploadID = s3;
        listener = ;
    }
}
