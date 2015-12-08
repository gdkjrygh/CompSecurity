// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.b;

import java.io.Serializable;

public final class a
    implements Serializable
{

    public String a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public a()
    {
    }

    public final String toString()
    {
        return (new StringBuilder("Effect [name=")).append(a).append(", b1=").append(b).append(", b2=").append(c).append(", b3=").append(d).append(", b4=").append(e).append(", b5=").append(f).append(", id=").append(g).append("]").toString();
    }
}
