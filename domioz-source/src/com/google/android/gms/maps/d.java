// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.maps.internal.ak;
import com.google.android.gms.maps.internal.ct;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.e;

// Referenced classes of package com.google.android.gms.maps:
//            b

public final class d
{

    public static int a(Context context)
    {
        ap.a(context);
        try
        {
            context = ct.a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((c) (context)).a;
        }
        try
        {
            b.a(context.a());
            b.a(context.b());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new e(context);
        }
        return 0;
    }
}
