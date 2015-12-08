// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.c;

import bo.app.el;
import bo.app.fa;
import com.appboy.b.b;
import com.appboy.d;
import com.appboy.d.a.c;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public final class a
{

    private static final String c;
    public final boolean a;
    public final long b;
    private final List d;
    private final String e;

    public a(List list, String s, boolean flag, long l)
    {
        e = s;
        a = flag;
        d = (List)fa.a(list);
        b = l;
    }

    public final List a(EnumSet enumset)
    {
        EnumSet enumset2 = enumset;
        EnumSet enumset1;
        if (d == null)
        {
            enumset2 = enumset;
            try
            {
                return new ArrayList();
            }
            // Misplaced declaration of an exception variable
            catch (EnumSet enumset)
            {
                String.format("Unable to get cards with categories[%s]. Ignoring.", new Object[] {
                    enumset2
                });
            }
            break MISSING_BLOCK_LABEL_67;
        }
        enumset1 = enumset;
        if (enumset != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        enumset2 = enumset;
        enumset1 = b.f;
        enumset2 = enumset1;
        if (!enumset1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        enumset2 = enumset1;
        enumset = new ArrayList();
        return enumset;
        return null;
        enumset2 = enumset1;
        enumset = new ArrayList();
        enumset2 = enumset1;
        Iterator iterator = d.iterator();
_L8:
        enumset2 = enumset1;
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        enumset2 = enumset1;
        c c1 = (c)iterator.next();
        enumset2 = enumset1;
        if (!c1.a(enumset1))
        {
            continue; /* Loop/switch isn't completed */
        }
        enumset2 = enumset1;
        if (c1.h() == -1L) goto _L4; else goto _L3
_L3:
        enumset2 = enumset1;
        if (c1.h() > el.a()) goto _L4; else goto _L5
_L5:
        boolean flag = true;
_L6:
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        enumset2 = enumset1;
        enumset.add(c1);
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L6; else goto _L2
_L2:
        return enumset;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final int b(EnumSet enumset)
    {
        if (enumset == null)
        {
            return d.size();
        }
        if (enumset.isEmpty())
        {
            return 0;
        } else
        {
            return a(enumset).size();
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("FeedUpdatedEvent{");
        stringbuilder.append("mFeedCards=").append(d);
        stringbuilder.append(", mUserId='").append(e).append('\'');
        stringbuilder.append(", mFromOfflineStorage=").append(a);
        stringbuilder.append(", mTimestamp=").append(b);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            d.a, com/appboy/c/a.getName()
        });
    }
}
