// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import com.soundcloud.propeller.schema.BaseTable;
import com.soundcloud.propeller.schema.Column;

// Referenced classes of package com.soundcloud.android.storage:
//            Tables

public static class .of extends BaseTable
{

    public static final Column DISPLAY_TEXT;
    public static final Column KIND;
    public static final String KIND_FOLLOWING = "following";
    static final String SQL = "CREATE VIEW IF NOT EXISTS Shortcuts AS SELECT 'like' AS kind, Sounds._id AS _id, Sounds._type AS _type, title AS display_text FROM Likes INNER JOIN Sounds ON Likes._id = Sounds._id AND Likes._type = Sounds._type UNION SELECT 'following' AS kind, Users._id, 0 AS _type, username AS text from UserAssociations INNER JOIN Users ON UserAssociations.target_id = Users._id";
    public static final TABLE TABLE;
    public static final String TYPE_LIKE = "like";
    public static final Column _ID;
    public static final Column _TYPE;

    static 
    {
        .of of = new <init>();
        TABLE = of;
        KIND = Column.create(of, "kind");
        _ID = Column.create(TABLE, "_id");
        _TYPE = Column.create(TABLE, "_type");
        DISPLAY_TEXT = Column.create(TABLE, "display_text");
    }

    protected ()
    {
        super("Shortcuts", com.soundcloud.propeller.schema.of(new String[] {
            "_id", "kind"
        }));
    }
}
