// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public abstract class bpl
{

    protected final bpy b;
    public final String c;
    public bqa d;

    protected bpl(String s, String s1)
    {
        Object obj = null;
        super();
        bpp.a(s);
        c = s;
        b = new bpy(s1, (byte)0);
        if (!TextUtils.isEmpty(null))
        {
            s1 = b;
            if (TextUtils.isEmpty(null))
            {
                s = obj;
            } else
            {
                s = String.format("[%s] ", new Object[] {
                    null
                });
            }
            s1.b = s;
        }
    }

    public void a()
    {
    }

    public void a(String s)
    {
    }

    protected final void a(String s, long l)
    {
        d.a(c, s, l);
    }

    protected final long b()
    {
        return d.a();
    }
}
