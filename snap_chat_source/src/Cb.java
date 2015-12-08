// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Cb
{

    public static final String CHATMEDIA;
    public static final int DISCOVER_BLOB = 4;
    public static final String DISCOVER_SHARE;
    public static final int FRIEND_REQUEST = 3;
    public static final int FRIEND_REQUEST_IMAGE = 4;
    public static final int FRIEND_REQUEST_VIDEO = 5;
    public static final int FRIEND_REQUEST_VIDEO_NO_AUDIO = 6;
    public static final int IMAGE = 0;
    public static final int VIDEO_AUDIO = 1;
    public static final int VIDEO_NO_AUDIO = 2;

    static 
    {
        DISCOVER_SHARE = RP.a.DISCOVER_SHARE_V2.name();
        CHATMEDIA = RP.a.MEDIA.name();
    }
}
