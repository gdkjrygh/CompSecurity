// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core;


public interface ILPOrdering
{

    public static final int FIRST_EQUAL_TO_SECOND = 0;
    public static final int FIRST_GREATER_THAN_SECOND = 1;
    public static final int FIRST_LESS_THAN_SECOND = -1;

    public abstract int compare(Object obj, Object obj1);
}
