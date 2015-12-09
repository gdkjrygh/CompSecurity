// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.SoftButtonType;
import java.util.Hashtable;

public final class awi extends atn
{

    public awi()
    {
    }

    public final auu a()
    {
        Object obj;
        obj = e.get("image");
        if (obj instanceof auu)
        {
            return (auu)obj;
        }
        if (!(obj instanceof Hashtable))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj = new auu((Hashtable)obj);
        return ((auu) (obj));
        Exception exception;
        exception;
        axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".image").toString(), exception);
        return null;
    }

    public final void a(auu auu1)
    {
        if (auu1 != null)
        {
            e.put("image", auu1);
            return;
        } else
        {
            e.remove("image");
            return;
        }
    }

    public final void a(SoftButtonType softbuttontype)
    {
        if (softbuttontype != null)
        {
            e.put("type", softbuttontype);
            return;
        } else
        {
            e.remove("type");
            return;
        }
    }

    public final void a(Integer integer)
    {
        if (integer != null)
        {
            e.put("softButtonID", integer);
            return;
        } else
        {
            e.remove("softButtonID");
            return;
        }
    }

    public final void a(String s)
    {
        if (s != null)
        {
            e.put("text", s);
            return;
        } else
        {
            e.remove("text");
            return;
        }
    }
}
