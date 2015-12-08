// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class kub
    implements kuf
{

    kub()
    {
    }

    public final void a(kxu kxu1, Map map)
    {
        map = kxu1.g();
        if (map != null)
        {
            map.a();
            return;
        }
        kxu1 = kxu1.h();
        if (kxu1 != null)
        {
            kxu1.a();
            return;
        } else
        {
            b.m("A GMSG tried to close something that wasn't an overlay.");
            return;
        }
    }
}
