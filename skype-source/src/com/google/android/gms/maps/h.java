// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.a.j;
import com.google.android.gms.maps.model.c;

public final class h
{

    private final j a;

    h(j j1)
    {
        a = j1;
    }

    public final void a()
    {
        try
        {
            a.c(false);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }

    public final void b()
    {
        try
        {
            a.j(false);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }
}
