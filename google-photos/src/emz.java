// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class emz
    implements atm
{

    static final long a;
    private final mfr b;
    private final noz c;

    public emz(Context context)
    {
        b = (mfr)olm.a(context, mfr);
        c = noz.a(context, "CoverPhotoLoader", new String[0]);
    }

    static mfr a(emz emz1)
    {
        return emz1.b;
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = (ene)obj;
        return new atn(((ane) (obj)), new ena(this, ((ene) (obj)), c));
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(3L);
    }
}
