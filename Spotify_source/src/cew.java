// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import java.util.Map;

public final class cew extends cey
{

    public Map a;

    public cew()
    {
    }

    private cfa c(String s)
    {
        try
        {
            Object obj = Class.forName(s, false, cew.getClassLoader());
            if (ayg.isAssignableFrom(((Class) (obj))))
            {
                obj = (ayg)((Class) (obj)).newInstance();
                a.get(((ayg) (obj)).a());
                return new cfv(((ayg) (obj)));
            }
            if (bkz.isAssignableFrom(((Class) (obj))))
            {
                return new cfq((bkz)((Class) (obj)).newInstance());
            } else
            {
                bka.e((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        }
        catch (Throwable throwable)
        {
            bka.e((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(". ").append(throwable.getMessage()).toString());
        }
        throw new RemoteException();
    }

    public final cfa a(String s)
    {
        return c(s);
    }

    public final boolean b(String s)
    {
        boolean flag;
        try
        {
            flag = blk.isAssignableFrom(Class.forName(s, false, cew.getClassLoader()));
        }
        catch (Throwable throwable)
        {
            bka.e((new StringBuilder("Could not load custom event implementation class: ")).append(s).append(", assuming old implementation.").toString());
            return false;
        }
        return flag;
    }
}
