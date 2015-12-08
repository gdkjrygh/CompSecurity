// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.HashSet;

// Referenced classes of package com.paypal.android.sdk:
//            L

final class M extends HashSet
{

    M()
    {
        L al[] = L.values();
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            L l = al[i];
            if (L.a(l))
            {
                add(l.a());
            }
        }

    }
}
