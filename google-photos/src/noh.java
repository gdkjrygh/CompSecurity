// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class noh
{

    public noh()
    {
    }

    public static noe a(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            return noe.a;
        }
        context = (noe)Class.forName("com.google.android.apps.moviemaker.app.DefaultConnector").getConstructor(new Class[] {
            android/content/Context
        }).newInstance(new Object[] {
            context
        });
        return context;
        context;
_L2:
        context = String.valueOf(context.getMessage());
        if (context.length() != 0)
        {
            context = "Problem creating connector: ".concat(context);
        } else
        {
            context = new String("Problem creating connector: ");
        }
        Log.e("MovieMakerModule", context);
        return noe.a;
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
