// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;


// Referenced classes of package io.fabric.sdk.android.services.common:
//            n

static final class c
{

    static final c a = new <init>(0, 0);
    final int b;
    final int c;

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("[position = ").append(b).append(", length = ").append(c).append("]").toString();
    }


    (int i, int j)
    {
        b = i;
        c = j;
    }
}
