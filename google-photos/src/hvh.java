// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class hvh extends nzc
{

    boolean a;
    private hvi b;

    public hvh(Context context, hvi hvi1)
    {
        super(context, new nyg(context, hvi1.a), "rejectfalsepositives", new pcv(), new pcw());
        b = hvi1;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pcv)qlw;
        Object obj = b;
        plo plo1 = new plo();
        plo1.b = new plp();
        if (((hvi) (obj)).c != null)
        {
            plo1.a = ((hvi) (obj)).c;
        }
        if (!TextUtils.isEmpty(((hvi) (obj)).d))
        {
            plo1.b.a = ((hvi) (obj)).d;
        }
        if (!TextUtils.isEmpty(((hvi) (obj)).e))
        {
            plo1.b.b = ((hvi) (obj)).e;
        }
        if (((hvi) (obj)).f > 0)
        {
            plo1.b.c = Integer.valueOf(((hvi) (obj)).f);
        }
        Object obj1 = ((hvi) (obj)).g.a(((hvi) (obj)).b);
        obj = new HashSet();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((Set) (obj)).add(((hpk)((Iterator) (obj1)).next()).e)) { }
        plo1.c = (String[])((Set) (obj)).toArray(new String[0]);
        qlw.a = plo1;
    }

    protected final void b(qlw qlw)
    {
        a = ((pcw)qlw).a.a.booleanValue();
    }
}
