// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class bsp
{

    private final List a = new ArrayList();
    private boolean b;

    public bsp()
    {
    }

    public final bsm a(bmb bmb, String s, Bundle bundle, cag cag)
    {
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "TaskFlow.Builder should be used only once");
        b = true;
        return new bsm(bmb, s, bundle, cag, a, null);
    }

    public final bsp a(az az)
    {
        a.add(b.a(az, "step", null));
        return this;
    }
}
