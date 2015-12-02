// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json.jsonmirror.a;

import com.fasterxml.jackson.core.JsonFactory;

// Referenced classes of package com.facebook.common.json.jsonmirror.a:
//            a, c, j, h

public class f extends a
{

    public final a g;
    public final JsonFactory h;

    public f(a a1, JsonFactory jsonfactory)
    {
        if (!(a1 instanceof c) && !(a1 instanceof j) && !(a1 instanceof h))
        {
            throw new com.facebook.common.json.jsonmirror.f("stringified values can only encapsulate complex types.");
        } else
        {
            g = a1;
            h = jsonfactory;
            return;
        }
    }
}
