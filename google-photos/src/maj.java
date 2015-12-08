// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

final class maj
    implements lzh
{

    private final ConnectionResult a;

    public maj(ConnectionResult connectionresult)
    {
        if (connectionresult == null)
        {
            throw new IllegalArgumentException("null connectionResult");
        } else
        {
            a = connectionresult;
            return;
        }
    }

    public final int a()
    {
        return a.c;
    }

    public final String toString()
    {
        return a.toString();
    }
}
