// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class lfj
    implements lga
{

    private lfh a;
    private lfk b;

    lfj(lfi lfi, lfh lfh1, lfk lfk1)
    {
        a = lfh1;
        b = lfk1;
        super();
    }

    public final void a(Status status, Object obj, Integer integer, long l)
    {
        if (status.b())
        {
            if (integer == lgb.a)
            {
                status = lfs.c;
            } else
            {
                status = lfs.b;
            }
            status = new lfr(Status.a, a, null, (lfv)obj, status, l);
        } else
        {
            status = new lfr(new Status(16, (new StringBuilder("There is no valid resource for the container: ")).append(a.a).toString()), null, lfs.b);
        }
        b.a(new lfq(status));
    }
}
