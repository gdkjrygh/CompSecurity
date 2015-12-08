// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class olu
{

    private final HashMap a = new HashMap();

    public olu(Context context, Class class1)
    {
        for (context = olm.c(context, class1).iterator(); context.hasNext();)
        {
            class1 = (olt)context.next();
            Object obj = class1.a();
            if (obj == null)
            {
                throw new IllegalArgumentException("Extension key must not be null");
            }
            if (a.put(obj, class1) != null)
            {
                throw new IllegalArgumentException("Instantiating multiple extensions with the same key");
            }
        }

    }

    public final ArrayList a()
    {
        return new ArrayList(a.keySet());
    }

    public final olt a(Object obj)
    {
        return (olt)a.get(obj);
    }
}
