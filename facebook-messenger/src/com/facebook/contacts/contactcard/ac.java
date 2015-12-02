// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import com.facebook.contacts.contactcard.entry.e;

// Referenced classes of package com.facebook.contacts.contactcard:
//            EntrySectionView, af

class ac
    implements e
{

    final EntrySectionView a;

    ac(EntrySectionView entrysectionview)
    {
        a = entrysectionview;
        super();
    }

    public void a()
    {
        if (EntrySectionView.a(a) != null)
        {
            EntrySectionView.a(a).a();
        }
    }

    public void b()
    {
        if (EntrySectionView.a(a) != null)
        {
            EntrySectionView.a(a).b();
        }
    }
}
