// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


public final class MediaLinkSaveError extends Enum
{

    private static final MediaLinkSaveError $VALUES[];
    public static final MediaLinkSaveError MISSING_EXTERNAL_DEVICE;
    public static final MediaLinkSaveError NONE;
    public static final MediaLinkSaveError OUT_OF_MEMORY;
    public static final MediaLinkSaveError UNKNOWN_ERROR;

    private MediaLinkSaveError(String s, int i)
    {
        super(s, i);
    }

    public static final MediaLinkSaveError value(int i)
    {
        MediaLinkSaveError amedialinksaveerror[] = values();
        int k = amedialinksaveerror.length;
        for (int j = 0; j < k; j++)
        {
            MediaLinkSaveError medialinksaveerror = amedialinksaveerror[j];
            if (medialinksaveerror.ordinal() == i)
            {
                return medialinksaveerror;
            }
        }

        return UNKNOWN_ERROR;
    }

    public static MediaLinkSaveError valueOf(String s)
    {
        return (MediaLinkSaveError)Enum.valueOf(com/skype/android/app/media/MediaLinkSaveError, s);
    }

    public static MediaLinkSaveError[] values()
    {
        return (MediaLinkSaveError[])$VALUES.clone();
    }

    static 
    {
        NONE = new MediaLinkSaveError("NONE", 0);
        MISSING_EXTERNAL_DEVICE = new MediaLinkSaveError("MISSING_EXTERNAL_DEVICE", 1);
        OUT_OF_MEMORY = new MediaLinkSaveError("OUT_OF_MEMORY", 2);
        UNKNOWN_ERROR = new MediaLinkSaveError("UNKNOWN_ERROR", 3);
        $VALUES = (new MediaLinkSaveError[] {
            NONE, MISSING_EXTERNAL_DEVICE, OUT_OF_MEMORY, UNKNOWN_ERROR
        });
    }
}
