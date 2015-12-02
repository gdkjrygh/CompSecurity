// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.Context;

// Referenced classes of package android_src.mms.transaction:
//            d

final class e
    implements Runnable
{

    final Context a;
    final boolean b;
    final boolean c;

    e(Context context, boolean flag, boolean flag1)
    {
        a = context;
        b = flag;
        c = flag1;
        super();
    }

    public void run()
    {
        d.b(a, b, c);
    }
}
