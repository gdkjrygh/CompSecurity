// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.HttpURLConnection;
import java.net.URL;

public final class ajn
{

    public static final ajo a = new _cls1();

    public ajn()
    {
    }

    protected static HttpURLConnection a(String s)
    {
        return (HttpURLConnection)(new URL(s)).openConnection();
    }

    public final ajw a(String s, ajo ajo)
    {
        return ajb.a(new _cls2(s, ajo));
    }


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
