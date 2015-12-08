// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.math.BigDecimal;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform

class BigDecimalTransform
    implements Transform
{

    BigDecimalTransform()
    {
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public BigDecimal read(String s)
    {
        return new BigDecimal(s);
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((BigDecimal)obj);
    }

    public String write(BigDecimal bigdecimal)
    {
        return bigdecimal.toString();
    }
}
