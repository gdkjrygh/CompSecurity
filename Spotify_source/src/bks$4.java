// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;

final class ang.Object
    implements Runnable
{

    private String a;
    private cit b;
    private bks c;

    public final void run()
    {
        try
        {
            ((ccw)c.c.v.get(a)).a((bhe)b.u);
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", remoteexception);
        }
    }

    (bks bks1, String s, cit cit1)
    {
        c = bks1;
        a = s;
        b = cit1;
        super();
    }
}
