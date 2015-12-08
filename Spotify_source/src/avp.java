// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.TriggerSource;
import java.util.Hashtable;

public final class avp extends atm
{

    public avp()
    {
        super("PerformInteraction");
    }

    public avp(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final Integer h()
    {
        return (Integer)b.get("choiceID");
    }

    public final TriggerSource i()
    {
        Object obj = b.get("triggerSource");
        if (obj instanceof TriggerSource)
        {
            return (TriggerSource)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = TriggerSource.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".triggerSource").toString(), exception);
                return null;
            }
            return ((TriggerSource) (obj));
        } else
        {
            return null;
        }
    }
}
