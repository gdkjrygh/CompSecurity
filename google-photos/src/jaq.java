// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class jaq
    implements dur
{

    static final Uri a = (new android.net.Uri.Builder()).authority("com.google.android.apps.photos.trash.local.assistant").scheme("content").appendPath("card").build();
    private final jan b;

    public jaq(Context context)
    {
        b = (jan)olm.a(context, jan);
    }

    static dui b(int i)
    {
        return new duj(i, "local_trash_card", "com.google.android.apps.photos.trash.local.assistant");
    }

    public final int a(int i)
    {
        List list = a(i, null);
        if (list.isEmpty())
        {
            return 0;
        }
        if (list.size() > 1)
        {
            throw new IllegalStateException("Local Trash Full Card Source is providing more than one assistant card");
        }
        return b(((dum)list.get(0)).a) != dut.a ? 0 : 1;
    }

    public final duu a(dui dui)
    {
        return null;
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.trash.local.assistant";
    }

    public final List a(int i, imi imi1)
    {
        if (b.a("com.google.android.apps.photos.trash.local.assistant.shouldShowCard"))
        {
            Bundle bundle = new Bundle();
            Object obj = b;
            ekq ekq = iyw.a(i);
            bundle.putInt("extra_item_count", (int)b.a(((jan) (obj)).a, ekq).a(ekq, ekw.a));
            obj = new dun();
            obj.f = "com.google.android.apps.photos.trash.local.assistant";
            obj.g = 1008;
            obj.b = dva.b;
            obj.c = 0x7fffffffL;
            obj.a = new duj(i, "local_trash_card", "com.google.android.apps.photos.trash.local.assistant");
            long l;
            if (imi1 == null)
            {
                l = -1L;
            } else
            {
                l = imi1.a("com.google.android.apps.photos.trash.local.assistant".hashCode());
            }
            obj.e = l;
            obj.h = dul.d;
            obj.i = bundle;
            return Arrays.asList(new dum[] {
                ((dun) (obj)).a()
            });
        } else
        {
            return Collections.emptyList();
        }
    }

    public final void a(List list)
    {
        b.b("com.google.android.apps.photos.trash.local.assistant.hasShown");
    }

    public final int b(dui dui)
    {
        if (b.a("com.google.android.apps.photos.trash.local.assistant.hasShown"))
        {
            return dut.b;
        } else
        {
            return dut.a;
        }
    }

    public final Uri b()
    {
        return a;
    }

    public final boolean c()
    {
        return false;
    }

}
