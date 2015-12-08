// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class jwg
{

    public final jwx b;
    public final String c;
    public ds d;

    protected jwg(String s, String s1, String s2)
    {
        jwo.a(s);
        c = s;
        b = new jwx(s1);
        if (!TextUtils.isEmpty(s2))
        {
            s1 = b;
            if (TextUtils.isEmpty(s2))
            {
                s = null;
            } else
            {
                s = String.format("[%s] ", new Object[] {
                    s2
                });
            }
            s1.a = s;
        }
    }

    public void a(String s)
    {
    }

    public void b()
    {
    }
}
