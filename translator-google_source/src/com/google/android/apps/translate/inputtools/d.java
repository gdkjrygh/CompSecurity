// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputtools;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONTokener;

public final class d extends JSONTokener
{

    final List a = new ArrayList();

    public d(String s)
    {
        super(s);
    }

    public final Object nextValue()
    {
        Object obj1 = super.nextValue();
        if (obj1 != null && (obj1 instanceof String))
        {
            a.add((String)obj1);
        }
        Object obj = obj1;
        if (obj1 != null)
        {
            obj = obj1;
            if (obj1 instanceof Integer)
            {
                a.add(obj1.toString());
                obj = obj1.toString();
            }
        }
        return obj;
    }
}
