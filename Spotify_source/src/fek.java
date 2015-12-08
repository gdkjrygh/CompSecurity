// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.RequestBuilder;

final class fek
    implements hfw
{

    private static final fek a = new fek();

    private fek()
    {
    }

    public static hfw a()
    {
        return a;
    }

    public final Object call(Object obj)
    {
        return RequestBuilder.get((String)obj).build();
    }

}
