// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

class bxo extends mtf
{

    private static final String a = bxo.getSimpleName();
    private final cyt b;

    bxo(String s, cyt cyt1)
    {
        String s1 = a;
        super((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("|").append(s).toString());
        b = (cyt)b.a(cyt1, "producer", null);
    }

    protected final mue a(Context context)
    {
        context = new mue(true);
        context.a().putLong("maximum_duration", b.b());
        return context;
    }

}
