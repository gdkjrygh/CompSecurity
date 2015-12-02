// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            aw

public class av
{

    public final aw a;
    public final es b;
    public final int c;

    private av(aw aw1, es es1, int i)
    {
        a = aw1;
        b = es1;
        c = i;
    }

    public static av a(es es1)
    {
        return new av(aw.LIST, es1, es1.size());
    }
}
