// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.view.View;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ContactMultipickerFragment

class d
    implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener
{

    final ContactMultipickerFragment a;

    d(ContactMultipickerFragment contactmultipickerfragment)
    {
        a = contactmultipickerfragment;
        super();
    }

    public void onGlobalFocusChanged(View view, View view1)
    {
        ContactMultipickerFragment.a(a, view, view1);
    }
}
