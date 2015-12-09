// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.maps.model.internal.s;

// Referenced classes of package com.google.android.gms.maps.model:
//            e

public final class d
{

    private final s a;

    public d(s s1)
    {
        a = (s)ap.a(s1);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof d))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((d)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new e(((RemoteException) (obj)));
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
            throw new e(remoteexception);
        }
        return i;
    }
}
