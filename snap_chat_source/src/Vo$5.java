// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.addlive.service.Responder;

final class lang.Object
    implements Responder
{

    private String a;

    public final void errHandler(int i, String s)
    {
        String.format("Got an error processing AddLive request %s: %s (ERR: %d)", new Object[] {
            a, s, Integer.valueOf(i)
        });
    }

    public final void resultHandler(Object obj)
    {
        String.format("Got a successful result processing AddLive request %s", new Object[] {
            a
        });
    }

    >(String s)
    {
        a = s;
        super();
    }
}
