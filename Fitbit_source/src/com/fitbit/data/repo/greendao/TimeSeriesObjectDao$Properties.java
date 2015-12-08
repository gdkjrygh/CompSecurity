// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            TimeSeriesObjectDao

public static class 
{

    public static final Property DateTime = new Property(1, java/util/Date, "dateTime", false, "DATE_TIME");
    public static final Property EntityStatus = new Property(4, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property ForeignId = new Property(6, java/lang/Long, "foreignId", false, "FOREIGN_ID");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property Level = new Property(5, java/lang/Integer, "level", false, "LEVEL");
    public static final Property ObjectType = new Property(3, java/lang/Integer, "objectType", false, "OBJECT_TYPE");
    public static final Property Value = new Property(2, java/lang/Double, "value", false, "VALUE");


    public ()
    {
    }
}
