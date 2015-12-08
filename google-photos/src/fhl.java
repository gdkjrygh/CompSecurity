// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public final class fhl extends mtf
{

    private final int a;
    private final long b;

    public fhl(int i, long l)
    {
        super("LeaveStaleEnvelopesTask");
        a = i;
        b = l;
    }

    protected final mue a(Context context)
    {
        context = (est)olm.a(context, est);
        int i = a;
        long l = b;
        List list = est.a(mvj.a(((est) (context)).b, i), l);
        for (Iterator iterator = list.iterator(); iterator.hasNext(); context.e(i, (String)iterator.next())) { }
        i = list.size();
        context = new mue(true);
        context.a().putInt("num_envelopes_updated", i);
        return context;
    }
}
