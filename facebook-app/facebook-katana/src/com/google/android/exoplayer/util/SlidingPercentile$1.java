// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import java.util.Comparator;

final class mple
    implements Comparator
{

    private static int a(mple mple, mple mple1)
    {
        return mple.a - mple1.a;
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((mple)obj, (mple)obj1);
    }

    mple()
    {
    }
}
