// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.parser.JsonHttpParser;
import com.spotify.mobile.android.cosmos.parser.ResponseParser;

public final class eou extends eov
{

    private eou(Class class1, Resolver resolver, Handler handler)
    {
        super(class1, resolver, handler);
    }

    public static eou a(Class class1, Resolver resolver, Handler handler)
    {
        return new eou(class1, resolver, handler);
    }

    protected final ResponseParser a(Class class1)
    {
        return new JsonHttpParser(class1);
    }
}
