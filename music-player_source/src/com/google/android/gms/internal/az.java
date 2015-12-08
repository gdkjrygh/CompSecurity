// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.a.a.b;
import com.google.a.a.h;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ek, bj, bd

public final class az extends bb
{

    private Map a;

    public az()
    {
    }

    private bd b(String s)
    {
        Object obj;
        try
        {
            obj = Class.forName(s, false, com/google/android/gms/internal/az.getClassLoader());
            if (!com/google/a/a/b.isAssignableFrom(((Class) (obj))))
            {
                ek.d((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(".").toString());
                throw new RemoteException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ek.d((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(". ").append(((Throwable) (obj)).getMessage()).toString());
            throw new RemoteException();
        }
        obj = (b)((Class) (obj)).newInstance();
        obj = new bj(((b) (obj)), (h)a.get(((b) (obj)).b()));
        return ((bd) (obj));
    }

    public final bd a(String s)
    {
        return b(s);
    }

    public final void a(Map map)
    {
        a = map;
    }
}
