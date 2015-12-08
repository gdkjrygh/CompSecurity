// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class oml
    implements olv, omb, ops, opv
{

    private opd a;
    private Set b;
    private final Class c;
    private omk d;

    public oml(opd opd1, Class class1)
    {
        b = new HashSet();
        a = opd1;
        c = class1;
        opd1.a(this);
    }

    public abstract omk a(Context context);

    public final void a(Context context, Class class1, olm olm1)
    {
        this;
        JVM INSTR monitorenter ;
        Class class2 = c;
        if (class1 != class2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (d == null)
        {
            d = a(context);
        }
        context = class1.getName();
        class1 = d.a(class1);
        if (class1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        b.add(context);
        context = class1.iterator();
        while (context.hasNext()) 
        {
            a((omj)context.next(), a, olm1);
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        if (bundle != null)
        {
            context = bundle.getStringArray("extra_auto_bound_objects");
            int j = context.length;
            int i = 0;
            while (i < j) 
            {
                bundle = context[i];
                try
                {
                    olm1.a(Class.forName(bundle));
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.e("BaseAutoBinderModule", "Autobound class not found upon reconstruction", bundle);
                }
                i++;
            }
        }
    }

    public abstract void a(omj omj1, opd opd1, olm olm1);

    public final void e(Bundle bundle)
    {
        bundle.putStringArray("extra_auto_bound_objects", (String[])b.toArray(new String[b.size()]));
    }
}
