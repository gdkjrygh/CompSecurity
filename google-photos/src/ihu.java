// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ihu extends mtf
{

    private final int a;
    private final String b;

    public ihu(int i, String s)
    {
        super("ReadSharedCollections");
        a = i;
        b = s;
    }

    protected final mue a(Context context)
    {
        long l1 = ((muz)olm.a(context, muz)).a();
        iht iht1 = new iht(context, a, b);
        iht1.d();
        if (iht1.l())
        {
            return new mue(((nxx) (iht1)).l, ((nxx) (iht1)).n, null);
        }
        boolean flag;
        if (iht1.a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return new mue(false);
        }
        Object obj = (est)olm.a(context, est);
        qfz aqfz[] = iht1.a.b;
        Map map = iht1.b;
        hgm hgm1 = new hgm(iht1.c);
        int k = aqfz.length;
        for (int i = 0; i < k; i++)
        {
            qfz qfz1 = aqfz[i];
            context = qfz1.b.i;
            qfu qfu;
            ArrayList arraylist;
            if (context == null)
            {
                context = null;
            } else
            {
                context = (qgg)map.get(((qev) (context)).a);
            }
            if (context == null)
            {
                context = Collections.emptyList();
            } else
            {
                context = Collections.singletonList(context);
            }
            qfu = hgm1.a(qfz1.b.a);
            arraylist = new ArrayList();
            arraylist.add(qfu);
            if (qfz1.e != null && qfz1.e.length > 0 && qfz1.e[0] != null && qfz1.e[0].a != null)
            {
                qci aqci[] = qfz1.e[0].a;
                int l = aqci.length;
                for (int j = 0; j < l; j++)
                {
                    qfu qfu1 = hgm1.a(aqci[j].a);
                    if (!qfu1.equals(qfu))
                    {
                        arraylist.add(qfu1);
                    }
                }

            }
            ((est) (obj)).a(a, l1, qfz1, context, arraylist);
        }

        context = new mue(true);
        obj = context.a();
        ((Bundle) (obj)).putString("next_resume_token", iht1.a.a);
        ((Bundle) (obj)).putLong("request_time", l1);
        return context;
    }
}
