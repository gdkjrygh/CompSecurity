// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.DisplayType;
import java.util.Hashtable;

public final class auo extends atn
{

    public auo()
    {
    }

    public auo(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final DisplayType a()
    {
        Object obj = e.get("displayType");
        if (obj instanceof DisplayType)
        {
            return (DisplayType)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = DisplayType.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".displayType").toString(), exception);
                return null;
            }
            return ((DisplayType) (obj));
        } else
        {
            return null;
        }
    }
}
