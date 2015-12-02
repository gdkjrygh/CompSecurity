// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.config.a.c;
import com.facebook.http.annotations.BootstrapPlatformAppHttpConfig;
import com.facebook.http.annotations.IsPhpProfilingEnabled;
import com.facebook.http.annotations.IsTeakProfilingEnabled;
import com.facebook.http.annotations.IsWirehogProfilingEnabled;
import com.facebook.http.annotations.ProductionPlatformAppHttpConfig;
import com.facebook.http.c.i;
import com.facebook.http.protocol.ar;
import com.facebook.http.protocol.q;
import com.facebook.http.protocol.s;
import com.facebook.inject.d;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.http.b:
//            ap, w, x

class an extends d
{

    final w a;

    private an(w w)
    {
        a = w;
        super();
    }

    an(w w, x x)
    {
        this(w);
    }

    public ar a()
    {
        return new ar(b(com/facebook/http/c/i), (i)a(com/facebook/http/c/i, com/facebook/http/annotations/ProductionPlatformAppHttpConfig), (i)a(com/facebook/http/c/i, com/facebook/http/annotations/BootstrapPlatformAppHttpConfig), (ap)a(com/facebook/http/b/ap), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), b(com/facebook/auth/viewercontext/ViewerContext), b(java/lang/Boolean, com/facebook/http/annotations/IsPhpProfilingEnabled), b(java/lang/Boolean, com/facebook/http/annotations/IsTeakProfilingEnabled), b(java/lang/Boolean, com/facebook/http/annotations/IsWirehogProfilingEnabled), (c)a(com/facebook/config/a/c), (JsonFactory)a(com/fasterxml/jackson/core/JsonFactory), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), (s)a(com/facebook/http/protocol/s), (q)a(com/facebook/http/protocol/q));
    }

    public Object b()
    {
        return a();
    }
}
