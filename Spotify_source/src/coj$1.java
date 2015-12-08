// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executors;

final class  extends bqq
{

    public final bqr a(Context context, Looper looper, bry bry, Object obj, bqw bqw, bqx bqx)
    {
        obj = (col)obj;
        if (obj == null)
        {
            obj = col.a;
        }
        return new cqg(context, looper, true, bry, ((col) (obj)), bqw, bqx, Executors.newSingleThreadExecutor());
    }

    ()
    {
    }
}
