// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.e;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, e, cl

final class be extends o
{

    private static final String a;
    private final com.google.android.gms.tagmanager.e b;

    public be(Context context)
    {
        this(e.a(context));
    }

    private be(com.google.android.gms.tagmanager.e e1)
    {
        super(a, new String[0]);
        b = e1;
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        boolean flag;
        if (!b.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return cl.a(Boolean.valueOf(flag));
    }

    public final boolean a()
    {
        return false;
    }

    static 
    {
        a = e.b.toString();
    }
}
