// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;


// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Matcher, IntegerTransform, BooleanTransform, LongTransform, 
//            DoubleTransform, FloatTransform, ShortTransform, ByteTransform, 
//            CharacterTransform, Transform

class PrimitiveMatcher
    implements Matcher
{

    public PrimitiveMatcher()
    {
    }

    public Transform match(Class class1)
        throws Exception
    {
        if (class1 == Integer.TYPE)
        {
            return new IntegerTransform();
        }
        if (class1 == Boolean.TYPE)
        {
            return new BooleanTransform();
        }
        if (class1 == Long.TYPE)
        {
            return new LongTransform();
        }
        if (class1 == Double.TYPE)
        {
            return new DoubleTransform();
        }
        if (class1 == Float.TYPE)
        {
            return new FloatTransform();
        }
        if (class1 == Short.TYPE)
        {
            return new ShortTransform();
        }
        if (class1 == Byte.TYPE)
        {
            return new ByteTransform();
        }
        if (class1 == Character.TYPE)
        {
            return new CharacterTransform();
        } else
        {
            return null;
        }
    }
}
