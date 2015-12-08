// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.lang.reflect.Array;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform

class CharacterArrayTransform
    implements Transform
{

    private final Class entry;

    public CharacterArrayTransform(Class class1)
    {
        entry = class1;
    }

    private Object read(char ac[], int i)
        throws Exception
    {
        Object obj = Array.newInstance(entry, i);
        for (int j = 0; j < i; j++)
        {
            Array.set(obj, j, Character.valueOf(ac[j]));
        }

        return obj;
    }

    private String write(Object obj, int i)
        throws Exception
    {
        StringBuilder stringbuilder = new StringBuilder(i);
        for (int j = 0; j < i; j++)
        {
            Object obj1 = Array.get(obj, j);
            if (obj1 != null)
            {
                stringbuilder.append(obj1);
            }
        }

        return stringbuilder.toString();
    }

    public Object read(String s)
        throws Exception
    {
        s = s.toCharArray();
        int i = s.length;
        if (entry == Character.TYPE)
        {
            return s;
        } else
        {
            return read(((char []) (s)), i);
        }
    }

    public String write(Object obj)
        throws Exception
    {
        int i = Array.getLength(obj);
        if (entry == Character.TYPE)
        {
            return new String((char[])(char[])obj);
        } else
        {
            return write(obj, i);
        }
    }
}
