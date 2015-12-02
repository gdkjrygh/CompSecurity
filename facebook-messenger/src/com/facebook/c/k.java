// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.Context;
import android.content.Intent;
import com.google.common.a.ev;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Map;

// Referenced classes of package com.facebook.c:
//            q, b

public class k extends q
{

    private final ev a;

    public k(String s, b b1)
    {
        this(((Map) (ev.a(s, b1))));
    }

    public k(Map map)
    {
        Preconditions.checkNotNull(map);
        boolean flag;
        if (!map.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Must include an entry for at least one action");
        a = ev.a(map);
    }

    protected final Optional b(Context context, Intent intent)
    {
        intent = intent.getAction();
        context = null;
        if (intent != null)
        {
            context = (b)a.get(intent);
        }
        return Optional.fromNullable(context);
    }

    public final Iterable b()
    {
        return a.i_();
    }
}
