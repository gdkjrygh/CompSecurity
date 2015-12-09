// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.view.View;
import java.util.List;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            l

public static class a extends a
{

    private boolean a;

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

    protected String d()
    {
        return (new StringBuilder()).append(e()).append(" when Detected").toString();
    }

    public (List list, String s,  )
    {
        super(list, s, , false);
        a = false;
    }
}
