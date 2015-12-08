// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.util.ArrayList;

class Stack extends ArrayList
{

    public Stack(int i)
    {
        super(i);
    }

    public Object pop()
    {
        int i = size();
        if (i <= 0)
        {
            return null;
        } else
        {
            return remove(i - 1);
        }
    }

    public Object push(Object obj)
    {
        add(obj);
        return obj;
    }

    public Object top()
    {
        int i = size();
        if (i <= 0)
        {
            return null;
        } else
        {
            return get(i - 1);
        }
    }
}
