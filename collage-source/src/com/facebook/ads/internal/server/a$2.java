// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import com.facebook.ads.internal.AdErrorType;
import com.facebook.ads.internal.b;
import com.facebook.ads.internal.http.c;
import com.facebook.ads.internal.util.d;
import org.json.JSONException;

// Referenced classes of package com.facebook.ads.internal.server:
//            a, b, c, e

class t> extends c
{

    final a a;

    public void a()
    {
    }

    public void a(int i, String s)
    {
        d.b(com.facebook.ads.internal.server.a.d(a));
        com.facebook.ads.internal.server.a.a(a, null);
        com.facebook.ads.internal.server.a.a(a, s);
    }

    public void a(Throwable throwable, String s)
    {
        d.b(com.facebook.ads.internal.server.a.d(a));
        com.facebook.ads.internal.server.a.a(a, null);
        Object obj;
        a a1;
        AdErrorType aderrortype;
        obj = com.facebook.ads.internal.server.a.e(a).a(s);
        if (((com.facebook.ads.internal.server.c) (obj)).a() != com.facebook.ads.internal.server.b)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = ((e)obj).b();
        a1 = a;
        aderrortype = AdErrorType.ERROR_MESSAGE;
        if (obj != null)
        {
            s = ((String) (obj));
        }
        try
        {
            com.facebook.ads.internal.server.a.a(a1, aderrortype.getAdErrorWrapper(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        com.facebook.ads.internal.server.a.a(a, new b(AdErrorType.NETWORK_ERROR, throwable.getMessage()));
        return;
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
