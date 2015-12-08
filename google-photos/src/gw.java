// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.util.Log;

final class gw extends gt
{

    private gg a;

    public gw(gg gg1)
    {
        a = gg1;
    }

    public final void a()
    {
        try
        {
            a.g();
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("MediaControllerCompat", (new StringBuilder("Dead object in play. ")).append(remoteexception).toString());
        }
    }

    public final void b()
    {
        try
        {
            a.h();
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("MediaControllerCompat", (new StringBuilder("Dead object in pause. ")).append(remoteexception).toString());
        }
    }
}
