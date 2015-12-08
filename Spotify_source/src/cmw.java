// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;

public final class cmw
    implements bqx
{

    public final int a;
    public final bqu b;
    private cmv c;

    public cmw(cmv cmv1, int i, bqu bqu1)
    {
        c = cmv1;
        super();
        a = i;
        b = bqu1;
        bqu1.a(this);
    }

    public final void a(ConnectionResult connectionresult)
    {
        cmv.e(c).post(new cmx(c, a, connectionresult));
    }
}
