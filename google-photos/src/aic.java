// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Vector;

public final class aic
{

    aif a;
    aif b;
    Vector c;

    public aic()
    {
        a = null;
        b = null;
        c = new Vector();
    }

    aif a()
    {
        aif aif1 = aif.a(b, a);
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            aif1 = aif.a(aif1, ((aib)iterator.next()).b);
        }

        return aif1;
    }
}
