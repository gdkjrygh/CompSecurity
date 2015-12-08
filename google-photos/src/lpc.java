// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

final class lpc extends jyi
{

    lpc()
    {
    }

    public final List a(Object obj)
    {
        return Arrays.asList(new Scope[] {
            lpb.b, lpb.c
        });
    }

    public final jyl a(Context context, Looper looper, kax kax, Object obj, jyq jyq, jys jys)
    {
        obj = (loi)obj;
        return new low(context, looper, true, kax, jyq, jys, Executors.newSingleThreadExecutor());
    }
}
