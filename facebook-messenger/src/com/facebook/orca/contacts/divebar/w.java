// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.view.View;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            DivebarFragment, be

class w
    implements android.view.View.OnClickListener
{

    final DivebarFragment a;

    w(DivebarFragment divebarfragment)
    {
        a = divebarfragment;
        super();
    }

    public void onClick(View view)
    {
        DivebarFragment.d(a);
        DivebarFragment.e(a);
        DivebarFragment.f(a).b();
    }
}
