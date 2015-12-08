// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.logic;


public class Condition
{

    public Object operand;
    public Predicate.Operation operation;

    public Condition(Predicate.Operation operation1, Object obj)
    {
        operation = operation1;
        operand = obj;
    }
}
