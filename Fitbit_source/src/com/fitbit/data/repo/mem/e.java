// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.mem;

import com.fitbit.data.repo.av;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.mem:
//            a, DataCache

public class e extends a
    implements av
{

    public e()
    {
    }

    public List a()
    {
        return new ArrayList(getAll());
    }

    public void a(List list)
    {
        DataCache.a().a(list);
    }

    public List getAll()
    {
        return DataCache.a().c();
    }

    public String getName()
    {
        return "TrackerTypesInMemoryRepository";
    }
}
