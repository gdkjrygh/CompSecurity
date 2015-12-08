// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.annotations;

import android.util.Log;
import com.leanplum.Var;
import com.leanplum.callbacks.VariableCallback;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class b extends VariableCallback
{

    private final WeakReference a;
    private final boolean b;
    private final Field c;
    private final Var d;

    b(WeakReference weakreference, boolean flag, Field field, Var var)
    {
        a = weakreference;
        b = flag;
        c = field;
        d = var;
        super();
    }

    public final void handle(Var var)
    {
        var = ((Var) (a.get()));
        if ((!b || var != null) && c != null) goto _L2; else goto _L1
_L1:
        d.removeFileReadyHandler(this);
_L4:
        return;
_L2:
        boolean flag = c.isAccessible();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        c.setAccessible(true);
        c.set(var, d.fileValue());
        if (!flag)
        {
            try
            {
                c.setAccessible(false);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Var var)
            {
                Log.e("Leanplum", (new StringBuilder("Invalid value ")).append((String)d.value()).append(" for field ").append(d.name()).toString(), var);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Var var)
            {
                Log.e("Leanplum", (new StringBuilder("Error setting value for field ")).append(d.name()).toString(), var);
            }
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
