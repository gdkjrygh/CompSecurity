// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import java.util.concurrent.Callable;

// Referenced classes of package com.fitbit.activity.ui:
//            c

class a
    implements Callable
{

    final c a;

    public Object call()
        throws Exception
    {
        return a.loadInBackground();
    }

    le(c c1)
    {
        a = c1;
        super();
    }
}
