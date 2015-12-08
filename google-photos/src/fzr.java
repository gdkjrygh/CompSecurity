// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fzr
{

    public static final String a = fzl.getName();
    public static final String b = fzj.getName();
    private static fzq c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new fzq();
        }
        olm1.a(fzj, new fzj[] {
            new fzm(context), new fzo(context), new fzp(context), new fzn(context.getContentResolver())
        });
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new fzq();
        }
        olm1.a(fzl, new fzl());
    }

}
