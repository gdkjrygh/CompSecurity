// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.picking;

import com.facebook.i;

// Referenced classes of package com.facebook.orca.photos.picking:
//            d

public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b CAMERA;
    public static final b GALLERY;
    public static final b IMAGE_SEARCH;
    public static final b RECORD_AUDIO;
    public static final b RECORD_VIDEO;
    public static final b REMOVE;
    private final int buttonId;
    private final d result;

    private b(String s, int j, int k, d d1)
    {
        super(s, j);
        buttonId = k;
        result = d1;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/orca/photos/picking/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    static 
    {
        CAMERA = new b("CAMERA", 0, i.media_picker_camera, d.CAMERA);
        GALLERY = new b("GALLERY", 1, i.media_picker_upload_photo, d.GALLERY);
        IMAGE_SEARCH = new b("IMAGE_SEARCH", 2, i.media_picker_image_search, d.IMAGE_SEARCH);
        RECORD_VIDEO = new b("RECORD_VIDEO", 3, i.media_picker_record_video, d.RECORD_VIDEO);
        RECORD_AUDIO = new b("RECORD_AUDIO", 4, i.media_picker_record_audio, d.RECORD_AUDIO);
        REMOVE = new b("REMOVE", 5, i.media_picker_remove, d.REMOVE);
        $VALUES = (new b[] {
            CAMERA, GALLERY, IMAGE_SEARCH, RECORD_VIDEO, RECORD_AUDIO, REMOVE
        });
    }


}
