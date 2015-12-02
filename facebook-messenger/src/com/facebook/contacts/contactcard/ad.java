// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import com.facebook.contacts.contactcard.entry.k;
import com.facebook.contacts.models.entry.Entry;

// Referenced classes of package com.facebook.contacts.contactcard:
//            EntrySectionView, af

class ad
    implements k
{

    final EntrySectionView a;

    ad(EntrySectionView entrysectionview)
    {
        a = entrysectionview;
        super();
    }

    public void a(Entry entry)
    {
        if (EntrySectionView.a(a) != null)
        {
            EntrySectionView.a(a).a(entry);
        }
    }

    public void b(Entry entry)
    {
        if (EntrySectionView.a(a) != null)
        {
            EntrySectionView.a(a).b(entry);
        }
    }
}
