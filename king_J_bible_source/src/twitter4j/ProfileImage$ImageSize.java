// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package twitter4j:
//            ProfileImage

public static class <init>
    implements Serializable
{

    private static final Map instances = new HashMap();
    private static final long serialVersionUID = 0x2eabdece0fdb075bL;
    private final String name;

    private static <init> getInstance(String s)
    {
        return (<init>)instances.get(s);
    }

    private Object readResolve()
        throws ObjectStreamException
    {
        return getInstance(name);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (name)obj;
            if (!name.equals(((name) (obj)).name))
            {
                return false;
            }
        }
        return true;
    }

    public String getName()
    {
        return name;
    }

    public int hashCode()
    {
        return name.hashCode();
    }

    public String toString()
    {
        return name;
    }


    private ()
    {
        throw new AssertionError();
    }

    private (String s)
    {
        name = s;
        instances.put(s, this);
    }

    instances(String s, instances instances1)
    {
        this(s);
    }
}
