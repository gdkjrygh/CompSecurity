// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class dyt
    implements dur
{

    private final Context a;

    public dyt(Context context)
    {
        a = context;
    }

    public final int a(int i)
    {
        return 0;
    }

    public final duu a(dui dui)
    {
        return null;
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.assistant.ratetheapp";
    }

    public final List a(int i, imi imi1)
    {
        Object obj;
        boolean flag1;
        obj = new dyu(a, i);
        if (((dyu) (obj)).d.a(((dyu) (obj)).e).a("is_rate_the_app_card_dismissed", false))
        {
            flag1 = false;
        } else
        {
label0:
            {
                if (!((dyu) (obj)).d.a(((dyu) (obj)).e).a("rate_the_app_assistant_card_init", false))
                {
                    break label0;
                }
                flag1 = true;
            }
        }
_L1:
        ekq ekq;
        boolean flag;
        long l;
        if (flag1)
        {
            obj = new dun();
            obj.f = "com.google.android.apps.photos.assistant.ratetheapp";
            obj.g = 1005;
            obj.b = dva.b;
            obj.c = 0x7fffffffL;
            obj.a = new duj(i, "rate_the_app_card", "com.google.android.apps.photos.assistant.ratetheapp");
            obj.e = imi1.a(0);
            obj.h = dul.d;
            return Arrays.asList(new dum[] {
                ((dun) (obj)).a()
            });
        } else
        {
            return Collections.emptyList();
        }
        l = System.currentTimeMillis();
        ekq = b.a(((dyu) (obj)).e, null);
        if (!dyu.a(((dyu) (obj)).d, ((dyu) (obj)).e, l, dyu.b) || !dyu.a(((dyu) (obj)).d, ((dyu) (obj)).e, 5))
        {
            break MISSING_BLOCK_LABEL_287;
        }
        if (b.a(((dyu) (obj)).c, ekq).a(ekq, ekw.a) >= 500L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || !((dyu) (obj)).a())
        {
            break MISSING_BLOCK_LABEL_287;
        }
        flag1 = true;
_L2:
        ((dyu) (obj)).d.b(((dyu) (obj)).e).c("rate_the_app_assistant_card_init", flag1).d();
          goto _L1
        flag1 = false;
          goto _L2
    }

    public final void a(List list)
    {
    }

    public final int b(dui dui)
    {
        return dut.b;
    }

    public final Uri b()
    {
        return dyu.a;
    }

    public final boolean c()
    {
        return false;
    }
}
