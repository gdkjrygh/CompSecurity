// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android_src.mms.transaction:
//            l

public abstract class k
{

    private final ArrayList a = new ArrayList();
    private Iterator b;

    public k()
    {
    }

    public void a(l l1)
    {
        a.add(l1);
    }

    public void b(l l1)
    {
        if (b != null)
        {
            b.remove();
            return;
        } else
        {
            a.remove(l1);
            return;
        }
    }

    public void c()
    {
        b = a.iterator();
        while (b.hasNext()) 
        {
            ((l)b.next()).a(this);
        }
        break MISSING_BLOCK_LABEL_52;
        Exception exception;
        exception;
        b = null;
        throw exception;
        b = null;
        return;
    }
}
