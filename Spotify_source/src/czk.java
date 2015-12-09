// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;
import org.json.JSONObject;

final class czk
    implements cyw
{

    private czj a;

    private czk(czj czj1)
    {
        a = czj1;
        super();
    }

    czk(czj czj1, byte byte0)
    {
        this(czj1);
    }

    public final void a()
    {
        Message message = czj.a(a).obtainMessage(4);
        czj.a(a).sendMessage(message);
    }

    public final void a(JSONObject jsonobject)
    {
        Message message = czj.a(a).obtainMessage(2);
        message.obj = jsonobject;
        czj.a(a).sendMessage(message);
    }

    public final void b()
    {
        Message message = czj.a(a).obtainMessage(8);
        czj.a(a).sendMessage(message);
    }

    public final void b(JSONObject jsonobject)
    {
        Message message = czj.a(a).obtainMessage(3);
        message.obj = jsonobject;
        czj.a(a).sendMessage(message);
    }

    public final void c(JSONObject jsonobject)
    {
        Message message = czj.a(a).obtainMessage(10);
        message.obj = jsonobject;
        czj.a(a).sendMessage(message);
    }

    public final void d(JSONObject jsonobject)
    {
        Message message = czj.a(a).obtainMessage(6);
        message.obj = jsonobject;
        czj.a(a).sendMessage(message);
    }

    public final void e(JSONObject jsonobject)
    {
        Message message = czj.a(a).obtainMessage(11);
        message.obj = jsonobject;
        czj.a(a).sendMessage(message);
    }
}
