// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import java.util.Map;

public final class aei extends aek
{

    private Map a;

    public aei()
    {
    }

    private aem c(String s)
    {
        try
        {
            Object obj = Class.forName(s, false, aei.getClassLoader());
            if (ju.isAssignableFrom(((Class) (obj))))
            {
                obj = (ju)((Class) (obj)).newInstance();
                return new aev(((ju) (obj)), (ka)a.get(((ju) (obj)).a()));
            }
            if (ov.isAssignableFrom(((Class) (obj))))
            {
                return new aet((ov)((Class) (obj)).newInstance());
            } else
            {
                of.e((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        }
        catch (Throwable throwable)
        {
            of.e((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(". ").append(throwable.getMessage()).toString());
        }
        throw new RemoteException();
    }

    public final aem a(String s)
    {
        return c(s);
    }

    public final void a(Map map)
    {
        a = map;
    }

    public final boolean b(String s)
    {
        boolean flag;
        try
        {
            flag = pa.isAssignableFrom(Class.forName(s, false, aei.getClassLoader()));
        }
        catch (Throwable throwable)
        {
            of.e((new StringBuilder("Could not load custom event implementation class: ")).append(s).append(", assuming old implementation.").toString());
            return false;
        }
        return flag;
    }
}
