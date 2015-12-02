// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.os.Parcelable;
import com.facebook.contacts.contactcard.ContactCardFragment;
import com.facebook.contacts.contactcard.GroupContactCardFragment;
import com.facebook.zero.ui.k;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment

class bt
    implements k
{

    final ThreadViewFragment a;

    bt(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void a(Parcelable parcelable)
    {
        if (ThreadViewFragment.d(a) != null)
        {
            ThreadViewFragment.d(a).O();
        }
        if (ThreadViewFragment.e(a) != null)
        {
            ThreadViewFragment.e(a).a();
        }
    }

    public void b(Parcelable parcelable)
    {
    }
}
