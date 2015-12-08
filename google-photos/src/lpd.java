// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executors;

final class lpd extends jyi
{

    lpd()
    {
    }

    public final jyl a(Context context, Looper looper, kax kax, Object obj, jyq jyq, jys jys)
    {
        obj = loi.a;
        return new low(context, looper, false, kax, jyq, jys, Executors.newSingleThreadExecutor());
    }
}
