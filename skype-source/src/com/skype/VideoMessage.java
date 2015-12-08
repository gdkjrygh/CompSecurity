// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface

public interface VideoMessage
    extends ObjectInterface
{
    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS BLANK;
        public static final STATUS CANCELED;
        public static final STATUS DELETED;
        public static final STATUS EXPIRED;
        public static final STATUS FAILED;
        public static final STATUS INVALID;
        public static final STATUS RECORDED;
        public static final STATUS UPLOADED;
        public static final STATUS UPLOADING;
        public static final STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static STATUS fromInt(int i)
        {
            STATUS status = (STATUS)intToTypeMap.a(i);
            if (status != null)
            {
                return status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static STATUS valueOf(String s)
        {
            return (STATUS)Enum.valueOf(com/skype/VideoMessage$STATUS, s);
        }

        public static STATUS[] values()
        {
            return (STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            BLANK = new STATUS("BLANK", 0, 0);
            RECORDED = new STATUS("RECORDED", 1, 1);
            UPLOADING = new STATUS("UPLOADING", 2, 2);
            UPLOADED = new STATUS("UPLOADED", 3, 3);
            FAILED = new STATUS("FAILED", 4, 4);
            CANCELED = new STATUS("CANCELED", 5, 5);
            INVALID = new STATUS("INVALID", 6, 6);
            DELETED = new STATUS("DELETED", 7, 7);
            EXPIRED = new STATUS("EXPIRED", 8, 8);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 9, 0x7fffffff);
            $VALUES = (new STATUS[] {
                BLANK, RECORDED, UPLOADING, UPLOADED, FAILED, CANCELED, INVALID, DELETED, EXPIRED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            STATUS astatus[] = values();
            int k = astatus.length;
            for (int i = 0; i < k; i++)
            {
                STATUS status = astatus[i];
                intToTypeMap.a(status.value, status);
            }

        }

        private STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class VOD_STATUS extends Enum
    {

        private static final VOD_STATUS $VALUES[];
        public static final VOD_STATUS VOD_CONVERTING;
        public static final VOD_STATUS VOD_NOT_AVAILABLE;
        public static final VOD_STATUS VOD_PLAYABLE;
        public static final VOD_STATUS VOD_PLAYABLE_LOCAL;
        public static final VOD_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static VOD_STATUS fromInt(int i)
        {
            VOD_STATUS vod_status = (VOD_STATUS)intToTypeMap.a(i);
            if (vod_status != null)
            {
                return vod_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static VOD_STATUS valueOf(String s)
        {
            return (VOD_STATUS)Enum.valueOf(com/skype/VideoMessage$VOD_STATUS, s);
        }

        public static VOD_STATUS[] values()
        {
            return (VOD_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            VOD_NOT_AVAILABLE = new VOD_STATUS("VOD_NOT_AVAILABLE", 0, 0);
            VOD_CONVERTING = new VOD_STATUS("VOD_CONVERTING", 1, 1);
            VOD_PLAYABLE = new VOD_STATUS("VOD_PLAYABLE", 2, 2);
            VOD_PLAYABLE_LOCAL = new VOD_STATUS("VOD_PLAYABLE_LOCAL", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new VOD_STATUS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new VOD_STATUS[] {
                VOD_NOT_AVAILABLE, VOD_CONVERTING, VOD_PLAYABLE, VOD_PLAYABLE_LOCAL, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            VOD_STATUS avod_status[] = values();
            int k = avod_status.length;
            for (int i = 0; i < k; i++)
            {
                VOD_STATUS vod_status = avod_status[i];
                intToTypeMap.a(vod_status.value, vod_status);
            }

        }

        private VOD_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface VideoMessageIListener
    {

        public abstract void onThumbnailPath(VideoMessage videomessage, String s);
    }


    public abstract void addListener(VideoMessageIListener videomessageilistener);

    public abstract String getAuthorProp();

    public abstract int getCreationTimestampProp();

    public abstract String getDescriptionProp();

    public abstract String getLocalPathProp();

    public abstract int getProgressProp();

    public abstract String getPublicLinkProp();

    public abstract STATUS getStatusProp();

    public abstract void getThumbnail();

    public abstract String getTitleProp();

    public abstract String getTypeProp();

    public abstract String getVodPathProp();

    public abstract VOD_STATUS getVodStatusProp();

    public abstract void prepareForPlay();

    public abstract void prepareForPlay(boolean flag);

    public abstract void removeListener(VideoMessageIListener videomessageilistener);
}
