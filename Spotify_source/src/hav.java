// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.Locale;
import java.util.Map;

public final class hav
    implements hba
{

    private final gyk a;

    public hav()
    {
        this(((gyk) (new gxz())));
    }

    public hav(gyk gyk)
    {
        a = gyk;
    }

    public final HttpRequest a(HttpMethod httpmethod, String s, Map map)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[HttpMethod.values().length];
                try
                {
                    a[HttpMethod.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[HttpMethod.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[HttpMethod.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[HttpMethod.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[httpmethod.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 50
    //                   2 75
    //                   3 84
    //                   4 92;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException("Unsupported HTTP method!");
_L2:
        httpmethod = HttpRequest.a(s, map);
_L7:
        if (s != null)
        {
            s.toLowerCase(Locale.US).startsWith("https");
        }
        return httpmethod;
_L3:
        httpmethod = HttpRequest.b(s, map);
        continue; /* Loop/switch isn't completed */
_L4:
        httpmethod = HttpRequest.a(s);
        continue; /* Loop/switch isn't completed */
_L5:
        httpmethod = HttpRequest.b(s);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a()
    {
    }
}
