// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class ban
    implements jw
{

    private final bam a;
    private final bap b;
    private final jw c;

    ban(jw jw1, bam bam1, bap bap1)
    {
        c = jw1;
        a = bam1;
        b = bap1;
    }

    public final Object a()
    {
        Object obj1 = c.a();
        Object obj = obj1;
        if (obj1 == null)
        {
            Object obj2 = a.a();
            obj = obj2;
            if (Log.isLoggable("FactoryPools", 2))
            {
                obj = String.valueOf(obj2.getClass());
                (new StringBuilder(String.valueOf(obj).length() + 12)).append("Created new ").append(((String) (obj)));
                obj = obj2;
            }
        }
        if (obj instanceof bao)
        {
            ((bao)obj).q_().a(false);
        }
        return obj;
    }

    public final boolean a(Object obj)
    {
        if (obj instanceof bao)
        {
            ((bao)obj).q_().a(true);
        }
        b.a(obj);
        return c.a(obj);
    }
}
