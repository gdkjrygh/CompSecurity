// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.AppInterfaceUnregisteredReason;
import java.util.Hashtable;

public final class aux extends atj
{

    public aux()
    {
        super("OnAppInterfaceUnregistered");
    }

    public aux(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final AppInterfaceUnregisteredReason c()
    {
        Object obj = b.get("reason");
        if (obj instanceof AppInterfaceUnregisteredReason)
        {
            return (AppInterfaceUnregisteredReason)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = AppInterfaceUnregisteredReason.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".reason").toString(), exception);
                return null;
            }
            return ((AppInterfaceUnregisteredReason) (obj));
        } else
        {
            return null;
        }
    }
}
