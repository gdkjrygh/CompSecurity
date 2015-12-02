// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import com.facebook.contacts.picker.ad;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            v

public class u
    implements ad
{

    private final User a;
    private v b;

    public u(User user)
    {
        a = user;
    }

    public User a()
    {
        return a;
    }

    public void a(v v1)
    {
        b = v1;
    }

    public void b()
    {
        if (b != null)
        {
            b.a(a);
        }
    }
}
