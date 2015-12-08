// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, au, t

class it> extends a
{

    final au amh;
    final com.google.android.gms.common.api.l.au ami;

    public void a(t t1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(t1.alN);
        ami.(new <init>(new Status(t1.statusCode), arraylist));
    }

    (au au1, com.google.android.gms.common.api.l.au au2)
    {
        amh = au1;
        ami = au2;
        super();
    }
}
