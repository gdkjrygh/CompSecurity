// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.parser;

import java.util.HashMap;

// Referenced classes of package com.github.nkzawa.engineio.parser:
//            c

static final class put extends HashMap
{

    ()
    {
        put("open", Integer.valueOf(0));
        put("close", Integer.valueOf(1));
        put("ping", Integer.valueOf(2));
        put("pong", Integer.valueOf(3));
        put("message", Integer.valueOf(4));
        put("upgrade", Integer.valueOf(5));
        put("noop", Integer.valueOf(6));
    }
}
