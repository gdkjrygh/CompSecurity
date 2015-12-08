// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;

final class dkr
    implements gud
{

    private final Context a;
    private final dks b;
    private final ekk c;
    private final gvs d;

    dkr(Context context)
    {
        a = context;
        b = (dks)olm.a(context, dks);
        d = (gvs)olm.a(context, gvs);
        c = (new ekm()).a(hpg).a(b.c).a();
    }

    private boolean a(ekq ekq, ekp ekp1)
    {
        if (ekq instanceof dke)
        {
            boolean flag;
            if (((hpg)ekp1.a(hpg)).c() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final ekk a()
    {
        return c;
    }

    public final elb a(gue gue1)
    {
        boolean flag = true;
        Object obj;
        ekp ekp1;
        ekq ekq;
        Object obj1;
        gue gue2;
        int i;
        if (gue1.h != gvl.a)
        {
            flag = false;
        }
        p.a(flag, "AllSaveEditAction does not yet support saving in place");
        i = gue1.a;
        ekp1 = gue1.c;
        ekq = gue1.b;
        if (a(ekq, ekp1))
        {
            obj = b;
            obj1 = (new gug()).a(gue1);
            obj1.g = ((dks) (obj)).a.a(gue1.c, gue1.h);
            obj1.i = true;
            gue2 = ((gug) (obj1)).a();
            obj1 = (Uri)((dks) (obj)).a.a(gue2).a();
            ((dks) (obj)).b.a(gue2.a, Collections.singletonList(obj1));
            obj = new hpm();
            obj.b = ((Uri) (obj1)).toString();
            obj = ((hpm) (obj)).a();
        } else
        {
            obj = b.a(gue1, a);
        }
        if (gue1.h == gvl.b)
        {
            return b.b(ekp1);
        }
        gue1 = ((fkw)b.a(a, fkw, ekq)).a(i, ekq, ((hpk) (obj)));
        return gue1;
        gue1;
_L2:
        return b.a(gue1);
        gue1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final elb b(gue gue1)
    {
        try
        {
            gue1 = b.b(d.b(gue1));
        }
        // Misplaced declaration of an exception variable
        catch (gue gue1)
        {
            return b.a(gue1);
        }
        return gue1;
    }

    public final boolean c(gue gue1)
    {
        return !a(gue1.b, gue1.c);
    }
}
