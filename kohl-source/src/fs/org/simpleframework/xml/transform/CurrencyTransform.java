// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.util.Currency;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform

class CurrencyTransform
    implements Transform
{

    CurrencyTransform()
    {
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public Currency read(String s)
    {
        return Currency.getInstance(s);
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((Currency)obj);
    }

    public String write(Currency currency)
    {
        return currency.toString();
    }
}
