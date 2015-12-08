// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            ActivityBusinessLogic, dm

class a
    implements Runnable
{

    final List a;
    final ActivityBusinessLogic b;

    public void run()
    {
        dm.c(a);
    }

    (ActivityBusinessLogic activitybusinesslogic, List list)
    {
        b = activitybusinesslogic;
        a = list;
        super();
    }
}
