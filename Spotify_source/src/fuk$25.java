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
            fxp = com.spotify.mobile.android.util.vent.Event.D;
        } else
        {
            fxp = com.spotify.mobile.android.util.vent.Event.E;
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
        for.b(fxp, ((String) (obj)), flag);
        dmz.a(ggc);
        fxp = c.b;
        if (!a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ggc.b(fxp, flag);
    }

    public ng.String(fuk fuk1, boolean flag, String s)
    {
        c = fuk1;
        a = flag;
        b = s;
        super();
    }
}
