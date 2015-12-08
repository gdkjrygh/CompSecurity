// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;

public final class iqw
    implements mmt, nac, opv
{

    private final String a;
    private final String b;
    private final Context c;
    private mzz d;
    private nfw e;
    private int f;

    public iqw(Context context, String s, String s1)
    {
        c = context;
        a = s;
        b = s1;
    }

    public final void a()
    {
        e.a((new ngg()).a(ngl, null));
    }

    public final void a(Activity activity, opd opd1, mzz mzz1, nfw nfw1)
    {
        d = mzz1;
        e = nfw1.b(this);
        opd1.a(this);
    }

    public final void a(boolean flag, mms mms, mms mms1, int i, int j)
    {
        f = j;
        if (j != -1)
        {
            mms = d;
            mms1 = a;
            mms1 = new iup(c, mms1, f);
            mms1.a = b;
            mms.a(mms1.a());
            return;
        } else
        {
            d.a(0);
            return;
        }
    }
}
