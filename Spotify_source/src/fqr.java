// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fqr
    implements fql, fqp, fqt
{

    public final Context a;
    public fqo b;
    public fqs c;
    public ArrayList d;
    private final List e = new ArrayList();

    public fqr(Context context)
    {
        d = new ArrayList();
        a = context;
    }

    public final fqx a()
    {
        if (e.isEmpty())
        {
            return null;
        } else
        {
            return (fqx)e.get(0);
        }
    }

    public final void a(fqk fqk1)
    {
        fqk1.a();
        d.remove(fqk1);
    }

    public final void a(fqx fqx1, boolean flag)
    {
        if (flag)
        {
            e.remove(fqx1);
            if ("inapp".equals(fqx1.a))
            {
                fqx1 = new fqk(a, fqx1);
                fqx1.c = this;
                fqx1.d = new fqv(((fqk) (fqx1)).a);
                ((fqk) (fqx1)).d.f = fqx1;
                if (((fqk) (fqx1)).c != null)
                {
                    ((fqk) (fqx1)).c.a(fqx1);
                }
                d.add(fqx1);
            }
        } else
        if (e.size() > 1)
        {
            e.remove(fqx1);
            e.add(fqx1);
            return;
        }
    }

    public final void a(ArrayList arraylist)
    {
        if (arraylist.isEmpty())
        {
            return;
        }
        arraylist = arraylist.iterator();
_L9:
        if (!arraylist.hasNext()) goto _L2; else goto _L1
_L1:
        fqx fqx1;
        Iterator iterator;
        fqx1 = (fqx)arraylist.next();
        iterator = e.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((fqx)iterator.next()).b.equals(fqx1.b)) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L7:
        Logger.a("Got purchase to register (%s), already scheduled? %s", new Object[] {
            fqx1.b, Boolean.valueOf(flag)
        });
        if (!flag)
        {
            e.add(fqx1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L7; else goto _L2
_L2:
        if (c == null)
        {
            c = new fqs(a, this);
            arraylist = c;
            ((fqs) (arraylist)).c.a(dtw.a, fqu.a());
            ((fqs) (arraylist)).b.a();
            arraylist.d = Cosmos.getResolver(((fqs) (arraylist)).a);
            return;
        }
        c.b.b();
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void b()
    {
        if (c != null)
        {
            c.a();
            c = null;
        }
    }
}
