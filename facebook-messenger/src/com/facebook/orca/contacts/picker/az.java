// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.contacts.a.c;
import com.facebook.contacts.picker.ag;
import com.facebook.contacts.picker.ah;
import com.facebook.contacts.picker.ai;
import com.facebook.contacts.picker.aj;
import com.facebook.l.k;
import com.facebook.l.x;
import com.facebook.orca.contacts.divebar.bn;
import com.facebook.orca.contacts.divebar.bp;
import com.facebook.orca.p.e;
import com.facebook.orca.p.f;
import com.facebook.user.User;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.s;
import javax.inject.a;

public class az
{

    private final k a;
    private final c b;
    private final e c;
    private final bn d;
    private final a e;
    private bp f;

    public az(k k1, c c1, e e1, bn bn1, a a1)
    {
        a = k1;
        b = c1;
        c = e1;
        d = bn1;
        e = a1;
    }

    private aj a(UserWithIdentifier userwithidentifier, boolean flag, ah ah)
    {
        Object obj1 = userwithidentifier.a();
        f = d.a();
        if (s.FBID == userwithidentifier.c().e())
        {
            Object obj;
            if (((Boolean)e.b()).booleanValue())
            {
                obj = ai.TEXT_ONLY;
            } else
            if (f.a)
            {
                obj = ai.TWO_LINE_RICH_PRESENCE;
            } else
            {
                obj = ai.ONE_LINE;
            }
            ah = (new aj()).a(userwithidentifier).a(((ai) (obj))).c(flag).a(ah);
            if (flag)
            {
                flag = a.a(((User) (obj1)).c());
                obj = b.a(((User) (obj1)).c());
                x x1 = a.b(((User) (obj1)).c());
                obj1 = ah.a(flag).b(x1.b()).a(b.b(((User) (obj1)).c()));
                int i;
                if (!flag)
                {
                    userwithidentifier = c.a(((com.facebook.user.LastActive) (obj)), x1, f.SHORT);
                } else
                {
                    userwithidentifier = null;
                }
                userwithidentifier = ((aj) (obj1)).a(userwithidentifier);
                if (!flag)
                {
                    i = c.a(((com.facebook.user.LastActive) (obj)), x1);
                } else
                {
                    i = 0;
                }
                userwithidentifier.a(i);
            }
            return ah;
        } else
        {
            return (new aj()).a(userwithidentifier).a(ai.TWO_LINE);
        }
    }

    public ag a(UserWithIdentifier userwithidentifier, ah ah)
    {
        return a(userwithidentifier, false, ah).a();
    }

    public ag a(UserWithIdentifier userwithidentifier, ah ah, boolean flag)
    {
        return a(userwithidentifier, true, ah).e(true).d(flag).a();
    }

    public ag b(UserWithIdentifier userwithidentifier, ah ah)
    {
        return a(userwithidentifier, true, ah).a();
    }

    public ag b(UserWithIdentifier userwithidentifier, ah ah, boolean flag)
    {
        return a(userwithidentifier, false, ah).e(true).d(flag).a();
    }
}
