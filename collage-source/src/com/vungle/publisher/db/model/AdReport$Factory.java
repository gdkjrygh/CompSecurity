// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import com.vungle.publisher.db.DatabaseHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vungle.publisher.db.model:
//            AdReport, LocalAdReport, StreamingAdReport

public static class .Factory
{

    public DatabaseHelper a;
    tory b;
    .Factory c;

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b.f().iterator(); iterator.hasNext(); arraylist.add((LocalAdReport)iterator.next())) { }
        for (Iterator iterator1 = c.f().iterator(); iterator1.hasNext(); arraylist.add((StreamingAdReport)iterator1.next())) { }
        return arraylist;
    }

    .Factory()
    {
    }
}
