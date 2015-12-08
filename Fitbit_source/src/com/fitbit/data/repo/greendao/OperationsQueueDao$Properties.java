// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import de.greenrobot.dao.Property;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            OperationsQueueDao

public static class A
{

    public static final Property Error = new Property(4, java/lang/Boolean, "error", false, "ERROR");
    public static final Property ForeignId = new Property(1, java/lang/Long, "foreignId", false, "FOREIGN_ID");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property TableName = new Property(2, java/lang/String, "tableName", false, "TABLE_NAME");
    public static final Property Type = new Property(3, java/lang/Integer, "type", false, "TYPE");


    public A()
    {
    }
}
