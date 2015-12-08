// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class fjr
    implements fjs
{

    private Set a;

    public fjr()
    {
        a = new HashSet();
    }

    public final Optional a()
    {
        return Optional.e();
    }

    public final void a(fjt fjt1)
    {
        a.add(fjt1);
    }

    public final Optional b()
    {
        return Optional.e();
    }

    protected final void c()
    {
        if (!a.isEmpty())
        {
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                ((fjt)iterator.next()).a();
            }
        }
    }
}
