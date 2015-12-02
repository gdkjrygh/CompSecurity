// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.os.SystemClock;
import com.facebook.contacts.picker.ap;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            DivebarFragment

class s
    implements ap
{

    final DivebarFragment a;

    s(DivebarFragment divebarfragment)
    {
        a = divebarfragment;
        super();
    }

    public void a(int i)
    {
        DivebarFragment.a(a, i);
        DivebarFragment.a(a, SystemClock.elapsedRealtime());
    }
}
