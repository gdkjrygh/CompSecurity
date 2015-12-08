// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ApplicationErrorReport;

public final class mbo extends mbn
    implements mbe, mbf
{

    private kov b;

    public mbo()
    {
        b = new kov();
        a = b;
    }

    public final mbd a()
    {
        return new mbm(b.a());
    }

    public final mbf a(int i)
    {
        b.e.crashInfo.throwLineNumber = i;
        return this;
    }

    public final mbf c(String s)
    {
        b.e.crashInfo.exceptionClassName = s;
        return this;
    }

    public final mbf d(String s)
    {
        b.e.crashInfo.throwFileName = s;
        return this;
    }

    public final mbf e(String s)
    {
        b.e.crashInfo.throwClassName = s;
        return this;
    }

    public final mbf f(String s)
    {
        b.e.crashInfo.throwMethodName = s;
        return this;
    }

    public final mbf g(String s)
    {
        b.e.crashInfo.stackTrace = s;
        return this;
    }
}
