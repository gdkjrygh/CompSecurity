// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import java.util.concurrent.Executor;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            CancelState, TDURLConnection

interface TDHttpClient
{

    public abstract TDURLConnection a(CancelState cancelstate);

    public abstract void a(Context context, int i, String s, boolean flag);

    public abstract void a(Executor executor);
}
