// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;


public final class SourceFields
{
    public final class Containers
    {

        public static final String FLV = "FLV";
        public static final String M2TS = "M2TS";
        public static final String MP4 = "MP4";
        public static final String WVM = "WVM";

        public Containers()
        {
        }
    }


    public static final String BIT_RATE = "encodingRate";
    public static final String DEFAULT_FIELDS[] = {
        "url", "videoDuration", "videoContainer", "encodingRate"
    };
    public static final String DURATION = "videoDuration";
    public static final String URL = "url";
    public static final String VIDEO_CONTAINER = "videoContainer";

    public SourceFields()
    {
    }

}
