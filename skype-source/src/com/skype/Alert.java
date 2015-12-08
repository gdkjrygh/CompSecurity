// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface

public interface Alert
    extends ObjectInterface
{
    public static interface AlertIListener
    {
    }

    public static final class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE AUTHREQ;
        public static final TYPE INFO;
        public static final TYPE NOTICE;
        public static final TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TYPE fromInt(int i)
        {
            TYPE type = (TYPE)intToTypeMap.a(i);
            if (type != null)
            {
                return type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TYPE valueOf(String s)
        {
            return (TYPE)Enum.valueOf(com/skype/Alert$TYPE, s);
        }

        public static TYPE[] values()
        {
            return (TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NOTICE = new TYPE("NOTICE", 0, 0);
            INFO = new TYPE("INFO", 1, 1);
            AUTHREQ = new TYPE("AUTHREQ", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new TYPE[] {
                NOTICE, INFO, AUTHREQ, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TYPE atype[] = values();
            int k = atype.length;
            for (int i = 0; i < k; i++)
            {
                TYPE type = atype[i];
                intToTypeMap.a(type.value, type);
            }

        }

        private TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class WINDOW_SIZE extends Enum
    {

        private static final WINDOW_SIZE $VALUES[];
        public static final WINDOW_SIZE LARGE;
        public static final WINDOW_SIZE PIC;
        public static final WINDOW_SIZE SMALL;
        public static final WINDOW_SIZE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static WINDOW_SIZE fromInt(int i)
        {
            WINDOW_SIZE window_size = (WINDOW_SIZE)intToTypeMap.a(i);
            if (window_size != null)
            {
                return window_size;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static WINDOW_SIZE valueOf(String s)
        {
            return (WINDOW_SIZE)Enum.valueOf(com/skype/Alert$WINDOW_SIZE, s);
        }

        public static WINDOW_SIZE[] values()
        {
            return (WINDOW_SIZE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SMALL = new WINDOW_SIZE("SMALL", 0, 0);
            PIC = new WINDOW_SIZE("PIC", 1, 1);
            LARGE = new WINDOW_SIZE("LARGE", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new WINDOW_SIZE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new WINDOW_SIZE[] {
                SMALL, PIC, LARGE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            WINDOW_SIZE awindow_size[] = values();
            int k = awindow_size.length;
            for (int i = 0; i < k; i++)
            {
                WINDOW_SIZE window_size = awindow_size[i];
                intToTypeMap.a(window_size.value, window_size);
            }

        }

        private WINDOW_SIZE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract void addListener(AlertIListener alertilistener);

    public abstract boolean delete();

    public abstract byte[] getChatmsgGuidProp();

    public abstract boolean getIsUnseenProp();

    public abstract String getMessageButtonCaptionProp();

    public abstract String getMessageButtonUriProp();

    public abstract String getMessageContentProp();

    public abstract String getMessageFooterProp();

    public abstract String getMessageHeaderCancelProp();

    public abstract String getMessageHeaderCaptionProp();

    public abstract String getMessageHeaderLaterProp();

    public abstract String getMessageHeaderSubjectProp();

    public abstract String getMessageHeaderTitleProp();

    public abstract TYPE getMessageTypeProp();

    public abstract int getMetaExpiryProp();

    public abstract String getPartnerEventProp();

    public abstract String getPartnerHeaderProp();

    public abstract String getPartnerHistoryProp();

    public abstract int getPartnerIdProp();

    public abstract String getPartnerLogoProp();

    public abstract String getPartnerNameProp();

    public abstract int getTimestampProp();

    public abstract WINDOW_SIZE getWindowSizeProp();

    public abstract void markSeen();

    public abstract void removeListener(AlertIListener alertilistener);
}
