// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.a;
import com.facebook.n;
import com.facebook.p;

public abstract class C
{

    private n a;

    public C()
    {
        a = null;
    }

    public void a(a a1)
    {
        if (a != null)
        {
            a.onCancel();
        }
    }

    public abstract void a(a a1, Bundle bundle);

    public void a(a a1, p p)
    {
        if (a != null)
        {
            a.onError(p);
        }
    }
}
