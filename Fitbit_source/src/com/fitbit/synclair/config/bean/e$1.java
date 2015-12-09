// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.config.bean;

import com.fitbit.data.repo.o;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.synclair.config.bean:
//            e

class a
    implements Runnable
{

    final List a;
    final e b;

    public void run()
    {
        File file;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); e.a(b).b(file.getName()))
        {
            file = new File((String)iterator.next());
        }

    }

    (e e1, List list)
    {
        b = e1;
        a = list;
        super();
    }
}
