// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class muq
    implements ood, opv
{

    List a;

    public muq(opd opd1)
    {
        a = new ArrayList();
        opd1.a(this);
    }

    public final boolean d()
    {
        for (int i = a.size() - 1; i >= 0; i--)
        {
            if (((mus)a.get(i)).r())
            {
                return true;
            }
        }

        return false;
    }
}
