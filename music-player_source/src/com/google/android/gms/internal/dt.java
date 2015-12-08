// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            dr

public final class dt
{

    private final Object a = new Object();
    private int b;
    private int c;
    private final String d;

    public dt(String s)
    {
        d = s;
    }

    public final Bundle a()
    {
        Bundle bundle;
        synchronized (a)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", b);
            bundle.putInt("pmnll", c);
        }
        return bundle;
    }

    public final void a(int i, int j)
    {
        synchronized (a)
        {
            b = i;
            c = j;
            dr.a(d, this);
        }
    }
}
