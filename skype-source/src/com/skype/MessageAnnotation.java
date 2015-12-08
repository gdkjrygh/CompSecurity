// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface

public interface MessageAnnotation
    extends ObjectInterface
{
    public static interface MessageAnnotationIListener
    {
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS FAILURE;
        public static final STATUS REMOVING;
        public static final STATUS SENDING;
        public static final STATUS SENT;
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
            return (STATUS)Enum.valueOf(com/skype/MessageAnnotation$STATUS, s);
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
            SENDING = new STATUS("SENDING", 0, 1);
            SENT = new STATUS("SENT", 1, 2);
            REMOVING = new STATUS("REMOVING", 2, 3);
            FAILURE = new STATUS("FAILURE", 3, 4);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new STATUS[] {
                SENDING, SENT, REMOVING, FAILURE, WRAPPER_UNKNOWN_VALUE
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

    public static final class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE EMOTICON;
        public static final TYPE TRANSLATION;
        public static final TYPE TYPE_END;
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
            return (TYPE)Enum.valueOf(com/skype/MessageAnnotation$TYPE, s);
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
            EMOTICON = new TYPE("EMOTICON", 0, 1);
            TRANSLATION = new TYPE("TRANSLATION", 1, 2);
            TYPE_END = new TYPE("TYPE_END", 2, 3);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new TYPE[] {
                EMOTICON, TRANSLATION, TYPE_END, WRAPPER_UNKNOWN_VALUE
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


    public abstract void addListener(MessageAnnotationIListener messageannotationilistener);

    public abstract String getAuthorProp();

    public abstract String getKeyProp();

    public abstract int getMessageIdProp();

    public abstract STATUS getStatusProp();

    public abstract int getTimestampProp();

    public abstract TYPE getTypeProp();

    public abstract String getValueProp();

    public abstract void removeListener(MessageAnnotationIListener messageannotationilistener);
}
