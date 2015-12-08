// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;

// Referenced classes of package com.google.android.gms.internal:
//            uz, vb

final class va
    implements l
{

    public final int a;
    public final h b;
    public final l c;
    final uz d;

    public va(uz uz1, int i, h h1, l l1)
    {
        d = uz1;
        super();
        a = i;
        b = h1;
        c = l1;
        h1.a(this);
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        uz.e(d).post(new vb(d, a, connectionresult));
    }
}
