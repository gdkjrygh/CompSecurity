// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Ci
{

    final Bm a;

    public Ci()
    {
        this(Bm.a());
    }

    private Ci(Bm bm)
    {
        a = bm;
    }

    public final int a()
    {
        return a.a("DOWNLOAD_MANAGER_ANDROID", "NUMBER_CONCURRENT_DOWNLOADS", 3);
    }

    public final int b()
    {
        return a.a("DOWNLOAD_MANAGER_ANDROID", "MAX_CONCURRENT_DOWNLOADS_PER_CONTEXT", 2);
    }
}
