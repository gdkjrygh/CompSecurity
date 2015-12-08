// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.media;


// Referenced classes of package com.google.api.client.googleapis.media:
//            MediaHttpUploader

public static final class  extends Enum
{

    private static final MEDIA_COMPLETE $VALUES[];
    public static final MEDIA_COMPLETE INITIATION_COMPLETE;
    public static final MEDIA_COMPLETE INITIATION_STARTED;
    public static final MEDIA_COMPLETE MEDIA_COMPLETE;
    public static final MEDIA_COMPLETE MEDIA_IN_PROGRESS;
    public static final MEDIA_COMPLETE NOT_STARTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/api/client/googleapis/media/MediaHttpUploader$UploadState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_STARTED = new <init>("NOT_STARTED", 0);
        INITIATION_STARTED = new <init>("INITIATION_STARTED", 1);
        INITIATION_COMPLETE = new <init>("INITIATION_COMPLETE", 2);
        MEDIA_IN_PROGRESS = new <init>("MEDIA_IN_PROGRESS", 3);
        MEDIA_COMPLETE = new <init>("MEDIA_COMPLETE", 4);
        $VALUES = (new .VALUES[] {
            NOT_STARTED, INITIATION_STARTED, INITIATION_COMPLETE, MEDIA_IN_PROGRESS, MEDIA_COMPLETE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
