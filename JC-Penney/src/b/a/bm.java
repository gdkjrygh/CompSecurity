// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

// Referenced classes of package b.a:
//            bj, bk

public final class bm
    implements bj
{

    private Float a;

    public bm()
    {
        a = null;
        bk.b();
        a = Float.valueOf(bk.b().getResources().getDisplayMetrics().ydpi);
    }

    public final String a()
    {
        return "ydpi";
    }

    public final volatile Object b()
    {
        return a;
    }
}
