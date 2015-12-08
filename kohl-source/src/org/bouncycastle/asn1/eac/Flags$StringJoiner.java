// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;


// Referenced classes of package org.bouncycastle.asn1.eac:
//            Flags

private class mSeparator
{

    boolean First;
    StringBuffer b;
    String mSeparator;
    final Flags this$0;

    public void add(String s)
    {
        if (First)
        {
            First = false;
        } else
        {
            b.append(mSeparator);
        }
        b.append(s);
    }

    public String toString()
    {
        return b.toString();
    }

    public (String s)
    {
        this$0 = Flags.this;
        super();
        First = true;
        b = new StringBuffer();
        mSeparator = s;
    }
}
