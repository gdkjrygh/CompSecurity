// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

class mbs
    implements mbr
{

    private kpc a;

    protected mbs(Context context)
    {
        a = kpc.a(context);
    }

    public final String a(String s)
    {
        return a.a(new String[] {
            s
        });
    }

    public final void a()
    {
        kpc kpc1 = a;
        kpc.a = null;
        kpc1.a();
    }

    public final boolean a(Intent intent)
    {
        return "gcm".equals(kpc.a(intent));
    }

    public final boolean b(Intent intent)
    {
        return "send_error".equals(kpc.a(intent));
    }

    public final boolean c(Intent intent)
    {
        return "deleted_messages".equals(kpc.a(intent));
    }

    public final boolean d(Intent intent)
    {
        return TextUtils.isEmpty(kpc.a(intent));
    }
}
