// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.P;

final class w extends P
{

    private String e;

    w(Context context, String s, String s1)
    {
        super(context, 0x10006, 0x10007, 0x13353c9, s);
        e = s1;
    }

    protected final void a(Bundle bundle)
    {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", e);
    }
}
