// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import java.io.File;
import java.util.Comparator;

final class 
    implements Comparator
{

    public int compare(Object obj, Object obj1)
    {
        return Long.valueOf(((File)obj).lastModified()).compareTo(Long.valueOf(((File)obj1).lastModified()));
    }

    ()
    {
    }
}
