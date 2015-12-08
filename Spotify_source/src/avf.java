// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.KeyboardEvent;
import java.util.Hashtable;

public final class avf extends atj
{

    public avf()
    {
        super("OnKeyboardInput");
    }

    public avf(Hashtable hashtable)
    {
        super(hashtable);
    }

    private KeyboardEvent c()
    {
        Object obj = b.get("event");
        if (obj instanceof KeyboardEvent)
        {
            return (KeyboardEvent)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = KeyboardEvent.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".event").toString(), exception);
                return null;
            }
            return ((KeyboardEvent) (obj));
        } else
        {
            return null;
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(a()).append(":  data: ");
        Object obj = b.get("data");
        if (obj instanceof String)
        {
            obj = (String)obj;
        } else
        {
            obj = null;
        }
        return stringbuilder.append(((String) (obj))).append(" event:").append(c().toString()).toString();
    }
}
