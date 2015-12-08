// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ads;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.ads:
//            StoryAdStreamDataTable

public static final class <init> extends Enum
    implements tt
{

    private static final NEXT_UNVIEWED_POSITION $VALUES[];
    public static final NEXT_UNVIEWED_POSITION NEXT_UNVIEWED_POSITION;
    public static final NEXT_UNVIEWED_POSITION STREAM_KEY;
    private String mColumnName;
    private int mColumnNumber;
    private String mConstraints;
    private DataType mDataType;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/snapchat/android/ads/StoryAdStreamDataTable$StoryAdStreamDataTableSchema, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    public final String getColumnName()
    {
        return mColumnName;
    }

    public final int getColumnNumber()
    {
        return mColumnNumber;
    }

    public final String getConstraints()
    {
        return mConstraints;
    }

    public final DataType getDataType()
    {
        return mDataType;
    }

    static 
    {
        STREAM_KEY = new <init>("STREAM_KEY", 0, 0, "streamKey", DataType.TEXT, "PRIMARY KEY");
        NEXT_UNVIEWED_POSITION = new <init>("NEXT_UNVIEWED_POSITION", "nextUnviewedPosition", DataType.INTEGER);
        $VALUES = (new .VALUES[] {
            STREAM_KEY, NEXT_UNVIEWED_POSITION
        });
    }

    private (String s, int i, int j, String s1, DataType datatype, String s2)
    {
        super(s, i);
        mColumnNumber = j;
        mColumnName = s1;
        mDataType = datatype;
        mConstraints = s2;
    }

    private mConstraints(String s, String s1, DataType datatype)
    {
        this(s, 1, 1, s1, datatype, null);
    }
}
