// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;


final class h
    implements Runnable
{

    final StringBuilder a;

    h(StringBuilder stringbuilder)
    {
        a = stringbuilder;
        super();
    }

    public void run()
    {
        throw new NullPointerException(a.toString());
    }
}
