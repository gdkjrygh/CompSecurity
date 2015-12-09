// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.ButtonName;
import java.util.Hashtable;

public final class ava extends atj
{

    public ava()
    {
        super("OnButtonPress");
    }

    public ava(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final ButtonName c()
    {
        Object obj = b.get("buttonName");
        if (obj instanceof ButtonName)
        {
            return (ButtonName)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = ButtonName.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".buttonName").toString(), exception);
                return null;
            }
            return ((ButtonName) (obj));
        } else
        {
            return null;
        }
    }

    public final Integer d()
    {
        return (Integer)b.get("customButtonID");
    }
}
