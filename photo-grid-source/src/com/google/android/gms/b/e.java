// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.bl;

// Referenced classes of package com.google.android.gms.b:
//            f

public abstract class e
{

    private final String a;
    private Object b;

    protected e(String s)
    {
        a = s;
    }

    protected final Object a(Context context)
    {
        if (b == null)
        {
            bl.a(context);
            context = GooglePlayServicesUtil.getRemoteContext(context);
            if (context == null)
            {
                throw new f("Could not get remote context.");
            }
            context = context.getClassLoader();
            try
            {
                b = a((IBinder)context.loadClass(a).newInstance());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new f("Could not load creator class.", context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new f("Could not instantiate creator.", context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new f("Could not access creator.", context);
            }
        }
        return b;
    }

    protected abstract Object a(IBinder ibinder);
}
