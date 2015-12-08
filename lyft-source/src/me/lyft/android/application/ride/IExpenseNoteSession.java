// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;


public interface IExpenseNoteSession
{

    public abstract String getExpenseCode();

    public abstract String getExpenseNote();

    public abstract String getRideId();

    public abstract boolean isConcurEnabled();

    public abstract void reset();

    public abstract void setConcurEnabled(boolean flag);

    public abstract void setExpenseCode(String s);

    public abstract void setExpenseNote(String s);

    public abstract void setRideId(String s);
}
