// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            ay, au, fs

public final class ft
{

    private WeakHashMap a;

    public ft()
    {
        a = new WeakHashMap();
    }

    public fs a(Context context)
    {
    /* block-local class not found */
    class a {}

        Object obj = (a)a.get(context);
        if (obj != null && !((a) (obj)).a() && ((Boolean)ay.ac.c()).booleanValue())
        {
            obj = (new fs.a(context, ((a) (obj)).b)).a();
        } else
        {
            obj = (new fs.a(context)).a();
        }
        a.put(context, new a(((fs) (obj))));
        return ((fs) (obj));
    }
}
