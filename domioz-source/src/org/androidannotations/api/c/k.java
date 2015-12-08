// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.content.SharedPreferences;

// Referenced classes of package org.androidannotations.api.c:
//            b, m

public final class k extends b
{

    k(SharedPreferences sharedpreferences, String s, Long long1)
    {
        super(sharedpreferences, s, long1);
    }

    public final Long a(Long long1)
    {
        long l;
        try
        {
            l = b.getLong(c, long1.longValue());
        }
        catch (ClassCastException classcastexception)
        {
            long l1;
            try
            {
                l1 = Long.parseLong(b.getString(c, String.valueOf(long1)));
            }
            // Misplaced declaration of an exception variable
            catch (Long long1)
            {
                throw classcastexception;
            }
            return Long.valueOf(l1);
        }
        return Long.valueOf(l);
    }

    public final volatile Object a(Object obj)
    {
        return a((Long)obj);
    }

    protected final void c(Object obj)
    {
        obj = (Long)obj;
        m.a(e().putLong(c, ((Long) (obj)).longValue()));
    }
}
