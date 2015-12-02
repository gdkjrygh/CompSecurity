// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appconfig;

import com.facebook.inject.d;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.appconfig:
//            b, f, g

class h extends d
{

    final f a;

    private h(f f)
    {
        a = f;
        super();
    }

    h(f f, g g)
    {
        this(f);
    }

    public b a()
    {
        return new b((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }
}
