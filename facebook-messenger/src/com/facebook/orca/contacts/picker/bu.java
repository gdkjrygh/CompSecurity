// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.inject.d;
import com.facebook.orca.annotations.IsDivebarMoreMobileFriendsEnabled;
import com.facebook.orca.annotations.IsDivebarMoreMobileFriendsNewSectionEnabled;
import com.facebook.orca.contacts.divebar.ad;
import com.facebook.orca.contacts.divebar.ao;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bi, bj

class bu extends d
{

    final bi a;

    private bu(bi bi)
    {
        a = bi;
        super();
    }

    bu(bi bi, bj bj)
    {
        this(bi);
    }

    public ao a()
    {
        return new ao(b(com/facebook/orca/contacts/divebar/ad), b(java/lang/Boolean, com/facebook/orca/annotations/IsDivebarMoreMobileFriendsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsDivebarMoreMobileFriendsNewSectionEnabled));
    }

    public Object b()
    {
        return a();
    }
}
