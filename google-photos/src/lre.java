// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

final class lre
{

    final lqz a;
    private final Context b;

    public lre(Context context, lpk lpk1, lqz lqz1)
    {
        boolean flag1 = false;
        super();
        b = context;
        context = lqz1;
        if (lpk1 != null)
        {
            boolean flag;
            if (lpk1.b == 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                context = lqz1;
            } else
            {
                context = new lra(lqz1.d);
                context.d = lpk1.b("trackingId");
                context.b = lpk1.a("trackScreenViews");
                context.c = lpk1.a("collectAdIdentifiers");
                context = context.a();
            }
        }
        a = context;
        if (a.a && !TextUtils.isEmpty(a.c))
        {
            context = a.c;
            context = jqp.a(b).a(context);
            context.a = a.b;
            context = new lrf(context);
            b.d(context);
            lpk1 = lji.a(b);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                flag = flag1;
                if (((lji) (lpk1)).c != null)
                {
                    flag = true;
                }
                if (!flag)
                {
                    lpk1.c = new ljt(lpk1);
                    ((lji) (lpk1)).a.registerActivityLifecycleCallbacks(((lji) (lpk1)).c);
                }
            }
            lpk1.a(context);
        }
    }
}
