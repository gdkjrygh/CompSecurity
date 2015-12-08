// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.TriggerSource;
import java.util.Hashtable;

public final class avb extends atj
{

    public avb()
    {
        super("OnCommand");
    }

    public avb(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final Integer c()
    {
        return (Integer)b.get("cmdID");
    }

    public final TriggerSource d()
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
