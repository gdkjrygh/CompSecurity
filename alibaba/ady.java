// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Map;

public abstract class ady
{

    protected String a;

    public ady(String s)
        throws MalformedURLException
    {
        a = s;
    }

    public abstract void a()
        throws IOException;

    public abstract void a(boolean flag);

    public abstract Map b();

    public abstract void c();

    public abstract int d()
        throws IOException;

    public abstract InputStream e()
        throws IOException;

    public abstract int f();

    public abstract String g();
}
