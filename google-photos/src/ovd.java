// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

public abstract class ovd
    implements Comparable
{

    final int a;
    boolean b;

    protected ovd(String s, int i)
    {
        a = i;
    }

    public void a()
    {
        b = true;
    }

    public abstract void a(int i, Bitmap bitmap);

    public abstract void a(Exception exception);

    public abstract boolean a(int i);

    public abstract int b();

    public abstract int c();

    public int compareTo(Object obj)
    {
        return ((ovd)obj).a - a;
    }

    public abstract void d();
}
