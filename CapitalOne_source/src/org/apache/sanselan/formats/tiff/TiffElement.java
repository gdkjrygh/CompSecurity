// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff;

import java.util.Comparator;

public abstract class TiffElement
{

    public static final Comparator f = new _cls1();
    public final int d;
    public final int e;

    public TiffElement(int i, int j)
    {
        d = i;
        e = j;
    }


    private class _cls1
        implements Comparator
    {

        public int compare(Object obj, Object obj1)
        {
            obj = (TiffElement)obj;
            obj1 = (TiffElement)obj1;
            return ((TiffElement) (obj)).d - ((TiffElement) (obj1)).d;
        }

        _cls1()
        {
        }
    }

}
