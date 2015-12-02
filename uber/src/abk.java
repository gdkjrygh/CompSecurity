// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class abk
{

    private final Collection a = new ArrayList();
    private final Collection b = new ArrayList();
    private final Collection c = new ArrayList();

    public abk()
    {
    }

    public final List a()
    {
        Object obj;
        long l;
        obj = new ArrayList();
        l = Binder.clearCallingIdentity();
        Iterator iterator = c.iterator();
_L2:
        String s;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_74;
            }
            s = (String)((abj)iterator.next()).d().d();
        } while (s == null);
        ((List) (obj)).add(s);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        Binder.restoreCallingIdentity(l);
        throw obj;
        Binder.restoreCallingIdentity(l);
        return ((List) (obj));
    }

    public final void a(abg abg)
    {
        a.add(abg);
    }

    public final void a(abj abj1)
    {
        b.add(abj1);
    }

    public final List b()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)((abj)iterator.next()).c();
            if (s != null)
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }
}
