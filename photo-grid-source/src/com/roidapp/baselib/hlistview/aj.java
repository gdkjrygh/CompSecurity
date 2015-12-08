// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.view.View;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            ag

public class aj extends ag
{

    public aj(View view)
    {
        super(view);
    }

    public void a(int i)
    {
        a.scrollTo(i, a.getScrollY());
    }

    public void a(Runnable runnable)
    {
        a.post(runnable);
    }

    public boolean a()
    {
        return false;
    }
}
