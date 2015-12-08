// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.os.Message;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.c:
//            o, ac, ah, ad

class ae
    implements o
{

    final ac a;

    private ae(ac ac1)
    {
        a = ac1;
        super();
    }

    ae(ac ac1, ad ad)
    {
        this(ac1);
    }

    public void a()
    {
        Message message = ac.a(a).obtainMessage(4);
        ac.a(a).sendMessage(message);
    }

    public void a(JSONObject jsonobject)
    {
        Message message = ac.a(a).obtainMessage(2);
        message.obj = jsonobject;
        ac.a(a).sendMessage(message);
    }

    public void b()
    {
        Message message = ac.a(a).obtainMessage(10);
        ac.a(a).sendMessage(message);
    }

    public void b(JSONObject jsonobject)
    {
        Message message = ac.a(a).obtainMessage(3);
        message.obj = jsonobject;
        ac.a(a).sendMessage(message);
    }

    public void c(JSONObject jsonobject)
    {
        Message message = ac.a(a).obtainMessage(8);
        message.obj = jsonobject;
        ac.a(a).sendMessage(message);
    }
}
