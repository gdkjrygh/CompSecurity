// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


public interface 
{

    public abstract void cancelInterpretation();

    public abstract void exit();

    public abstract void interpret(String s);

    public abstract void stopListening();

    public abstract void stopPrompts();

    public abstract void wakeUp();
}
