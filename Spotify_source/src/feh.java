// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.RequestBuilder;

final class feh
    implements hfw
{

    feh()
    {
    }

    public final Object call(Object obj)
    {
        obj = (String)obj;
        return RequestBuilder.get((new StringBuilder("hm://")).append(((String) (obj))).toString()).build();
    }
}
