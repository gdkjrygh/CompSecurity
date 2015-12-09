// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.DriverDistractionState;
import java.util.Hashtable;

public final class avc extends atj
{

    public avc()
    {
        super("OnDriverDistraction");
    }

    public avc(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final DriverDistractionState c()
    {
        Object obj = b.get("state");
        if (obj instanceof DriverDistractionState)
        {
            return (DriverDistractionState)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = DriverDistractionState.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".state").toString(), exception);
                return null;
            }
            return ((DriverDistractionState) (obj));
        } else
        {
            return null;
        }
    }
}
