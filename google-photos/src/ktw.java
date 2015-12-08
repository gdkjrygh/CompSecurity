// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class ktw
    implements kuf
{

    ktw()
    {
    }

    public final void a(kxu kxu, Map map)
    {
        kxu = (String)map.get("tx");
        String s = (String)map.get("ty");
        map = (String)map.get("td");
        try
        {
            Integer.parseInt(kxu);
            Integer.parseInt(s);
            Integer.parseInt(map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kxu kxu)
        {
            b.m("Could not parse touch parameters from gmsg.");
        }
    }
}
