// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.yume.android.sdk:
//            aq

final class h
{

    private ArrayList a;
    private HashMap b;

    h()
    {
    }

    public final HashMap a()
    {
        return b;
    }

    public final void a(aq aq, String s)
    {
        if (b == null)
        {
            b = new HashMap();
        }
        if (b != null)
        {
            b.put(s, aq);
        }
    }

    public final void a(String s)
    {
        if (a == null)
        {
            a = new ArrayList();
        }
        if (a != null)
        {
            a.add(s);
        }
    }

    public final ArrayList b()
    {
        return a;
    }
}
