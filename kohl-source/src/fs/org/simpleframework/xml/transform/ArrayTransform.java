// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.lang.reflect.Array;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform, StringArrayTransform

class ArrayTransform
    implements Transform
{

    private final Transform _flddelegate;
    private final Class entry;
    private final StringArrayTransform split = new StringArrayTransform();

    public ArrayTransform(Transform transform, Class class1)
    {
        _flddelegate = transform;
        entry = class1;
    }

    private Object read(String as[], int i)
        throws Exception
    {
        Object obj = Array.newInstance(entry, i);
        for (int j = 0; j < i; j++)
        {
            Object obj1 = _flddelegate.read(as[j]);
            if (obj1 != null)
            {
                Array.set(obj, j, obj1);
            }
        }

        return obj;
    }

    private String write(Object obj, int i)
        throws Exception
    {
        String as[] = new String[i];
        for (int j = 0; j < i; j++)
        {
            Object obj1 = Array.get(obj, j);
            if (obj1 != null)
            {
                as[j] = _flddelegate.write(obj1);
            }
        }

        return split.write(as);
    }

    public Object read(String s)
        throws Exception
    {
        s = split.read(s);
        return read(((String []) (s)), s.length);
    }

    public String write(Object obj)
        throws Exception
    {
        return write(obj, Array.getLength(obj));
    }
}
