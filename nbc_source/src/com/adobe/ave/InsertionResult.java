// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public class InsertionResult
{

    public boolean insertedBeforeReadHead;
    public int periodIndex;

    private InsertionResult(int i, boolean flag)
    {
        periodIndex = i;
        insertedBeforeReadHead = flag;
    }
}
