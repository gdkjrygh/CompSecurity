// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.os.Bundle;
import android.support.v4.a.c;
import android.support.v4.app.ah;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            DivebarFragment, ao, an

class u
    implements ah
{

    final DivebarFragment a;

    u(DivebarFragment divebarfragment)
    {
        a = divebarfragment;
        super();
    }

    public c a(int i, Bundle bundle)
    {
        return DivebarFragment.b(a).a();
    }

    public void a(c c)
    {
    }

    public void a(c c, an an1)
    {
        DivebarFragment.a(a, an1);
    }

    public volatile void a(c c, Object obj)
    {
        a(c, (an)obj);
    }
}
