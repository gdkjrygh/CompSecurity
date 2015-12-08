// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, aw, v

class t> extends a
{

    final aw avT;
    final com.google.android.gms.common.api.plementation.b avV;

    public void a(v v1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(v1.avz);
        avV.b(new init>(new Status(v1.statusCode), arraylist));
    }

    b(aw aw1, com.google.android.gms.common.api.plementation.b b)
    {
        avT = aw1;
        avV = b;
        super();
    }
}
