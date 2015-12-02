// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.format;


public interface InputAccessor
{

    public abstract boolean hasMoreBytes();

    public abstract byte nextByte();

    public abstract void reset();
}
