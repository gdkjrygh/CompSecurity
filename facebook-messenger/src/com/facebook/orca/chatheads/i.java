// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.common.w.m;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.user.UserIdentifierKey;
import com.google.common.a.av;
import com.google.common.a.ee;
import com.google.common.base.Objects;

public class i
{

    private final av a = ee.e();

    i()
    {
    }

    void a(ThreadViewSpec threadviewspec)
    {
        if (threadviewspec.b())
        {
            a.remove(threadviewspec.g());
        } else
        if (threadviewspec.a())
        {
            a.b().remove(threadviewspec.d());
            return;
        }
    }

    void a(UserIdentifierKey useridentifierkey, String s)
    {
        if (a.containsKey(useridentifierkey))
        {
            String s1 = (String)a.get(useridentifierkey);
            if (!Objects.equal(s, s1))
            {
                throw new IllegalStateException(m.a("%s already associated with thread %s, attempting to associcate with %s", new Object[] {
                    useridentifierkey.b, s1, s
                }));
            }
        }
        a.put(useridentifierkey, s);
    }

    ThreadViewSpec b(ThreadViewSpec threadviewspec)
    {
        if (!threadviewspec.a() && threadviewspec.b())
        {
            String s = (String)a.get(threadviewspec.g());
            if (s != null)
            {
                return ThreadViewSpec.a(s);
            }
        }
        return threadviewspec;
    }
}
