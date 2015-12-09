// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.mem;

import com.fitbit.data.repo.f;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.mem:
//            a, DataCache

public class c extends a
    implements f
{

    public c()
    {
    }

    public void a()
    {
        DataCache.a().b(new ArrayList());
    }

    public void a(List list)
    {
        DataCache.a().b(list);
    }

    public List getAll()
    {
        return DataCache.a().d();
    }

    public String getName()
    {
        return "FoodLogItemInMemoryRepository";
    }
}
