// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONObject;

final class ang.Object
    implements Runnable
{

    private String a;
    private JSONObject b;
    private cad c;

    public final void run()
    {
        c.a.b(a, b);
    }

    (cad cad1, String s, JSONObject jsonobject)
    {
        c = cad1;
        a = s;
        b = jsonobject;
        super();
    }
}
