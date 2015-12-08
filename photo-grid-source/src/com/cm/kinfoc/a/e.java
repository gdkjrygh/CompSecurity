// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc.a;

import android.app.Application;
import java.io.File;
import java.io.InputStream;

public abstract class e
{

    private static e a = null;

    public e()
    {
    }

    public static e a()
    {
        if (a == null)
        {
            throw new RuntimeException("Virtual Commmon Base is null");
        } else
        {
            return a;
        }
    }

    public static void a(e e1)
    {
        a = e1;
    }

    public abstract String a(File file);

    public abstract String a(InputStream inputstream);

    public abstract String a(String s);

    public abstract void a(String s, String s1);

    public abstract Application b();

    public abstract File c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract String f();

    public abstract double g();

    public abstract String h();

    public abstract int i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

}
