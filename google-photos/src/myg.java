// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public abstract class myg
    implements myf
{

    public final Context a;
    private mmv b;

    public myg(Context context)
    {
        a = context;
        b = (mmv)olm.a(context, mmv);
    }

    private String a(int i)
    {
        return ((mmv)olm.a(a, mmv)).a(i).b("account_name");
    }

    public final boolean a(myc myc, int i)
    {
        return b.c(i) && a(myc, a(i));
    }

    public final boolean a(myc myc, String s)
    {
        return "true".equalsIgnoreCase(c(myc, s));
    }

    public final Long b(myc myc, int i)
    {
        if (b.c(i))
        {
            return b(myc, a(i));
        } else
        {
            return null;
        }
    }

    public final Long b(myc myc, String s)
    {
        long l;
        try
        {
            l = Long.parseLong(c(myc, s));
        }
        // Misplaced declaration of an exception variable
        catch (myc myc)
        {
            return null;
        }
        return Long.valueOf(l);
    }

    public abstract String c(myc myc, String s);
}
