// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class mjh
    implements atm
{

    private final mjd a;
    private final mjc b;

    mjh(Context context, mjc mjc, mjk mjk, mjm mjm)
    {
        b = mjc;
        a = new mjd(context, mjk, mjm);
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = (ata)obj;
        return new atn(((ane) (obj)), new mjg(a, b, ((ata) (obj))));
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
