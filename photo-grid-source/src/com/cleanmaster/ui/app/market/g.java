// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import com.cleanmaster.util.p;
import java.io.IOException;
import org.json.JSONObject;

final class g extends Thread
{

    final JSONObject a;

    g(JSONObject jsonobject)
    {
        a = jsonobject;
        super();
    }

    public final void run()
    {
        try
        {
            p.a(a.optString("url", ""));
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }
}
