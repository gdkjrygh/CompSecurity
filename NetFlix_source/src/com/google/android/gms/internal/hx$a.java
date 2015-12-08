// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            hx

final class TD extends TD
    implements com.google.android.gms.panorama.amaApi.a
{

    public final Status TC;
    public final Intent TD;
    final hx TE;
    public final int type;

    protected void a(Object obj)
    {
        c((com.google.android.gms.common.api.a)obj);
    }

    protected void c(com.google.android.gms.common.api.a a1)
    {
        a1.(this);
    }

    protected void dx()
    {
    }

    public Status getStatus()
    {
        return TC;
    }

    public Intent getViewerIntent()
    {
        return TD;
    }

    public tus(hx hx1, com.google.android.gms.common.api.s s, Status status, int i, Intent intent)
    {
        TE = hx1;
        super(hx1, s);
        TC = status;
        type = i;
        TD = intent;
    }
}
