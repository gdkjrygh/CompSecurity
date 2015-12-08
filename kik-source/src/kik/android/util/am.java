// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import kik.android.d.c;
import kik.android.d.d;
import kik.android.d.l;

// Referenced classes of package kik.android.util:
//            ar

public final class am
{

    private static c a;
    private static Context b;

    public static void a(Context context, ar ar)
    {
        b = context;
        c c1 = d.a(context);
        a = c1;
        c1.a(new l(context, "animation-type", "regular", new String[] {
            "regular", "slide"
        }, null, ar));
    }
}
