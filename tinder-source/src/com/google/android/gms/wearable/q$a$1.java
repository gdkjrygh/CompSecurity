// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable:
//            q, f

final class a
    implements Runnable
{

    final DataHolder a;
    final aHolder b;

    public final void run()
    {
        f f1 = new f(a);
        b.b.onDataChanged(f1);
        f1.b();
        return;
        Exception exception;
        exception;
        f1.b();
        throw exception;
    }

    aHolder(aHolder aholder, DataHolder dataholder)
    {
        b = aholder;
        a = dataholder;
        super();
    }
}
