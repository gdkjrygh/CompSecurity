// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.math.BigInteger;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform

class BigIntegerTransform
    implements Transform
{

    BigIntegerTransform()
    {
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public BigInteger read(String s)
    {
        return new BigInteger(s);
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((BigInteger)obj);
    }

    public String write(BigInteger biginteger)
    {
        return biginteger.toString();
    }
}
