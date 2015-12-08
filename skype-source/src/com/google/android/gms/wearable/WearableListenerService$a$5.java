// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

final class a
    implements Runnable
{

    final List a;
    final a b;

    public final void run()
    {
        b.b.onConnectedNodes(a);
    }

    A(A a1, List list)
    {
        b = a1;
        a = list;
        super();
    }
}
