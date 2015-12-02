// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

abstract class bmd
{

    final String g;
    final boolean h;
    final boolean i;

    protected bmd(String s, boolean flag, boolean flag1)
    {
        g = s;
        h = flag;
        i = flag1;
    }

    abstract void a(JsonReader jsonreader, Object obj);

    abstract void a(JsonWriter jsonwriter, Object obj);

    abstract boolean a(Object obj);
}
