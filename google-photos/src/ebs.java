// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class ebs
    implements fkw
{

    private final Context a;

    public ebs(Context context)
    {
        a = context;
    }

    public final elb a(int i, ekq ekq, hpk hpk1)
    {
        p.a(ekq instanceof ebv, "Wrong collection type for NotificationMediaCollection");
        String s;
        Iterator iterator;
        Object obj;
        hpk hpk2;
        try
        {
            ekq = (List)b.a(a, ekq).a(ekq, ekw.a, ekk.a).a();
        }
        // Misplaced declaration of an exception variable
        catch (ekq ekq)
        {
            return b.a(ekq);
        }
        if (ekq.isEmpty())
        {
            break MISSING_BLOCK_LABEL_221;
        }
        s = hpk1.c;
        iterator = ekq.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_221;
            }
            ekq = (ekp)iterator.next();
            obj = (hpg)ekq.b(hpg);
        } while (obj == null);
        obj = ((hpg) (obj)).a.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        hpk2 = (hpk)((Iterator) (obj)).next();
        if (!hpk2.a() || !s.equals(hpk2.c)) goto _L4; else goto _L3
_L3:
        i = 1;
_L5:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
_L6:
        if (ekq == null)
        {
            ekq = String.valueOf(hpk1);
            return b.a(new eke((new StringBuilder(String.valueOf(ekq).length() + 32)).append("Could not find specified media :").append(ekq).toString()));
        } else
        {
            return b.b(ekq);
        }
_L2:
        i = 0;
          goto _L5
        ekq = null;
          goto _L6
    }
}
