// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class ktx
    implements kuf
{

    ktx()
    {
    }

    public final void a(kxu kxu1, Map map)
    {
        ktd ktd = ktk.l;
        if (!((Boolean)jqc.i().a(ktd)).booleanValue())
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
        kxu1.c(flag);
    }
}
