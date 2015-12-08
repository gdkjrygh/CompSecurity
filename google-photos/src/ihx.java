// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class ihx
{

    public List a;
    public boolean b;
    public boolean c;
    public boolean d;

    public ihx()
    {
        b = true;
        c = false;
        d = false;
    }

    public final ihv a()
    {
        boolean flag;
        if (!a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "originalMedia must be non-empty");
        return new ihv(this);
    }
}
