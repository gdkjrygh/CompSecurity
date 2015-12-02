// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.contacts.picker.ah;
import com.facebook.contacts.picker.v;
import com.facebook.debug.log.b;
import com.facebook.orca.contacts.picker.ad;
import com.facebook.orca.contacts.picker.az;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.UserWithIdentifier;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            DivebarFragment

class r
    implements v
{

    final DivebarFragment a;

    r(DivebarFragment divebarfragment)
    {
        a = divebarfragment;
        super();
    }

    public com.facebook.contacts.picker.ad a(Object obj)
    {
        if (obj instanceof UserWithIdentifier)
        {
            return DivebarFragment.a(a).b((UserWithIdentifier)obj, ah.SEARCH_RESULT);
        }
        if (obj instanceof ThreadSummary)
        {
            return new ad((ThreadSummary)obj);
        } else
        {
            b.d(DivebarFragment.c(), (new StringBuilder()).append("unexpected rowData of type: ").append(obj.getClass()).toString());
            throw new IllegalArgumentException();
        }
    }
}
