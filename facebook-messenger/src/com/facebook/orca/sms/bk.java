// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.common.w.n;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.user.User;
import com.facebook.user.i;
import com.facebook.user.j;
import com.facebook.user.o;
import com.google.common.a.es;
import com.google.common.base.Preconditions;
import javax.inject.a;

public class bk
{

    private final a a;
    private final com.facebook.orca.p.a b;
    private final i c;

    public bk(a a1, com.facebook.orca.p.a a2, i k)
    {
        a = a1;
        b = a2;
        c = k;
    }

    private User a(String s, String s1, String s2)
    {
        j j1 = c.a(s);
        com.facebook.user.UserPhoneNumber userphonenumber = j1.a(2);
        s = s1;
        if (n.a(s1))
        {
            s = j1.c();
        }
        return (new o()).a(com.facebook.user.n.PHONE_NUMBER, j1.b()).a(s).b(es.a(userphonenumber)).b(s2).c(s2).x();
    }

    public ParticipantInfo a()
    {
        User user = (User)a.b();
        if (user.a() == com.facebook.user.n.FACEBOOK)
        {
            return new ParticipantInfo(user.c(), user.h(), (new StringBuilder()).append(user.b()).append("@facebook.com").toString());
        }
        if (user.a() == com.facebook.user.n.PHONE_NUMBER)
        {
            return new ParticipantInfo(user.c(), user.h());
        } else
        {
            throw new IllegalArgumentException("Invalid me user type");
        }
    }

    public ParticipantInfo a(User user)
    {
        String s;
        j j1;
        boolean flag;
        if (user.a() == com.facebook.user.n.PHONE_NUMBER)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Expecting User of type PHONE_NUMBER, was given User of type %s", new Object[] {
            user.a()
        });
        s = user.b();
        j1 = c.a(s);
        s = j1.c();
        if (user != null)
        {
            s = user.g();
        }
        return new ParticipantInfo(j1.d(), s);
    }

    public User a(String s)
    {
        String s1;
        s1 = null;
        b.a(s);
        User user = b.b();
        b.a();
        String s2;
        if (user != null)
        {
            s2 = user.h();
            s1 = user.q();
        } else
        {
            s2 = null;
        }
        return a(s, s2, s1);
        s;
        b.a();
        throw s;
    }
}
