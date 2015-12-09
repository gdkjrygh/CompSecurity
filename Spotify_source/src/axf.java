// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

final class axf extends ati
{

    private axf()
    {
        super("");
    }

    public axf(ati ati1)
    {
        super(ati1);
    }

    private axf(atn atn1)
    {
        super(atn1);
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
        if (obj instanceof atn)
        {
            stringbuilder.append("[");
            (new axf((atn)obj)).a(stringbuilder);
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
            stringbuilder.append((new StringBuilder("\"")).append(s).append("\" = \"").append(obj.toString()).append("\"").toString());
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

    final void a(StringBuilder stringbuilder)
    {
        stringbuilder.append("[");
        a(b, stringbuilder);
        stringbuilder.append("]");
    }
}
