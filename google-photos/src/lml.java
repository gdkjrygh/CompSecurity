// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;

final class lml extends jyi
{

    lml()
    {
    }

    public final jyl a(Context context, Looper looper, kax kax, Object obj, jyq jyq, jys jys)
    {
        obj = (lmm)obj;
        b.f(obj, "Must provide valid PeopleOptions!");
        return new lnd(context, looper, jyq, jys, String.valueOf(((lmm) (obj)).a), kax);
    }
}
