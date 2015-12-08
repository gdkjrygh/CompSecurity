// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class hcm
    implements hcs
{

    private final String a[];

    public hcm(Collection collection)
    {
        this((String[])collection.toArray(new String[collection.size()]));
    }

    hcm(String as[])
    {
        boolean flag;
        if (as.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty content uris.");
        a = as;
    }

    public final String a()
    {
        return "PHOTOS_JOB_SUBSYSTEM";
    }

    public final boolean a(Context context, int i)
    {
        noz noz1 = noz.a(context, 3, "LocalTrashDeleteJob", new String[] {
            "perf"
        });
        if (a.length > 0 || !noz1.a())
        {
            long l = noy.a();
            jae jae1 = (jae)olm.a(context, jae);
            List list = Arrays.asList(a);
            context = new ArrayList();
            for (i = 0; i < list.size(); i += 500)
            {
                context.add(jae1.a(list.subList(i, Math.min(list.size() - i, 500) + i), false));
            }

            if (noz1.a())
            {
                String s = String.valueOf(this);
                (new StringBuilder(String.valueOf(s).length() + 9)).append("finished ").append(s);
                noy.a("duration", l);
                noy.a("result", context);
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
        hdj hdj1 = new hdj();
        hdj1.a = a;
        return qlw.a(hdj1);
    }

    public final int d()
    {
        return 5;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(Arrays.toString(a));
        return (new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(s1).length())).append(s).append(" - TrashDeleteJob:  ").append(s1).toString();
    }
}
