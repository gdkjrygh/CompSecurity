// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class d
{

    private static final ExecutorService i = Executors.newCachedThreadPool();
    public boolean a;
    public boolean b;
    boolean c;
    boolean d;
    public boolean e;
    boolean f;
    ExecutorService g;
    List h;

    d()
    {
        a = true;
        b = true;
        c = true;
        d = true;
        f = true;
        g = i;
    }

}
