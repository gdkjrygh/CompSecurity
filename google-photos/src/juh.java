// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;

final class juh extends jyi
{

    juh()
    {
    }

    public final jyl a(Context context, Looper looper, kax kax, Object obj, jyq jyq, jys jys)
    {
        obj = (jum)obj;
        b.f(obj, "Setting the API options is required.");
        return new jwh(context, looper, kax, ((jum) (obj)).a, ((jum) (obj)).c, ((jum) (obj)).b, jyq, jys);
    }
}
