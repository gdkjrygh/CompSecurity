// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class eli
{

    private final Map a = new HashMap();

    public eli()
    {
    }

    public final ejy a(Class class1)
    {
        ejy ejy1 = (ejy)a.get(class1);
        if (ejy1 == null)
        {
            class1 = String.valueOf(class1);
            throw new IllegalStateException((new StringBuilder(String.valueOf(class1).length() + 27)).append("Action not found for type: ").append(class1).toString());
        } else
        {
            return ejy1;
        }
    }

    public final eli a(Class class1, ejy ejy1)
    {
        if (a.put(class1, ejy1) != null)
        {
            throw new IllegalStateException("Cannot add two handlers for the same action class");
        } else
        {
            return this;
        }
    }
}
