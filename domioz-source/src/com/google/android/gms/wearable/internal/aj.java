// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.z;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ai, zzy, y, ae

final class aj extends ai
{

    public aj(z z)
    {
        super(z);
    }

    public final void a(zzy zzy1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(zzy1.c);
        a(new y(ae.a(zzy1.b), arraylist));
    }
}
