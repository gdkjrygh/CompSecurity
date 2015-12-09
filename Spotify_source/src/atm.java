// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.Result;
import java.util.Hashtable;

public class atm extends ati
{

    public atm(ati ati1)
    {
        super(ati1);
    }

    public atm(String s)
    {
        super(s, "response");
    }

    public atm(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final Integer c()
    {
        return (Integer)c.get("correlationID");
    }

    public final Boolean d()
    {
        return (Boolean)b.get("success");
    }

    public final Result e()
    {
        Object obj = b.get("resultCode");
        if (obj instanceof Result)
        {
            return (Result)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = Result.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".resultCode").toString(), exception);
                return null;
            }
            return ((Result) (obj));
        } else
        {
            return null;
        }
    }

    public final String f()
    {
        return (String)b.get("info");
    }
}
