// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.save;


// Referenced classes of package com.snapchat.android.util.save:
//            SaveImageToGalleryTask

public static final class  extends Enum
{

    private static final SNAPCHAT_ALBUM $VALUES[];
    public static final SNAPCHAT_ALBUM MEDIA_STORE;
    public static final SNAPCHAT_ALBUM SNAPCHAT_ALBUM;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/save/SaveImageToGalleryTask$SaveLocation, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MEDIA_STORE = new <init>("MEDIA_STORE", 0);
        SNAPCHAT_ALBUM = new <init>("SNAPCHAT_ALBUM", 1);
        $VALUES = (new .VALUES[] {
            MEDIA_STORE, SNAPCHAT_ALBUM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
