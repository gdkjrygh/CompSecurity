// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class 
    implements cdi
{

    public final void a(ckw ckw1, Map map)
    {
        cax cax = cbb.Q;
        if (!((Boolean)bkv.n().a(cax)).booleanValue())
        {
            return;
        }
        boolean flag;
        if (!Boolean.parseBoolean((String)map.get("disabled")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ckw1.c(flag);
    }

    ()
    {
    }
}
