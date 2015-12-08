// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.a;

import android.content.Context;
import com.roidapp.videolib.core.a.c;

// Referenced classes of package com.roidapp.videolib.a:
//            b

public final class a
{

    private static c a;

    public static c a(Context context)
    {
        a();
        context = new b(context);
        a = context;
        return context;
    }

    public static void a()
    {
        if (a != null)
        {
            a.b();
            a = null;
        }
    }
}
