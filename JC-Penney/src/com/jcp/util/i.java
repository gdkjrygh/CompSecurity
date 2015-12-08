// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;

// Referenced classes of package com.jcp.util:
//            j

public final class i
{

    private static final String a = com/jcp/util/i.getName();

    private i()
    {
    }

    static String a()
    {
        return a;
    }

    public static void a(Context context)
    {
        (new Thread(new j(context))).start();
    }

}
