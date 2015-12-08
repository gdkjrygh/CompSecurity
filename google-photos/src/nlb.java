// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class nlb
{

    public static final Uri a;
    public static final Uri b;
    public static final Uri c[];

    static 
    {
        a = android.provider.MediaStore.Video.Media.getContentUri("phoneStorage");
        b = android.provider.MediaStore.Images.Media.getContentUri("phoneStorage");
        c = (new Uri[] {
            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, b, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, a
        });
    }
}
