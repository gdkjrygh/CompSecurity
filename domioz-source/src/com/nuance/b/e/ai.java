// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;


final class ai extends RuntimeException
{

    public ai(long l)
    {
        super((new StringBuilder("Failed to sync agent values to server: ")).append(l).toString());
    }
}
