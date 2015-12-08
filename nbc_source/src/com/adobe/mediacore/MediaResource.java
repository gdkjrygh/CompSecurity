// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.utils.StringUtils;

public final class MediaResource
{
    public static final class MimeType extends Enum
    {

        private static final MimeType $VALUES[];
        public static final MimeType HLS_MIME_TYPE;
        private final String _value;

        public static MimeType valueOf(String s)
        {
            return (MimeType)Enum.valueOf(com/adobe/mediacore/MediaResource$MimeType, s);
        }

        public static MimeType[] values()
        {
            return (MimeType[])$VALUES.clone();
        }

        public String getValue()
        {
            return _value;
        }

        static 
        {
            HLS_MIME_TYPE = new MimeType("HLS_MIME_TYPE", 0, "application/x-mpegurl");
            $VALUES = (new MimeType[] {
                HLS_MIME_TYPE
            });
        }

        private MimeType(String s, int i, String s1)
        {
            super(s, i);
            _value = s1;
        }
    }

    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type DASH;
        public static final Type HDS;
        public static final Type HLS;
        private final String _value;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/adobe/mediacore/MediaResource$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        public String getValue()
        {
            return _value;
        }

        static 
        {
            HLS = new Type("HLS", 0, "m3u8");
            DASH = new Type("DASH", 1, "mpd");
            HDS = new Type("HDS", 2, "f4m");
            $VALUES = (new Type[] {
                HLS, DASH, HDS
            });
        }

        private Type(String s, int i, String s1)
        {
            super(s, i);
            _value = s1;
        }
    }


    private final Metadata _metadata;
    private MimeType _mimeType;
    private final Type _type;
    private final String _url;

    public MediaResource(String s, Type type, Metadata metadata)
    {
        _url = s;
        _type = type;
        _metadata = metadata;
    }

    public static MediaResource createFromMetadata(Metadata metadata, Type type)
    {
        return new MediaResource(null, type, metadata);
    }

    public static MediaResource createFromUrl(String s, Metadata metadata)
        throws IllegalArgumentException
    {
        Type type;
        String s1;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Provided url is not valid");
        }
        s1 = StringUtils.getFileExtension(s);
        type = Type.HLS;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        Type atype[];
        int i;
        int j;
        atype = Type.values();
        j = atype.length;
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L3
_L3:
        Type type1 = atype[i];
        if (!type1.getValue().equalsIgnoreCase(s1)) goto _L5; else goto _L4
_L4:
        type = type1;
_L2:
        return new MediaResource(s, type, metadata);
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean equals(MediaResource mediaresource)
    {
        boolean flag = true;
        if (mediaresource != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (_url != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mediaresource.getUrl() == null && _type == mediaresource.getType()) goto _L4; else goto _L3
_L3:
        return false;
        if (_url.equals(mediaresource.getUrl()) && _type == mediaresource.getType()) goto _L4; else goto _L5
_L5:
        return false;
    }

    public Metadata getMetadata()
    {
        return _metadata;
    }

    public Type getType()
    {
        return _type;
    }

    public String getUrl()
    {
        return _url;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getName()).append(" Object { ");
        stringbuilder.append("url=").append(_url);
        stringbuilder.append(" ,type=").append(_type.getValue());
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
