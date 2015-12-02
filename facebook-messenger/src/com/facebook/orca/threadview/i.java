// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.messages.model.threads.ParticipantInfo;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.orca.threadview:
//            j, RowReceiptParticipant

public class i
{

    private final j a;
    private List b;
    private ParticipantInfo c;
    private long d;

    private i(j j1)
    {
        this(j1, -1L);
    }

    private i(j j1, long l)
    {
        a = j1;
        d = l;
    }

    public static i a(long l)
    {
        return new i(j.READER, l);
    }

    public static i a(ParticipantInfo participantinfo)
    {
        i k = new i(j.SENDER);
        k.b(participantinfo);
        return k;
    }

    private void b(ParticipantInfo participantinfo)
    {
        c = participantinfo;
    }

    public List a()
    {
        if (a == j.READER)
        {
            return b;
        } else
        {
            return null;
        }
    }

    public void a(RowReceiptParticipant rowreceiptparticipant)
    {
        int k;
        int l;
        boolean flag;
        if (a == j.READER)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "MessageDeliveredReadInfo is not of type READER - Cannot add a reader");
        if (b == null)
        {
            b = hq.a();
        }
        l = Collections.binarySearch(b, rowreceiptparticipant, RowReceiptParticipant.a);
        k = l;
        if (l < 0)
        {
            k = -l - 1;
        }
        b.add(k, rowreceiptparticipant);
    }

    public ParticipantInfo b()
    {
        if (a == j.SENDER)
        {
            return c;
        } else
        {
            return null;
        }
    }

    public ParticipantInfo c()
    {
        if (a == j.DELIVEREE)
        {
            return c;
        } else
        {
            return null;
        }
    }

    public j d()
    {
        return a;
    }

    public long e()
    {
        return d;
    }
}
