// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//            ByteString

final class WireFormat
{
    static class FieldType extends Enum
    {

        private static final FieldType $VALUES[];
        public static final FieldType BOOL;
        public static final FieldType BYTES;
        public static final FieldType DOUBLE;
        public static final FieldType ENUM;
        public static final FieldType FIXED32;
        public static final FieldType FIXED64;
        public static final FieldType FLOAT;
        public static final FieldType GROUP;
        public static final FieldType INT32;
        public static final FieldType INT64;
        public static final FieldType MESSAGE;
        public static final FieldType SFIXED32;
        public static final FieldType SFIXED64;
        public static final FieldType SINT32;
        public static final FieldType SINT64;
        public static final FieldType STRING;
        public static final FieldType UINT32;
        public static final FieldType UINT64;
        private final JavaType javaType;
        private final int wireType;

        public static FieldType valueOf(String s)
        {
            return (FieldType)Enum.valueOf(com/crashlytics/android/core/WireFormat$FieldType, s);
        }

        public static FieldType[] values()
        {
            return (FieldType[])$VALUES.clone();
        }

        public JavaType getJavaType()
        {
            return javaType;
        }

        public int getWireType()
        {
            return wireType;
        }

        public boolean isPackable()
        {
            return true;
        }

        static 
        {
            DOUBLE = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            FLOAT = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            INT64 = new FieldType("INT64", 2, JavaType.LONG, 0);
            UINT64 = new FieldType("UINT64", 3, JavaType.LONG, 0);
            INT32 = new FieldType("INT32", 4, JavaType.INT, 0);
            FIXED64 = new FieldType("FIXED64", 5, JavaType.LONG, 1);
            FIXED32 = new FieldType("FIXED32", 6, JavaType.INT, 5);
            BOOL = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            STRING = new FieldType("STRING", 8, JavaType.STRING, 2) {

                public boolean isPackable()
                {
                    return false;
                }

            };
            GROUP = new FieldType("GROUP", 9, JavaType.MESSAGE, 3) {

                public boolean isPackable()
                {
                    return false;
                }

            };
            MESSAGE = new FieldType("MESSAGE", 10, JavaType.MESSAGE, 2) {

                public boolean isPackable()
                {
                    return false;
                }

            };
            BYTES = new FieldType("BYTES", 11, JavaType.BYTE_STRING, 2) {

                public boolean isPackable()
                {
                    return false;
                }

            };
            UINT32 = new FieldType("UINT32", 12, JavaType.INT, 0);
            ENUM = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            SFIXED32 = new FieldType("SFIXED32", 14, JavaType.INT, 5);
            SFIXED64 = new FieldType("SFIXED64", 15, JavaType.LONG, 1);
            SINT32 = new FieldType("SINT32", 16, JavaType.INT, 0);
            SINT64 = new FieldType("SINT64", 17, JavaType.LONG, 0);
            $VALUES = (new FieldType[] {
                DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, 
                MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64
            });
        }

        private FieldType(String s, int i, JavaType javatype, int j)
        {
            super(s, i);
            javaType = javatype;
            wireType = j;
        }

    }

    static final class JavaType extends Enum
    {

        private static final JavaType $VALUES[];
        public static final JavaType BOOLEAN;
        public static final JavaType BYTE_STRING;
        public static final JavaType DOUBLE;
        public static final JavaType ENUM;
        public static final JavaType FLOAT;
        public static final JavaType INT;
        public static final JavaType LONG;
        public static final JavaType MESSAGE;
        public static final JavaType STRING;
        private final Object defaultDefault;

        public static JavaType valueOf(String s)
        {
            return (JavaType)Enum.valueOf(com/crashlytics/android/core/WireFormat$JavaType, s);
        }

        public static JavaType[] values()
        {
            return (JavaType[])$VALUES.clone();
        }

        Object getDefaultDefault()
        {
            return defaultDefault;
        }

        static 
        {
            INT = new JavaType("INT", 0, Integer.valueOf(0));
            LONG = new JavaType("LONG", 1, Long.valueOf(0L));
            FLOAT = new JavaType("FLOAT", 2, Float.valueOf(0.0F));
            DOUBLE = new JavaType("DOUBLE", 3, Double.valueOf(0.0D));
            BOOLEAN = new JavaType("BOOLEAN", 4, Boolean.valueOf(false));
            STRING = new JavaType("STRING", 5, "");
            BYTE_STRING = new JavaType("BYTE_STRING", 6, ByteString.EMPTY);
            ENUM = new JavaType("ENUM", 7, null);
            MESSAGE = new JavaType("MESSAGE", 8, null);
            $VALUES = (new JavaType[] {
                INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE
            });
        }

        private JavaType(String s, int i, Object obj)
        {
            super(s, i);
            defaultDefault = obj;
        }
    }


    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;

    private WireFormat()
    {
    }

    public static int getTagFieldNumber(int i)
    {
        return i >>> 3;
    }

    static int getTagWireType(int i)
    {
        return i & 7;
    }

    static int makeTag(int i, int j)
    {
        return i << 3 | j;
    }

}
