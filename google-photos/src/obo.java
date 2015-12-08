// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class obo
{

    public static final String a = obl.getName();
    public static final String b = obm.getName();
    private static obn c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new obn();
        }
        olm1.a(obl, new obl(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new obn();
        }
        olm1.a(obm, new obm());
    }

}
