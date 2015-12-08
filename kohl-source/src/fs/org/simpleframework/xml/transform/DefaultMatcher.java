// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;


// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Matcher, PrimitiveMatcher, PackageMatcher, ArrayMatcher, 
//            Transform

class DefaultMatcher
    implements Matcher
{

    private Matcher array;
    private Matcher matcher;
    private Matcher primitive;
    private Matcher stock;

    public DefaultMatcher(Matcher matcher1)
    {
        primitive = new PrimitiveMatcher();
        stock = new PackageMatcher();
        array = new ArrayMatcher(this);
        matcher = matcher1;
    }

    private Transform matchType(Class class1)
        throws Exception
    {
        if (class1.isArray())
        {
            return array.match(class1);
        }
        if (class1.isPrimitive())
        {
            return primitive.match(class1);
        } else
        {
            return stock.match(class1);
        }
    }

    public Transform match(Class class1)
        throws Exception
    {
        Transform transform = matcher.match(class1);
        if (transform != null)
        {
            return transform;
        } else
        {
            return matchType(class1);
        }
    }
}
