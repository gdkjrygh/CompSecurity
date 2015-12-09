// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.io.File;
import java.util.Comparator;

final class Y
    implements Comparator
{

    Y()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        return (new Long(((File)obj).lastModified())).compareTo(new Long(((File)obj1).lastModified()));
    }
}
