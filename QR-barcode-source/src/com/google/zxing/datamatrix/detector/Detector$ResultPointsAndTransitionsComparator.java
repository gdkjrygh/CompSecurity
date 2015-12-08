// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.detector;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.zxing.datamatrix.detector:
//            Detector

private static final class <init>
    implements Comparator, Serializable
{

    public int compare(<init> <init>1, <init> <init>2)
    {
        return <init>1.ions() - <init>2.ions();
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((compare)obj, (compare)obj1);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
