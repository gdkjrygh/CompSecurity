// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONObject;

final class ang.Object
    implements dmh
{

    private dyx a;

    public final void a(int i, Object obj)
    {
        obj = (JSONObject)obj;
        a.b = false;
        a.d = new dyv(((JSONObject) (obj)));
        a.c = true;
        a.a.a();
    }

    public final void a(Throwable throwable, String s)
    {
        a.b = false;
        a.d = null;
        a.c = false;
        a.a.b();
    }

    (dyx dyx1)
    {
        a = dyx1;
        super();
    }
}
