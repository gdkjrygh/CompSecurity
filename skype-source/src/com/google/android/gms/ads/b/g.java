// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.b;

import android.os.Bundle;
import android.view.View;

public abstract class g
{

    protected boolean a;
    protected boolean b;
    protected Bundle c;

    public g()
    {
        c = new Bundle();
    }

    public final void a()
    {
        a = true;
    }

    public void a(View view)
    {
    }

    public final void b()
    {
        b = true;
    }

    public final boolean c()
    {
        return a;
    }

    public final boolean d()
    {
        return b;
    }

    public final Bundle e()
    {
        return c;
    }
}
