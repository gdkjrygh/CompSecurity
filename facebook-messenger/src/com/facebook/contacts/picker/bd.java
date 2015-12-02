// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.facebook.common.w.n;
import com.facebook.user.User;
import java.text.Collator;
import java.util.Comparator;

public class bd
    implements Comparator
{

    private final Collator a = Collator.getInstance();

    public bd()
    {
        a.setStrength(0);
    }

    public int a(User user, User user1)
    {
        user = n.a(user.h());
        user1 = n.a(user1.h());
        return a.compare(user, user1);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((User)obj, (User)obj1);
    }
}
