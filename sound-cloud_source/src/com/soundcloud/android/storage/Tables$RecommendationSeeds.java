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

    public static final int REASON_LIKED = 0;
    public static final int REASON_LISTENED_TO = 1;
    public static final Column RECOMMENDATION_REASON;
    public static final Column SEED_SOUND_ID;
    public static final Column SEED_SOUND_TYPE;
    static final String SQL = "CREATE TABLE IF NOT EXISTS RecommendationSeeds (_id INTEGER PRIMARY KEY,seed_sound_id INTEGER, seed_sound_type INTEGER, recommendation_reason INTEGER, FOREIGN KEY(seed_sound_id, seed_sound_type) REFERENCES Sounds(_id, _type));";
    public static final TABLE TABLE;
    public static final Column _ID;

    static 
    {
          = new <init>();
        TABLE = ;
        _ID = Column.create(, "_id");
        SEED_SOUND_ID = Column.create(TABLE, "seed_sound_id");
        SEED_SOUND_TYPE = Column.create(TABLE, "seed_sound_type");
        RECOMMENDATION_REASON = Column.create(TABLE, "recommendation_reason");
    }

    protected ()
    {
        super("RecommendationSeeds", com.soundcloud.propeller.schema.(new String[] {
            "_id"
        }));
    }
}
