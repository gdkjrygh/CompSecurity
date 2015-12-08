// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.basictlv;

import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.wallet.hce.basictlv:
//            BasicTlv, BasicTlvInvalidTagException, BasicTlvInvalidLengthException

public final class BasicConstructedTlv extends BasicTlv
{

    private final Collection mChildren = new ArrayList();

    private BasicConstructedTlv(int i)
        throws BasicTlvInvalidTagException, BasicTlvInvalidLengthException
    {
        super(i);
        if (!tagIsConstructed(i))
        {
            throw new BasicTlvInvalidTagException(i);
        } else
        {
            return;
        }
    }

    public static BasicConstructedTlv getInstance(int i)
        throws BasicTlvInvalidTagException, BasicTlvInvalidLengthException
    {
        return new BasicConstructedTlv(i);
    }

    public final BasicConstructedTlv addAll(Collection collection)
    {
        mChildren.addAll(collection);
        return this;
    }

    protected final int encodeValue(byte abyte0[], int i)
        throws BasicTlvInvalidTagException, BasicTlvInvalidLengthException
    {
        for (Iterator iterator = mChildren.iterator(); iterator.hasNext();)
        {
            i = ((BasicTlv)iterator.next()).encode(abyte0, i);
        }

        return i;
    }

    public final int getLength()
    {
        int i = 0;
        for (Iterator iterator = mChildren.iterator(); iterator.hasNext();)
        {
            i += ((BasicTlv)iterator.next()).getSize();
        }

        return i;
    }

    public final String toString()
    {
        Object obj = Joiner.on(",");
        String s = getTagAsString();
        String s1 = Integer.toHexString(getLength());
        String s2 = String.valueOf(Joiner.on(",").join(mChildren));
        obj = String.valueOf(((Joiner) (obj)).join(new String[] {
            s, s1, (new StringBuilder(String.valueOf(s2).length() + 2)).append("[").append(s2).append("]").toString()
        }).toUpperCase());
        return (new StringBuilder(String.valueOf(obj).length() + 2)).append("(").append(((String) (obj))).append(")").toString();
    }
}
