// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class bje
{

    private static final ExecutorService i = Executors.newCachedThreadPool();
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    ExecutorService g;
    List h;

    bje()
    {
        a = true;
        b = true;
        c = true;
        d = true;
        f = true;
        g = i;
    }

}
