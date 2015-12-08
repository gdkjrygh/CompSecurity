// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ixs
    implements opn, opv
{

    final Set a = new HashSet();

    public ixs(opd opd1)
    {
        opd1.a(this);
    }

    final void a()
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (ixt)iterator.next();
            obj = ((ixt) (obj)).a.b(((ixt) (obj)).b);
            if (obj != null)
            {
                ((ei) (obj)).e();
            }
        } while (true);
    }

    final void b()
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (ixt)iterator.next();
            obj = ((ixt) (obj)).a.b(((ixt) (obj)).b);
            if (obj != null)
            {
                ((ei) (obj)).i();
            }
        } while (true);
    }

    public final void c()
    {
        a.clear();
    }
}
