// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.UUID;

final class aky extends hak
{

    hbg a;

    aky(Context context, ale ale, gzc gzc1, han han)
    {
        super(context, ale, gzc1, han);
    }

    protected final String a()
    {
        UUID uuid = UUID.randomUUID();
        return (new StringBuilder("sa_")).append(uuid.toString()).append("_").append(d.a()).append(".tap").toString();
    }

    protected final int b()
    {
        if (a == null)
        {
            return super.b();
        } else
        {
            return a.d;
        }
    }

    protected final int c()
    {
        if (a == null)
        {
            return super.c();
        } else
        {
            return a.c;
        }
    }
}
