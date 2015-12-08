// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

final class hod
    implements epb
{

    private final Context a;

    public hod(Context context)
    {
        a = context;
    }

    public final void a(int i, ekq ekq, boolean flag)
    {
        ekq = new hom(a, ekq, i);
        ekq.a = flag;
        ekq = ekq.a();
        ekq.addFlags(0x10000000);
        a.startActivity(ekq);
    }
}
