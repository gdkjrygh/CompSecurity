// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gm, ge, gb, hw, 
//            gj

final class gd extends gm
{

    final gb a;

    gd(gb gb)
    {
        a = gb;
        super();
    }

    public final hw a()
    {
        return new ge(this);
    }

    final gj d()
    {
        return a;
    }

    public final Iterator iterator()
    {
        return a();
    }
}
