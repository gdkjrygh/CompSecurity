// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;


// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Matcher, ArrayTransform, CharacterArrayTransform, StringArrayTransform, 
//            Transform

class ArrayMatcher
    implements Matcher
{

    private final Matcher primary;

    public ArrayMatcher(Matcher matcher)
    {
        primary = matcher;
    }

    private Transform matchArray(Class class1)
        throws Exception
    {
        Transform transform = primary.match(class1);
        if (transform == null)
        {
            return null;
        } else
        {
            return new ArrayTransform(transform, class1);
        }
    }

    public Transform match(Class class1)
        throws Exception
    {
        class1 = class1.getComponentType();
        if (class1 == Character.TYPE)
        {
            return new CharacterArrayTransform(class1);
        }
        if (class1 == java/lang/Character)
        {
            return new CharacterArrayTransform(class1);
        }
        if (class1 == java/lang/String)
        {
            return new StringArrayTransform();
        } else
        {
            return matchArray(class1);
        }
    }
}
