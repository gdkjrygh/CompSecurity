// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.maps.model.a.f;

// Referenced classes of package com.google.android.gms.maps.model:
//            c

public final class b
{

    private final f a;

    public b(f f1)
    {
        a = (f)y.a(f1);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof b))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((b)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new c(((RemoteException) (obj)));
        }
        return flag;
    }

    public final int hashCode()
    {
        int i;
        try
        {
            i = a.k();
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
        return i;
    }
}
