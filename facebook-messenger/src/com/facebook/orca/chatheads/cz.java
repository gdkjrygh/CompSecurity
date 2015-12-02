// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.common.process.c;
import com.google.common.base.Preconditions;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.chatheads:
//            ChatHeadServiceMultiProcess, ChatHeadService

public class cz
{

    public static final c a = c.a("com.facebook.orca", "chatheads");
    private final a b;

    public cz(a a1)
    {
        b = a1;
    }

    public Class a()
    {
        if (((Boolean)b.b()).booleanValue())
        {
            return com/facebook/orca/chatheads/ChatHeadServiceMultiProcess;
        } else
        {
            return com/facebook/orca/chatheads/ChatHeadService;
        }
    }

    public void a(Object obj)
    {
        boolean flag;
        if (obj.getClass() == a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }

}
