// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class kun
    implements Iterable
{

    final List a = new LinkedList();

    public kun()
    {
    }

    static kul b(kxu kxu)
    {
        for (Iterator iterator1 = jqc.k().iterator(); iterator1.hasNext();)
        {
            kul kul1 = (kul)iterator1.next();
            if (kul1.a == kxu)
            {
                return kul1;
            }
        }

        return null;
    }

    public final boolean a(kxu kxu)
    {
        return b(kxu) != null;
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }
}
