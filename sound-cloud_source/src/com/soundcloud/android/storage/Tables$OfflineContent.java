// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import com.soundcloud.propeller.schema.BaseTable;
import com.soundcloud.propeller.schema.Column;

// Referenced classes of package com.soundcloud.android.storage:
//            Tables

public static class  extends BaseTable
{

    public static final int ID_OFFLINE_LIKES = 0;
    static final String SQL = "CREATE TABLE IF NOT EXISTS OfflineContent (_id INTEGER,_type INTEGER,PRIMARY KEY (_id, _type),FOREIGN KEY(_id, _type) REFERENCES Sounds(_id, _type));";
    public static final TABLE TABLE;
    public static final int TYPE_COLLECTION = 2;
    public static final int TYPE_PLAYLIST = 1;
    public static final Column _ID;
    public static final Column _TYPE;

    static 
    {
          = new <init>();
        TABLE = ;
        _ID = Column.create(, "_id");
        _TYPE = Column.create(TABLE, "_type");
    }

    protected ()
    {
        super("OfflineContent", com.soundcloud.propeller.schema.(new String[] {
            "_id", "_type"
        }));
    }
}
