// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.content.Context;
import com.nuance.dragon.toolkit.d.b.c;
import java.util.Enumeration;
import java.util.Hashtable;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            g, b

public final class a
    implements g
{

    private Hashtable a;
    private int b;

    public a(Context context, int i)
    {
        a = new Hashtable();
        b = b.b;
        c.a("Context", context);
        a.put("Android_Context", context);
        b = i;
        if (b == b.a)
        {
            a.put("Use_Device_ProxySetting_Only", "TRUE".getBytes());
        } else
        if (b == b.b)
        {
            a.put("Use_Device_ProxySetting_If_Available", "TRUE".getBytes());
            return;
        }
    }

    public final Object a(String s)
    {
        return a.get(s);
    }

    public final Enumeration a()
    {
        return a.keys();
    }
}
