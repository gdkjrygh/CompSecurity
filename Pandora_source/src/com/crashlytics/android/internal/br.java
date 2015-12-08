// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


final class br
{

    static final br a = new br(0, 0);
    final int b;
    final int c;

    br(int i, int j)
    {
        b = i;
        c = j;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("[position = ").append(b).append(", length = ").append(c).append("]").toString();
    }

}
