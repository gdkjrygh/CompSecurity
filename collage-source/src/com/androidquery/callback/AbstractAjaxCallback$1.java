// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.callback;

import com.androidquery.util.Common;

// Referenced classes of package com.androidquery.callback:
//            AbstractAjaxCallback

class c
    implements Runnable
{

    final AbstractAjaxCallback a;
    private final Object b;
    private final boolean c;

    public void run()
    {
        Common.a(b, AbstractAjaxCallback.a(a), c);
    }

    (AbstractAjaxCallback abstractajaxcallback, Object obj, boolean flag)
    {
        a = abstractajaxcallback;
        b = obj;
        c = flag;
        super();
    }
}
