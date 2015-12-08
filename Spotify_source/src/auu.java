// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.ImageType;
import java.util.Hashtable;

public final class auu extends atn
{

    public auu()
    {
    }

    public auu(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final void a(ImageType imagetype)
    {
        if (imagetype != null)
        {
            e.put("imageType", imagetype);
            return;
        } else
        {
            e.remove("imageType");
            return;
        }
    }

    public final void a(String s)
    {
        if (s != null)
        {
            e.put("value", s);
            return;
        } else
        {
            e.remove("value");
            return;
        }
    }
}
