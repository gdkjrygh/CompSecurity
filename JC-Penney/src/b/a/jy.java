// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package b.a:
//            ks, kb, pc, ju, 
//            jx, ji

public abstract class jy extends ks
{

    public jy(String s, ji ji)
    {
        super(s, ji);
    }

    protected final void b()
    {
        if (a().size() > 0x10000)
        {
            String s;
            if (this instanceof kb)
            {
                s = "methods";
            } else
            {
                s = "fields";
            }
            throw new pc((new StringBuilder("Too many ")).append(s).append(": ").append(a().size()).append("; max is 65536").toString());
        }
        Iterator iterator = a().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ((jx)(ju)iterator.next()).a(i);
        }

    }
}
