// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ng.Object
    implements fxo
{

    private boolean a;
    private String b;
    private fuk c;

    public final void a(fxp fxp)
    {
        boolean flag1 = true;
        Object obj = c;
        boolean flag;
        if (a)
        {
            fxp = com.spotify.mobile.android.util.vent.Event.m;
        } else
        {
            fxp = com.spotify.mobile.android.util.vent.Event.i;
        }
        fuk.a(((fuk) (obj)), fxp);
        dmz.a(for);
        fxp = c.b;
        obj = b;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for.a(fxp, ((String) (obj)), flag);
        fxp = (ggc)dmz.a(ggc);
        obj = c.b;
        if (!a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        fxp.a(((android.content.Context) (obj)), flag);
    }

    public ng.String(fuk fuk1, boolean flag, String s)
    {
        c = fuk1;
        a = flag;
        b = s;
        super();
    }
}
