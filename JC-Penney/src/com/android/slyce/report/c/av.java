// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.view.View;
import java.util.List;

// Referenced classes of package com.android.slyce.report.c:
//            as, at

public class av extends as
{

    private boolean a;

    public av(List list, String s, at at)
    {
        super(list, s, at, false);
        a = false;
    }

    public void a()
    {
    }

    public void a(View view)
    {
        if (view != null && !a)
        {
            c(view);
        }
        boolean flag;
        if (view != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    public volatile void b(View view)
    {
        super.b(view);
    }
}
