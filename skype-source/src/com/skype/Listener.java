// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


public interface Listener
{
    public static interface ListenerIIListener
    {

        public abstract void onChange(Listener listener, String s);
    }


    public abstract void addIListener(ListenerIIListener listeneriilistener);

    public abstract void removeIListener(ListenerIIListener listeneriilistener);
}
