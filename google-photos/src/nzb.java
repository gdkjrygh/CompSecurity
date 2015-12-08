// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class nzb extends nye
{

    private static final long serialVersionUID = 0xa6135beddde36db8L;
    public final int a;
    private final String b;

    public nzb(nyz nyz1, String s)
    {
        s = String.valueOf(nyz1.a());
        String s1 = String.valueOf(nyz1.c());
        super((new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(s1).length())).append(s).append(": ").append(s1).toString());
        b = nyz1.a();
        int i;
        if (nyz1.a != null && nyz1.a.a != null)
        {
            i = nyz1.a.a.intValue();
        } else
        {
            i = 0;
        }
        a = i;
    }

    public static boolean a(Exception exception, String s)
    {
        if (exception instanceof nzb)
        {
            return TextUtils.equals(((nzb)exception).b, s);
        }
        if (exception != null && (exception.getCause() instanceof nzb))
        {
            return TextUtils.equals(((nzb)exception.getCause()).b, s);
        } else
        {
            return false;
        }
    }
}
