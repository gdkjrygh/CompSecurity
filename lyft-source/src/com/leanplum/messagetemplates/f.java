// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;


// Referenced classes of package com.leanplum.messagetemplates:
//            e, BaseMessageDialog

final class f
    implements Runnable
{

    private e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public final void run()
    {
        BaseMessageDialog.a(e.a(a));
    }
}
