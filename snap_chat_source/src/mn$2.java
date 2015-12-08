// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class lang.Object
    implements Runnable
{

    final mn this$0;
    final RH val$locationResponse;

    public final void run()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = val$locationResponse.g().iterator(); iterator.hasNext(); arraylist.add(new AQ((RV)iterator.next()))) { }
        mn.a(mn.this, arraylist);
    }

    >()
    {
        this$0 = final_mn1;
        val$locationResponse = RH.this;
        super();
    }
}
