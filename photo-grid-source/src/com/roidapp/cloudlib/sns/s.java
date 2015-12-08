// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            x, w

final class s extends x
{

    s(w w)
    {
        super(w);
    }

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        try
        {
            Thread.sleep(2000L);
        }
        catch (InterruptedException interruptedexception) { }
        super.a(obj);
    }
}
