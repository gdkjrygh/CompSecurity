// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

public final class czz
{

    public boolean a;
    public boolean b;
    public float c;
    final dab d;
    public final Handler e = new Handler();
    public final Runnable f = new daa(this);

    public czz(dab dab1)
    {
        a = false;
        b = true;
        d = (dab)b.a(dab1, "listener", null);
    }
}
