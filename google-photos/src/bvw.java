// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public class bvw extends mtf
{

    private static final String a = bvw.getSimpleName();
    private final cst b;
    private final long c;
    private final cnx j;

    public bvw(String s, cst cst1, long l, cnx cnx1)
    {
        String s1 = a;
        super((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("|").append(s).toString());
        b = (cst)b.a(cst1, "musicLibrary", null);
        c = b.b(l, "endPointUs");
        j = (cnx)b.a(cnx1, "soundtrack", null);
    }

    protected final mue a(Context context)
    {
        int i = cst.a(j, c);
        context = b;
        cnx cnx1 = j;
        boolean flag;
        if (!TextUtils.isEmpty(cnx1.a.e.c))
        {
            flag = false;
        } else
        {
            flag = ((cst) (context)).a.a(cnx1.a.e.b, i);
        }
        return new mue(flag);
    }

}
