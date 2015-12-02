// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.picking;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d CAMERA;
    public static final d CANCEL;
    public static final d GALLERY;
    public static final d IMAGE_SEARCH;
    public static final d RECORD_AUDIO;
    public static final d RECORD_VIDEO;
    public static final d REMOVE;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/orca/photos/picking/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        CAMERA = new d("CAMERA", 0);
        GALLERY = new d("GALLERY", 1);
        IMAGE_SEARCH = new d("IMAGE_SEARCH", 2);
        RECORD_VIDEO = new d("RECORD_VIDEO", 3);
        RECORD_AUDIO = new d("RECORD_AUDIO", 4);
        REMOVE = new d("REMOVE", 5);
        CANCEL = new d("CANCEL", 6);
        $VALUES = (new d[] {
            CAMERA, GALLERY, IMAGE_SEARCH, RECORD_VIDEO, RECORD_AUDIO, REMOVE, CANCEL
        });
    }
}
