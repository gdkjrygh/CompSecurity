// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive;


public final class ErrorCodes
{
    public static final class Common
    {

        public static final int DEFAULT_ERROR = -1;

        public Common()
        {
        }
    }

    public static final class Communication
    {

        public static final int ALREADY_JOINED = 2009;
        public static final int BAD_AUTH = 2003;
        public static final int CLIENT_VERSION_NOT_SUPPORTED = 2011;
        public static final int INTERNAL = 2007;
        public static final int INVALID_HOST = 2001;
        public static final int INVALID_PORT = 2002;
        public static final int MEDIA_LINK_FAILURE = 2005;
        public static final int NEW_USER_CONNECTED_SAME_ID = 2015;
        public static final int REMOTE_END_DIED = 2006;
        public static final int SMERR_COMM_AUTH_ERROR = 2004;

        public Communication()
        {
        }
    }

    public static final class Logic
    {

        public static final int CALL_CANCELED = 1011;
        public static final int INTERNAL = 1006;
        public static final int INVALID_ARGUMENT = 1002;
        public static final int INVALID_PROPERTY_NAME = 1003;
        public static final int INVALID_SCOPE = 1001;
        public static final int INVALID_STATE = 1010;
        public static final int PLATFORM_INIT_FAILED = 1004;
        public static final int PLATFORM_UNSUPPORTED = 1009;

        public Logic()
        {
        }
    }

    public static final class Media
    {

        public static final int INVALID_AUDIO_DEV = 4005;
        public static final int INVALID_AUDIO_IN_DEV = 4003;
        public static final int INVALID_AUDIO_OUT_DEV = 4004;
        public static final int INVALID_VIDEO_DEV = 4001;
        public static final int NO_AUDIO_IN_DEV = 4002;

        public Media()
        {
        }
    }


    public static final int NO_ERROR = 0;

    public ErrorCodes()
    {
    }
}
