// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network.util;

import java.lang.reflect.Method;

// Referenced classes of package com.splunk.mint.network.util:
//            Delegator, DelegationException

public class method
{

    private final Method method;
    final Delegator this$0;

    public transient Object invoke(Object aobj[])
    {
        return Delegator.access$100(Delegator.this, method, aobj);
    }

    public transient (String s, Class aclass[])
    {
        this$0 = Delegator.this;
        super();
        try
        {
            method = Delegator.access$000(Delegator.this).getDeclaredMethod(s, aclass);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Delegator delegator)
        {
            throw Delegator.this;
        }
        // Misplaced declaration of an exception variable
        catch (Delegator delegator)
        {
            throw new DelegationException(Delegator.this);
        }
    }
}
