// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class bvx extends mtf
{

    private static final String a = bvx.getSimpleName();
    private final cst b;
    private final cqa c;

    public bvx(String s, cst cst1, cqa cqa1)
    {
        String s1 = a;
        super((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("|").append(s).toString());
        b = (cst)b.a(cst1, "musicLibrary", null);
        c = (cqa)b.a(cqa1, "soundtrack", null);
    }

    protected final mue a(Context context)
    {
        context = new mue(true);
        context.a().putParcelable("detailed_soundtrack", b.b(c));
        return context;
    }

}
