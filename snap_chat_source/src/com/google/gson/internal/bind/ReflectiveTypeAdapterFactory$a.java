// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson.internal.bind:
//            ReflectiveTypeAdapterFactory

static abstract class c
{

    final String a;
    final boolean b;
    final boolean c;

    abstract void a(JsonReader jsonreader, Object obj);

    abstract void a(JsonWriter jsonwriter, Object obj);

    abstract boolean a(Object obj);

    protected (String s, boolean flag, boolean flag1)
    {
        a = s;
        b = flag;
        c = flag1;
    }
}
