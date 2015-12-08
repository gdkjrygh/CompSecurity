// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.util.ArrayList;

public abstract class a
    implements Cloneable
{

    ArrayList a;

    public a()
    {
        a = null;
    }

    public void a()
    {
    }

    public a b()
    {
        Object obj;
        ArrayList arraylist;
        int j;
        obj = (a)super.clone();
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        arraylist = a;
        obj.a = new ArrayList();
        j = arraylist.size();
        int i = 0;
        while (i < j) 
        {
            try
            {
                ((a) (obj)).a.add(arraylist.get(i));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new AssertionError();
            }
            i++;
        }
        return ((a) (obj));
    }

    public Object clone()
    {
        return b();
    }
}
