// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class nkw
{

    public static final Uri a[];
    private static Uri b;
    private static Uri c;

    static 
    {
        b = android.provider.MediaStore.Images.Media.getContentUri("phoneStorage");
        c = android.provider.MediaStore.Video.Media.getContentUri("phoneStorage");
        a = (new Uri[] {
            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, b, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, c
        });
    }
}
