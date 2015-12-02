// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

final class bjx extends bkq
{

    private bkq a;

    bjx()
    {
    }

    public final Object a(JsonReader jsonreader)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            return a.a(jsonreader);
        }
    }

    public final void a(bkq bkq1)
    {
        if (a != null)
        {
            throw new AssertionError();
        } else
        {
            a = bkq1;
            return;
        }
    }

    public final void a(JsonWriter jsonwriter, Object obj)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            a.a(jsonwriter, obj);
            return;
        }
    }
}
