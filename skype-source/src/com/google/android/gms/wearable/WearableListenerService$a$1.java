// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, e

final class a
    implements Runnable
{

    final DataHolder a;
    final taChanged b;

    public final void run()
    {
        e e1 = new e(a);
        b.b.onDataChanged(e1);
        e1.a();
        return;
        Exception exception;
        exception;
        e1.a();
        throw exception;
    }

    A(A a1, DataHolder dataholder)
    {
        b = a1;
        a = dataholder;
        super();
    }
}
