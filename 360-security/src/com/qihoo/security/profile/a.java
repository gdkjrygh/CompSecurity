// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.content.Context;

// Referenced classes of package com.qihoo.security.profile:
//            g, l

class a
    implements g
{

    Context a;

    a(Context context)
    {
        a = context;
    }

    public int a()
    {
        return 4;
    }

    public String a(long l1)
    {
        return l.a("/sys/class/power_supply/battery/capacity");
    }
}
