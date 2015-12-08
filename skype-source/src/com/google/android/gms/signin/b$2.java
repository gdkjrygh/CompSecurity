// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.signin.internal.i;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.signin:
//            b, e

static final class a.b extends com.google.android.gms.common.api..i
{

    public final com.google.android.gms.common.api..i a(Context context, Looper looper, com.google.android.gms.common.internal.i j, Object obj, com.google.android.gms.common.api..i k, com.google.android.gms.common.api..i l)
    {
        obj = e.a;
        return new i(context, looper, false, j, k, l, Executors.newSingleThreadExecutor());
    }

    a.b()
    {
    }
}
