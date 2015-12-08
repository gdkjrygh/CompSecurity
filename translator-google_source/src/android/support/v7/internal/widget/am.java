// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.d.f;

final class am extends f
{

    public am()
    {
        super(6);
    }

    static int a(int i, android.graphics.PorterDuff.Mode mode)
    {
        return (i + 31) * 31 + mode.hashCode();
    }
}
