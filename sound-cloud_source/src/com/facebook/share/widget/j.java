// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.a;
import com.facebook.share.internal.b;
import com.facebook.share.internal.y;
import com.facebook.share.model.ShareContent;

final class j
    implements com.facebook.internal.o.a
{

    final a a;
    final ShareContent b;
    final boolean c;
    final i.c d;

    j(i.c c1, a a1, ShareContent sharecontent, boolean flag)
    {
        d = c1;
        a = a1;
        b = sharecontent;
        c = flag;
        super();
    }

    public final Bundle a()
    {
        return y.a(a.a, b, c);
    }

    public final Bundle b()
    {
        return com.facebook.share.internal.b.a(a.a, b, c);
    }
}
