// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//            WireFormat, ByteString

static final class defaultDefault extends Enum
{

    private static final MESSAGE $VALUES[];
    public static final MESSAGE BOOLEAN;
    public static final MESSAGE BYTE_STRING;
    public static final MESSAGE DOUBLE;
    public static final MESSAGE ENUM;
    public static final MESSAGE FLOAT;
    public static final MESSAGE INT;
    public static final MESSAGE LONG;
    public static final MESSAGE MESSAGE;
    public static final MESSAGE STRING;
    private final Object defaultDefault;

    public static defaultDefault valueOf(String s)
    {
        return (defaultDefault)Enum.valueOf(com/crashlytics/android/core/WireFormat$JavaType, s);
    }

    public static defaultDefault[] values()
    {
        return (defaultDefault[])$VALUES.clone();
    }

    Object getDefaultDefault()
    {
        return defaultDefault;
    }

    static 
    {
        INT = new <init>("INT", 0, Integer.valueOf(0));
        LONG = new <init>("LONG", 1, Long.valueOf(0L));
        FLOAT = new <init>("FLOAT", 2, Float.valueOf(0.0F));
        DOUBLE = new <init>("DOUBLE", 3, Double.valueOf(0.0D));
        BOOLEAN = new <init>("BOOLEAN", 4, Boolean.valueOf(false));
        STRING = new <init>("STRING", 5, "");
        BYTE_STRING = new <init>("BYTE_STRING", 6, ByteString.EMPTY);
        ENUM = new <init>("ENUM", 7, null);
        MESSAGE = new <init>("MESSAGE", 8, null);
        $VALUES = (new .VALUES[] {
            INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE
        });
    }

    private (String s, int i, Object obj)
    {
        super(s, i);
        defaultDefault = obj;
    }
}
