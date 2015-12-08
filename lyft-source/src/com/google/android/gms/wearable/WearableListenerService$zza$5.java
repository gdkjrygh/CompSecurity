// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class a
    implements Runnable
{

    final List a;
    final a b;

    public void run()
    {
        b.b.onConnectedNodes(a);
    }

    ( , List list)
    {
        b = ;
        a = list;
        super();
    }
}
