// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fyi
    implements ngs
{

    private final noz a;
    private final noz b;
    private final Context c;
    private fyc d;

    fyi(Context context)
    {
        c = context;
        a = noz.a(context, 3, "AccountUpdate", new String[] {
            "sync"
        });
        b = noz.a(context, "AccountUpdate", new String[0]);
        d = (fyc)olm.a(context, fyc);
    }

    private boolean b(int i)
    {
label0:
        {
            Object obj = (mmv)olm.a(c, mmv);
            fyd fyd1;
            try
            {
                if (!((mmv) (obj)).a(i).c("logged_in"))
                {
                    break label0;
                }
                obj = d.b(i);
                fyd1 = fyd.c;
            }
            catch (mmy mmy1)
            {
                if (b.a())
                {
                    noy.a("accountId", Integer.valueOf(i));
                }
                return false;
            }
            if (obj == fyd1)
            {
                return true;
            }
        }
        return false;
    }

    public final void a(int i)
    {
        b.v();
        if (a.a())
        {
            noy.a(i);
        }
        if (b(i))
        {
            d.a(i);
        }
    }
}
