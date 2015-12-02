// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.Context;
import android.content.Intent;
import com.facebook.inject.t;
import com.google.common.a.fi;
import com.google.common.base.Optional;
import java.util.Iterator;

// Referenced classes of package com.facebook.c:
//            q, l, n, c

public abstract class m extends q
{

    private final fi a;

    protected m(Iterable iterable)
    {
        a = fi.a(iterable);
    }

    protected m(String s)
    {
        this(((Iterable) (fi.b(s))));
    }

    protected abstract void a(Context context, Intent intent, c c, String s);

    protected final Optional b(Context context, Intent intent)
    {
        context = (l)a(context).a(com/facebook/c/l);
        intent = intent.getAction();
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if (context.a(s).equals(intent))
            {
                return Optional.of(new n(this, s));
            }
        }

        return Optional.absent();
    }

    public final Iterable b()
    {
        return a;
    }
}
