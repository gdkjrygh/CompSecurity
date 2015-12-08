// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.jg;

// Referenced classes of package com.google.android.gms.location:
//            l

static final class c
    implements com.google.android.gms.common.api.b
{

    public int a()
    {
        return 0x7fffffff;
    }

    public com.google.android.gms.common.api.b a(Context context, Looper looper, jg jg1, Object obj, com.google.android.gms.common.api.b b, com.google.android.gms.common.api.b b1)
    {
        return a(context, looper, jg1, (com.google.android.gms.common.api.b)obj, b, b1);
    }

    public ch a(Context context, Looper looper, jg jg1, com.google.android.gms.common.api.b b, com.google.android.gms.common.api.b b1, com.google.android.gms.common.api.b b2)
    {
        return new ch(context, looper, context.getPackageName(), b1, b2, "locationServices", jg1.a());
    }

    c()
    {
    }
}
