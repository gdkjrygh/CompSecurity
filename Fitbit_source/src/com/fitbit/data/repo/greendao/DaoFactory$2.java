// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.repo.greendao.swap.DaoMaster;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoFactory

class this._cls0
    implements Runnable
{

    final DaoFactory this$0;

    public void run()
    {
        DaoMaster.dropAllTables(DaoFactory.access$100(DaoFactory.this).getWritableDatabase(), true);
        DaoMaster.createAllTables(DaoFactory.access$100(DaoFactory.this).getWritableDatabase(), true);
    }

    r()
    {
        this$0 = DaoFactory.this;
        super();
    }
}
