// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;

final class ecd
    implements nrc
{

    private final Context a;
    private final noz b;
    private final noz c;

    ecd(Context context)
    {
        a = context;
        c = noz.a(context, 3, "PerformDeltaSyncProcess", new String[] {
            "sync"
        });
        b = noz.a(context, 5, "PerformDeltaSyncProcess", new String[0]);
    }

    private void a(int i)
    {
        if (c.a())
        {
            noy.a(i);
        }
        try
        {
            ((gcc)olm.a(a, gcc)).a(i, get.b);
            return;
        }
        catch (IOException ioexception)
        {
            noy.a(i);
        }
    }

    public final int a(int i, nqs nqs)
    {
        a(i);
        return nrd.b;
    }

    public final int a(int i, oyc oyc1)
    {
        if (oyc1.c != null && oyc1.c.d != null)
        {
            oyc1 = (ozs)oyc1.c.d.a(ozs.a);
            if (oyc1 != null && ((ozs) (oyc1)).c != null && ((ozs) (oyc1)).c.a != null && ((ozs) (oyc1)).c.a.booleanValue())
            {
                a(i);
            }
        }
        return nrd.b;
    }

    public final void a(int i, cn cn)
    {
    }
}
