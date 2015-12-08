// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil

public static final class mimeType extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN GENERIC;
    public static final UNKNOWN GIF;
    public static final UNKNOWN IMAGE;
    public static final UNKNOWN SHARING;
    public static final UNKNOWN TWEET;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN VIDEO;
    private final String mimeType;
    private final String typeId;

    public static mimeType fromString(String s)
    {
        if (s != null)
        {
            mimeType amimetype[] = values();
            int j = amimetype.length;
            for (int i = 0; i < j; i++)
            {
                mimeType mimetype = amimetype[i];
                if (s.matches(mimetype.typeId))
                {
                    return mimetype;
                }
            }

        }
        return UNKNOWN;
    }

    public static UNKNOWN fromString(String s, String s1)
    {
        UNKNOWN unknown;
        unknown = fromString(s);
        s = unknown;
        if (unknown != GENERIC) goto _L2; else goto _L1
_L1:
        if (s1 == null)
        {
            return unknown;
        }
        if (!s1.matches("(?i)image/gif")) goto _L4; else goto _L3
_L3:
        s = GIF;
_L2:
        return s;
_L4:
        s = unknown;
        if (s1.matches("(?i)image/.*$"))
        {
            s = IMAGE;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static IMAGE valueOf(String s)
    {
        return (IMAGE)Enum.valueOf(com/skype/android/app/media/MediaDocumentDownloadUtil$UrlPreviewType, s);
    }

    public static IMAGE[] values()
    {
        return (IMAGE[])$VALUES.clone();
    }

    public final String getMimeType()
    {
        return mimeType;
    }

    static 
    {
        GENERIC = new <init>("GENERIC", 0, "UrlPreview\\.\\d+/generic", ".*");
        GIF = new <init>("GIF", 1, "UrlPreview\\.\\d+/generic", "(?i)image/gif");
        IMAGE = new <init>("IMAGE", 2, "UrlPreview\\.\\d+/generic", "(?i)image/.*$");
        VIDEO = new <init>("VIDEO", 3, "UrlPreview\\.\\d+/video", ".*");
        TWEET = new <init>("TWEET", 4, "UrlPreview\\.\\d+/tweet", ".*");
        SHARING = new <init>("SHARING", 5, "UrlPreview\\.\\d+/sharing", ".*");
        UNKNOWN = new <init>("UNKNOWN", 6, ".*", ".*");
        $VALUES = (new .VALUES[] {
            GENERIC, GIF, IMAGE, VIDEO, TWEET, SHARING, UNKNOWN
        });
    }

    private (String s, int i, String s1, String s2)
    {
        super(s, i);
        typeId = s1;
        mimeType = s2;
    }
}
