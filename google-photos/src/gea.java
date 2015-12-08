// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class gea extends mvc
{

    private Bundle l;
    private gdz m;

    gea(gdz gdz1, Context context, Bundle bundle)
    {
        m = gdz1;
        l = bundle;
        super(context);
    }

    public final Object d()
    {
        gdy gdy1 = new gdy();
        int i = l.getInt("key_sync_account_id");
        gdy1.a = gdw.a(m.c).b(i);
        gdy1.b = gdw.b(m.c).e(i);
        return gdy1;
    }
}
