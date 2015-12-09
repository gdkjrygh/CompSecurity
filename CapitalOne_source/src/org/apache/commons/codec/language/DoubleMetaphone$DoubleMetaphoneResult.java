// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;


// Referenced classes of package org.apache.commons.codec.language:
//            DoubleMetaphone

public class maxLength
{

    private final StringBuilder alternate;
    private final int maxLength;
    private final StringBuilder primary;
    final DoubleMetaphone this$0;

    public void append(char c)
    {
        appendPrimary(c);
        appendAlternate(c);
    }

    public void append(char c, char c1)
    {
        appendPrimary(c);
        appendAlternate(c1);
    }

    public void append(String s)
    {
        appendPrimary(s);
        appendAlternate(s);
    }

    public void append(String s, String s1)
    {
        appendPrimary(s);
        appendAlternate(s1);
    }

    public void appendAlternate(char c)
    {
        if (alternate.length() < maxLength)
        {
            alternate.append(c);
        }
    }

    public void appendAlternate(String s)
    {
        int i = maxLength - alternate.length();
        if (s.length() <= i)
        {
            alternate.append(s);
            return;
        } else
        {
            alternate.append(s.substring(0, i));
            return;
        }
    }

    public void appendPrimary(char c)
    {
        if (primary.length() < maxLength)
        {
            primary.append(c);
        }
    }

    public void appendPrimary(String s)
    {
        int i = maxLength - primary.length();
        if (s.length() <= i)
        {
            primary.append(s);
            return;
        } else
        {
            primary.append(s.substring(0, i));
            return;
        }
    }

    public String getAlternate()
    {
        return alternate.toString();
    }

    public String getPrimary()
    {
        return primary.toString();
    }

    public boolean isComplete()
    {
        return primary.length() >= maxLength && alternate.length() >= maxLength;
    }

    public (int i)
    {
        this$0 = DoubleMetaphone.this;
        super();
        primary = new StringBuilder(getMaxCodeLen());
        alternate = new StringBuilder(getMaxCodeLen());
        maxLength = i;
    }
}
