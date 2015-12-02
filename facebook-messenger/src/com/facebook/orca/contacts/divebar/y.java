// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.b;
import com.facebook.c.c;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            DivebarFragment, r

class y
    implements b
{

    final DivebarFragment a;

    private y(DivebarFragment divebarfragment)
    {
        a = divebarfragment;
        super();
    }

    y(DivebarFragment divebarfragment, r r)
    {
        this(divebarfragment);
    }

    public void a(Context context, Intent intent, c c)
    {
        DivebarFragment.a(a, intent);
    }
}
