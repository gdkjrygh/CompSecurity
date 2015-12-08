// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;

public class fnh
    implements nuc, omb, opv
{

    public final nud a = new ntz(this);
    public final EnumMap b = new EnumMap(fnj);
    public final EnumMap c = new EnumMap(fnj);
    public noz d;

    public fnh(opd opd1)
    {
        opd1.a(this);
    }

    public final nud a()
    {
        return a;
    }

    public final void a(Context context, olm olm, Bundle bundle)
    {
        d = noz.a(context, 3, "ImagePriorityModel", new String[0]);
    }

    public final void a(fnj fnj1, boolean flag)
    {
        fnj1 = c(fnj1);
        if (((fni) (fnj1)).a != flag)
        {
            fnj1.a = flag;
            a.b();
        }
    }

    public final boolean a(fnj fnj1)
    {
        if (c(fnj1).b || c(fnj1).c) goto _L2; else goto _L1
_L1:
        Iterator iterator = b.values().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((fni)iterator.next()).a) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        fnj1 = (Boolean)c.get(fnj1);
        if (fnj1 != null && fnj1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return true;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
        return false;
    }

    public final void b(fnj fnj1)
    {
        for (Iterator iterator = b.values().iterator(); iterator.hasNext();)
        {
            ((fni)iterator.next()).c = false;
        }

        if (fnj1 != null)
        {
            c(fnj1).c = true;
        }
        a.b();
    }

    public fni c(fnj fnj1)
    {
        fni fni2 = (fni)b.get(fnj1);
        fni fni1 = fni2;
        if (fni2 == null)
        {
            fni1 = new fni();
            b.put(fnj1, fni1);
        }
        return fni1;
    }
}
