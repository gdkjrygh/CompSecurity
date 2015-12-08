// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Arrays;
import java.util.Collection;

public final class hcr
    implements hcs
{

    private final String a[];

    public hcr(Collection collection)
    {
        this((String[])collection.toArray(new String[collection.size()]));
        boolean flag;
        if (collection.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty content uris.");
    }

    hcr(String as[])
    {
        a = as;
    }

    public final String a()
    {
        return "PHOTOS_JOB_SUBSYSTEM";
    }

    public final boolean a(Context context, int i)
    {
        noz noz1 = noz.a(context, 3, "MediaStoreDeleteJob", new String[] {
            "perf"
        });
        if (a.length > 0 || !noz1.a())
        {
            long l = noy.a();
            i = ((izo)olm.a(context, izo)).b(b.c(Arrays.asList(a)));
            if (noz1.a())
            {
                noy.a("duration", l);
                noy.a("uris", a);
                noy.a("deleted count", Integer.valueOf(i));
                return true;
            }
        }
        return true;
    }

    public final boolean b()
    {
        return false;
    }

    public final byte[] c()
    {
        hdd hdd1 = new hdd();
        hdd1.a = a;
        return qlw.a(hdd1);
    }

    public final int d()
    {
        return 4;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(Arrays.toString(a));
        return (new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(s1).length())).append(s).append(" - LocalDeleteJob:  ").append(s1).toString();
    }
}
