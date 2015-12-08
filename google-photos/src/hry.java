// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class hry
    implements mti, omb, opv
{

    public mtj a;
    public mmr b;
    public muz c;
    public hso d;
    private mmv e;

    public hry(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (mmr)olm1.a(mmr);
        e = (mmv)olm1.a(mmv);
        c = (muz)olm1.a(muz);
        a = ((mtj)olm1.a(mtj)).a(this);
        d = (hso)olm1.a(hso);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if ("ResyncSuggestions".equals(s) && mue1 != null && !mue1.c() && b.e())
        {
            e.b(b.d()).b("last_suggestions_sync_time", c.a()).d();
        }
    }
}
