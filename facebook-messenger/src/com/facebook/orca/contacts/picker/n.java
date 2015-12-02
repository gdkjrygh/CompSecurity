// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.user.User;
import java.util.Comparator;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            m

class n
    implements Comparator
{

    final m a;

    n(m m)
    {
        a = m;
        super();
    }

    public int a(User user, User user1)
    {
        float f = user.w();
        float f1 = user1.w();
        if (f > f1)
        {
            return -1;
        }
        return f >= f1 ? 0 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((User)obj, (User)obj1);
    }
}
