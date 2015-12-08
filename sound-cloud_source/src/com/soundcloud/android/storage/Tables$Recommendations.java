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

    public static final Column RECOMMENDED_SOUND_ID;
    public static final Column RECOMMENDED_SOUND_TYPE;
    public static final Column SEED_ID;
    static final String SQL = "CREATE TABLE IF NOT EXISTS Recommendations (_id INTEGER PRIMARY KEY,seed_id INTEGER, recommended_sound_id INTEGER,recommended_sound_type INTEGER,FOREIGN KEY(seed_id) REFERENCES RecommendationSeeds(_id) FOREIGN KEY(recommended_sound_id, recommended_sound_type) REFERENCES Sounds(_id, _type));";
    public static final TABLE TABLE;
    public static final Column _ID;

    static 
    {
          = new <init>();
        TABLE = ;
        _ID = Column.create(, "_id");
        SEED_ID = Column.create(TABLE, "seed_id");
        RECOMMENDED_SOUND_ID = Column.create(TABLE, "recommended_sound_id");
        RECOMMENDED_SOUND_TYPE = Column.create(TABLE, "recommended_sound_type");
    }

    protected ()
    {
        super("Recommendations", com.soundcloud.propeller.schema.(new String[] {
            "_id"
        }));
    }
}
