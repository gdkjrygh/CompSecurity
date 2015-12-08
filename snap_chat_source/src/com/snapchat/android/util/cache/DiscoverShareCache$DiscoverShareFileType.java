// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.cache;


// Referenced classes of package com.snapchat.android.util.cache:
//            DiscoverShareCache

public static final class  extends Enum
{

    private static final BLOB $VALUES[];
    public static final BLOB BLOB;
    public static final BLOB IMAGE;
    public static final BLOB METADATA;
    public static final BLOB VIDEO;
    public static final BLOB VIDEO_OVERLAY;
    public static final BLOB VIDEO_THUMBNAIL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/cache/DiscoverShareCache$DiscoverShareFileType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        METADATA = new <init>("METADATA", 0);
        IMAGE = new <init>("IMAGE", 1);
        VIDEO = new <init>("VIDEO", 2);
        VIDEO_THUMBNAIL = new <init>("VIDEO_THUMBNAIL", 3);
        VIDEO_OVERLAY = new <init>("VIDEO_OVERLAY", 4);
        BLOB = new <init>("BLOB", 5);
        $VALUES = (new .VALUES[] {
            METADATA, IMAGE, VIDEO, VIDEO_THUMBNAIL, VIDEO_OVERLAY, BLOB
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
