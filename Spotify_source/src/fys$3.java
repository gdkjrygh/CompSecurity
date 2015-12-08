// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class ang.String extends fyo
{

    public final Serializable b_(String s)
    {
        boolean flag;
        if ("running".equals(s) || "beta".equals("release"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    (String s, fzf fzf)
    {
        super(s, fzf);
    }
}
