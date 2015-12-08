// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import java.io.File;
import java.util.Comparator;

final class ah
    implements Comparator
{

    ah()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        return ((File)obj1).getName().compareTo(((File) (obj)).getName());
    }
}
