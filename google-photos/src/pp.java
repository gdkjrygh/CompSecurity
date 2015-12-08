// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class pp
    implements pt
{

    private pm a;

    pp(po po, pm pm1)
    {
        a = pm1;
        super();
    }

    public final Object a(int i)
    {
        pa pa1 = a.a(i);
        if (pa1 == null)
        {
            return null;
        } else
        {
            return pa1.b;
        }
    }

    public final List a(String s, int i)
    {
        pm.a();
        new ArrayList();
        throw new NullPointerException();
    }

    public final boolean a(int i, int j, Bundle bundle)
    {
        return a.a(i, j, bundle);
    }
}
