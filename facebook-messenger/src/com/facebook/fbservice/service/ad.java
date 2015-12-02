// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Bundle;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.fbservice.service:
//            OperationType, g

public class ad
{

    private final OperationType a;
    private final Bundle b;
    private final g c;

    public ad(OperationType operationtype, Bundle bundle)
    {
        this(operationtype, bundle, null);
    }

    public ad(OperationType operationtype, Bundle bundle, g g)
    {
        a = operationtype;
        b = bundle;
        c = g;
    }

    public OperationType a()
    {
        return a;
    }

    public Bundle b()
    {
        return b;
    }

    public g c()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ad)
        {
            obj = (ad)obj;
            flag = flag1;
            if (((ad) (obj)).a().equals(a()))
            {
                flag = flag1;
                if (((ad) (obj)).b().equals(b()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b
        });
    }
}
