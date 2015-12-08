// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            FriendmojiReadOnlyDictionaryTable

public static final class c extends Enum
    implements tt
{

    private static final EMOJI_LEGEND_RANK $VALUES[];
    public static final EMOJI_LEGEND_RANK DEFAULT_TYPE;
    public static final EMOJI_LEGEND_RANK DEFAULT_VAL;
    public static final EMOJI_LEGEND_RANK EMOJI_LEGEND_RANK;
    public static final EMOJI_LEGEND_RANK SOURCE;
    public static final EMOJI_LEGEND_RANK SYMBOL;
    public static final EMOJI_LEGEND_RANK TYPE;
    private int a;
    private String b;
    private DataType c;

    static String a(c c1)
    {
        return c1.b;
    }

    static DataType b(b b1)
    {
        return b1.c;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/snapchat/android/database/table/FriendmojiReadOnlyDictionaryTable$FriendmojiDictionarySchema, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    public final String getColumnName()
    {
        return b;
    }

    public final int getColumnNumber()
    {
        return a;
    }

    public final String getConstraints()
    {
        return null;
    }

    public final DataType getDataType()
    {
        return c;
    }

    static 
    {
        SYMBOL = new <init>("SYMBOL", 0, 1, "symbol", DataType.TEXT);
        TYPE = new <init>("TYPE", 1, 2, "type", DataType.INTEGER);
        SOURCE = new <init>("SOURCE", 2, 3, "source", DataType.TEXT);
        DEFAULT_TYPE = new <init>("DEFAULT_TYPE", 3, 4, "default_type", DataType.INTEGER);
        DEFAULT_VAL = new <init>("DEFAULT_VAL", 4, 5, "default_val", DataType.TEXT);
        EMOJI_LEGEND_RANK = new <init>("EMOJI_LEGEND_RANK", 5, 6, "emoji_legend_rank", DataType.TEXT);
        $VALUES = (new .VALUES[] {
            SYMBOL, TYPE, SOURCE, DEFAULT_TYPE, DEFAULT_VAL, EMOJI_LEGEND_RANK
        });
    }

    private (String s, int i, int j, String s1, DataType datatype)
    {
        super(s, i);
        a = j;
        b = s1;
        c = datatype;
    }
}
