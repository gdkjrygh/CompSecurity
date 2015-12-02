// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import java.util.Comparator;

// Referenced classes of package com.facebook.orca.threadview:
//            RowReceiptParticipant

final class ag
    implements Comparator
{

    ag()
    {
    }

    public int a(RowReceiptParticipant rowreceiptparticipant, RowReceiptParticipant rowreceiptparticipant1)
    {
        if (rowreceiptparticipant.b() < rowreceiptparticipant1.b())
        {
            return 1;
        }
        return rowreceiptparticipant.b() <= rowreceiptparticipant1.b() ? 0 : -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((RowReceiptParticipant)obj, (RowReceiptParticipant)obj1);
    }
}
