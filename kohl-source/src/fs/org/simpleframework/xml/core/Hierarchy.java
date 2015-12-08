// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.LinkedList;

class Hierarchy extends LinkedList
{

    public Hierarchy(Class class1)
    {
        scan(class1);
    }

    private void scan(Class class1)
    {
        for (; class1 != null; class1 = class1.getSuperclass())
        {
            addFirst(class1);
        }

        remove(java/lang/Object);
    }
}
