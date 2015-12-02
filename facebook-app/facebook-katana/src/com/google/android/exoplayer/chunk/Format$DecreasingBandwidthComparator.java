// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import java.util.Comparator;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            Format

public final class 
    implements Comparator
{

    private static int a(Format format, Format format1)
    {
        return format1.c - format.c;
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((Format)obj, (Format)obj1);
    }

    public ()
    {
    }
}
