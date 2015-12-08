// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.a:
//            i

static abstract class i
{

    final String g;
    final boolean h;
    final boolean i;

    abstract void a(JsonReader jsonreader, Object obj)
        throws IOException, IllegalAccessException;

    abstract void a(JsonWriter jsonwriter, Object obj)
        throws IOException, IllegalAccessException;

    protected n(String s, boolean flag, boolean flag1)
    {
        g = s;
        h = flag;
        i = flag1;
    }
}
