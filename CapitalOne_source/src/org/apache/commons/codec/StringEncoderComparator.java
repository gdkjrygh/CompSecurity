// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec;

import java.util.Comparator;

// Referenced classes of package org.apache.commons.codec:
//            EncoderException, StringEncoder

public class StringEncoderComparator
    implements Comparator
{

    private final StringEncoder stringEncoder;

    public StringEncoderComparator()
    {
        stringEncoder = null;
    }

    public StringEncoderComparator(StringEncoder stringencoder)
    {
        stringEncoder = stringencoder;
    }

    public int compare(Object obj, Object obj1)
    {
        int i;
        try
        {
            i = ((Comparable)stringEncoder.encode(obj)).compareTo((Comparable)stringEncoder.encode(obj1));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        return i;
    }
}
