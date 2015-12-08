// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bk;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import p.bd.c;
import p.bd.h;

class d extends c
{

    private d()
    {
        super("");
    }

    public d(c c1)
    {
        super(c1);
    }

    public d(h h1)
    {
        super(h1);
    }

    private void a(String s, Object obj, StringBuilder stringbuilder)
    {
        if (obj instanceof Hashtable)
        {
            stringbuilder.append("[");
            a((Hashtable)obj, stringbuilder);
            stringbuilder.append("]");
            return;
        }
        if (obj instanceof h)
        {
            stringbuilder.append("[");
            (new d((h)obj)).a(stringbuilder);
            stringbuilder.append("]");
            return;
        }
        if (obj instanceof Vector)
        {
            stringbuilder.append("[");
            obj = (Vector)obj;
            for (int i = 0; i < ((Vector) (obj)).size(); i++)
            {
                if (i > 0)
                {
                    stringbuilder.append(", ");
                }
                a(s, ((Vector) (obj)).elementAt(i), stringbuilder);
            }

            stringbuilder.append("]");
            return;
        } else
        {
            stringbuilder.append((new StringBuilder()).append("\"").append(s).append("\" = \"").append(obj.toString()).append("\"").toString());
            return;
        }
    }

    private void a(Hashtable hashtable, StringBuilder stringbuilder)
    {
        Iterator iterator = hashtable.keySet().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            Object obj = hashtable.get(s);
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            a(s, obj, stringbuilder);
        }
    }

    public void a(StringBuilder stringbuilder)
    {
        stringbuilder.append("[");
        a(b, stringbuilder);
        stringbuilder.append("]");
    }

    public String c()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append(a()).append(" ").append(b()).toString());
        a(stringbuilder);
        return stringbuilder.toString();
    }
}
