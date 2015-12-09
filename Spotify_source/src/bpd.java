// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;

final class bpd
    implements brd
{

    private final long a;
    private bpc b;

    bpd(bpc bpc1, long l)
    {
        b = bpc1;
        super();
        a = l;
    }

    public final void a(brc brc)
    {
        brc = (Status)brc;
        if (!brc.b())
        {
            bpz bpz1 = b.b.b;
            long l = a;
            int i = ((Status) (brc)).f;
            for (brc = bpz1.e.iterator(); brc.hasNext(); ((bqc)brc.next()).a(l, i)) { }
        }
    }
}
