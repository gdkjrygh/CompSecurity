// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.schema;

import com.snapchat.android.database.DataType;
import tt;

public final class StorySnapNoteSchema extends Enum
    implements tt
{

    private static final StorySnapNoteSchema $VALUES[];
    public static final StorySnapNoteSchema SCREENSHOTTED;
    public static final StorySnapNoteSchema STORY_ID;
    public static final StorySnapNoteSchema STORY_POINTER_FIELD;
    public static final StorySnapNoteSchema STORY_POINTER_KEY;
    public static final StorySnapNoteSchema STORY_SNAP_ID;
    public static final StorySnapNoteSchema TIMESTAMP;
    public static final StorySnapNoteSchema VIEWER;
    private String a;
    private DataType b;

    private StorySnapNoteSchema(String s, int i, String s1, DataType datatype)
    {
        super(s, i);
        a = s1;
        b = datatype;
    }

    public static StorySnapNoteSchema valueOf(String s)
    {
        return (StorySnapNoteSchema)Enum.valueOf(com/snapchat/android/database/schema/StorySnapNoteSchema, s);
    }

    public static StorySnapNoteSchema[] values()
    {
        return (StorySnapNoteSchema[])$VALUES.clone();
    }

    public final String getColumnName()
    {
        return a;
    }

    public final int getColumnNumber()
    {
        return ordinal();
    }

    public final String getConstraints()
    {
        return null;
    }

    public final DataType getDataType()
    {
        return b;
    }

    static 
    {
        STORY_SNAP_ID = new StorySnapNoteSchema("STORY_SNAP_ID", 0, "StorySnapId", DataType.TEXT);
        STORY_ID = new StorySnapNoteSchema("STORY_ID", 1, "StoryId", DataType.TEXT);
        VIEWER = new StorySnapNoteSchema("VIEWER", 2, "Viewer", DataType.TEXT);
        SCREENSHOTTED = new StorySnapNoteSchema("SCREENSHOTTED", 3, "Screenshotted", DataType.INTEGER);
        TIMESTAMP = new StorySnapNoteSchema("TIMESTAMP", 4, "Timestamp", DataType.INTEGER);
        STORY_POINTER_KEY = new StorySnapNoteSchema("STORY_POINTER_KEY", 5, "StoryPointerKey", DataType.TEXT);
        STORY_POINTER_FIELD = new StorySnapNoteSchema("STORY_POINTER_FIELD", 6, "StoryPointerField", DataType.TEXT);
        $VALUES = (new StorySnapNoteSchema[] {
            STORY_SNAP_ID, STORY_ID, VIEWER, SCREENSHOTTED, TIMESTAMP, STORY_POINTER_KEY, STORY_POINTER_FIELD
        });
    }
}
