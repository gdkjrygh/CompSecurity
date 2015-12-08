// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos;


public final class LoadInfo
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type FRAGMENT;
        public static final Type MANIFEST;
        public static final Type TRACK;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/adobe/mediacore/qos/LoadInfo$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            FRAGMENT = new Type("FRAGMENT", 0);
            TRACK = new Type("TRACK", 1);
            MANIFEST = new Type("MANIFEST", 2);
            $VALUES = (new Type[] {
                FRAGMENT, TRACK, MANIFEST
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private final long _downloadDuration;
    private final long _mediaDuration;
    private final int _periodIndex;
    private final long _resourceSize;
    private final int _trackIndex;
    private final String _trackName;
    private final String _trackType;
    private final Type _type;
    private final String _url;

    public LoadInfo(Type type, String s, int i, long l, long l1, 
            long l2, String s1, String s2, int j)
    {
        _type = type;
        _url = s;
        _periodIndex = i;
        _resourceSize = l;
        _mediaDuration = l1;
        _downloadDuration = l2;
        _trackName = s1;
        _trackType = s2;
        _trackIndex = j;
    }

    public static LoadInfo createFragmentLoadInformation(String s, int i, long l, long l1, long l2)
    {
        return new LoadInfo(Type.FRAGMENT, s, i, l, l1, l2, null, null, -1);
    }

    public static LoadInfo createManifestLoadInformation(String s)
    {
        return new LoadInfo(Type.MANIFEST, s, -1, 0L, 0L, 0L, null, null, -1);
    }

    public static LoadInfo createTrackLoadInformation(String s, int i, long l, long l1, long l2, 
            String s1, String s2, int j)
    {
        return new LoadInfo(Type.TRACK, s, i, l, l1, l2, s1, s2, j);
    }

    public long getDownloadDuration()
    {
        return _downloadDuration;
    }

    public long getFragmentSize()
    {
        return getSize();
    }

    public String getFragmentUrl()
    {
        return getUrl();
    }

    public long getMediaDuration()
    {
        return _mediaDuration;
    }

    public int getPeriodIndex()
    {
        return _periodIndex;
    }

    public long getSize()
    {
        return _resourceSize;
    }

    public int getTrackIndex()
    {
        return _trackIndex;
    }

    public String getTrackName()
    {
        return _trackName;
    }

    public String getTrackType()
    {
        return _trackType;
    }

    public final Type getType()
    {
        return _type;
    }

    public final String getUrl()
    {
        return _url;
    }
}
