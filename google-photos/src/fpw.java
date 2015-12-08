// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.photos.jobqueue.JobService;
import java.util.List;

public final class fpw
    implements fpt
{

    private muz a;
    private noz b;
    private Context c;
    private int d;
    private List e;

    public fpw(muz muz1, noz noz1, Context context, int i, List list)
    {
        a = muz1;
        b = noz1;
        c = context;
        d = i;
        e = list;
        super();
    }

    public final boolean a(fpr fpr1, Long long1)
    {
        if (long1 != null && long1.longValue() > a.b())
        {
            if (b.a())
            {
                fpr1 = String.valueOf(long1);
                (new StringBuilder(String.valueOf(fpr1).length() + 30)).append("Job cannot be executed until: ").append(fpr1);
            }
            JobService.a(c, long1.longValue());
        } else
        if (fpr1.a(c, d))
        {
            e.add(fpr1);
            return true;
        }
        return false;
    }
}
