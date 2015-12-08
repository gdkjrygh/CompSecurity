// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class dwt
    implements dur
{

    private final Context a;

    public dwt(Context context)
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
        return "com.google.android.apps.photos.assistant.devicefolders";
    }

    public final List a(int i, imi imi1)
    {
        if (dwu.a(a, i))
        {
            dun dun1 = new dun();
            dun1.f = "com.google.android.apps.photos.assistant.devicefolders";
            dun1.g = 1002;
            dun1.b = dva.b;
            dun1.c = 0x7fffffffL;
            dun1.a = new duj(i, "device_folders_card", "com.google.android.apps.photos.assistant.devicefolders");
            dun1.e = imi1.a(0);
            dun1.h = dul.d;
            return Arrays.asList(new dum[] {
                dun1.a()
            });
        } else
        {
            return Collections.emptyList();
        }
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
        return dwu.a;
    }

    public final boolean c()
    {
        return false;
    }
}
