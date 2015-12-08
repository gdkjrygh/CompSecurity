// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            Listener, NativeListenable, SkypeFactory, NativeStringConvert, 
//            ObjectInterfaceFactory

public class ListenerImpl
    implements Listener, NativeListenable
{

    private HashSet m_listeners;
    protected int m_nativeObject;

    protected ListenerImpl(int i)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), i);
    }

    protected ListenerImpl(ObjectInterfaceFactory objectinterfacefactory, int i)
    {
        m_listeners = new HashSet();
        m_nativeObject = i;
    }

    public void addIListener(Listener.ListenerIIListener listeneriilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(listeneriilistener);
        }
        return;
        listeneriilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw listeneriilistener;
    }

    public native void initializeListener();

    public void onChange(byte abyte0[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Listener.ListenerIIListener)iterator.next()).onChange(this, NativeStringConvert.ConvertFromNativeBytes(abyte0))) { }
        break MISSING_BLOCK_LABEL_51;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void removeIListener(Listener.ListenerIIListener listeneriilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(listeneriilistener);
        }
        return;
        listeneriilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw listeneriilistener;
    }
}
