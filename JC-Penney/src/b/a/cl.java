// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

// Referenced classes of package b.a:
//            bj, bk

public final class cl
    implements bj
{

    private Float a;

    public cl()
    {
        a = null;
        bk.b();
        a = Float.valueOf(bk.b().getResources().getDisplayMetrics().xdpi);
    }

    public final String a()
    {
        return "xdpi";
    }

    public final volatile Object b()
    {
        return a;
    }
}
