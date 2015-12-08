// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

public final class lhj
{

    final lhq a;
    boolean b;
    Map c;
    Map d;
    private final Context e;

    public lhj(Context context, lhq lhq1)
    {
        b = false;
        c = new HashMap();
        d = new HashMap();
        e = context;
        a = lhq1;
    }

    public final Location a()
    {
        a.a();
        Location location;
        try
        {
            location = ((lhd)a.b()).b(e.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }
}
