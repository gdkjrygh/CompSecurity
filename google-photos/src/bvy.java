// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

public class bvy extends mtf
{

    private static final String b = bvy.getSimpleName();
    public cst a;
    private final csz c;

    public bvy(String s, csz csz1)
    {
        String s1 = b;
        super((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("|").append(s).toString());
        c = (csz)b.a(csz1, "factory", null);
    }

    protected final mue a(Context context)
    {
        context = c;
        a = cst.a(((csz) (context)).a, ((csz) (context)).b, ((csz) (context)).c, ((csz) (context)).d, ((csz) (context)).e, Locale.getDefault(), ((csz) (context)).f);
        return new mue(true);
    }

}
