// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            GI, a, SkypeFactory, b, 
//            NativeStringConvert, ObjectInterfaceFactory, NativeWeakRef, Setup

public class GIImpl
    implements GI, com.skype.a
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyGI(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;
    protected int m_nativeObject;

    protected GIImpl(int i)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), i);
    }

    protected GIImpl(ObjectInterfaceFactory objectinterfacefactory, int i)
    {
        m_listeners = new HashSet();
        m_nativeObject = i;
        b.getInstance().addDestructibleObject(objectinterfacefactory, this);
    }

    private native byte[] getDebugInfoNativeString();

    private native byte[] getFatalErrorMessageNativeString();

    public static void initPlatform()
    {
        initPlatform("", true, true);
    }

    public static void initPlatform(String s)
    {
        initPlatform(s, true, true);
    }

    public static void initPlatform(String s, boolean flag)
    {
        initPlatform(s, flag, true);
    }

    public static void initPlatform(String s, boolean flag, boolean flag1)
    {
        initPlatform(NativeStringConvert.ConvertToNativeBytes(s), flag, flag1);
    }

    private static native void initPlatform(byte abyte0[], boolean flag, boolean flag1);

    private native void log(byte abyte0[], byte abyte1[]);

    private native void setDefaultPeers(byte abyte0[]);

    public static native void uninitPlatform();

    public void addListener(GI.GIIListener giilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(giilistener);
        }
        return;
        giilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw giilistener;
    }

    public native void connect();

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native void disconnect();

    public native GI.CONNSTATUS getConnStatus();

    public String getDebugInfo()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getDebugInfoNativeString());
    }

    public String getFatalErrorMessage()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getFatalErrorMessageNativeString());
    }

    public native GI.GetLastFileError_Result getLastFileError();

    public native GI.LIBSTATUS getLibStatus();

    public native Setup getSetup();

    public native int getUsedPort();

    public void log(String s, String s1)
    {
        log(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public void onConnStatusChange(GI.CONNSTATUS connstatus)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((GI.GIIListener)iterator.next()).onConnStatusChange(this, connstatus)) { }
        break MISSING_BLOCK_LABEL_48;
        connstatus;
        hashset;
        JVM INSTR monitorexit ;
        throw connstatus;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onFileError(GI.FILEERROR fileerror)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((GI.GIIListener)iterator.next()).onFileError(this, fileerror)) { }
        break MISSING_BLOCK_LABEL_48;
        fileerror;
        hashset;
        JVM INSTR monitorexit ;
        throw fileerror;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onLibStatusChange(GI.LIBSTATUS libstatus)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((GI.GIIListener)iterator.next()).onLibStatusChange(this, libstatus)) { }
        break MISSING_BLOCK_LABEL_48;
        libstatus;
        hashset;
        JVM INSTR monitorexit ;
        throw libstatus;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onNodeinfoChange(byte abyte0[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((GI.GIIListener)iterator.next()).onNodeinfoChange(this, abyte0)) { }
        break MISSING_BLOCK_LABEL_48;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onProxyAuthenticationFailure(GI.PROXYTYPE proxytype)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((GI.GIIListener)iterator.next()).onProxyAuthenticationFailure(this, proxytype)) { }
        break MISSING_BLOCK_LABEL_48;
        proxytype;
        hashset;
        JVM INSTR monitorexit ;
        throw proxytype;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void pollEvents()
    {
        pollEvents(0);
    }

    public native void pollEvents(int i);

    public void removeListener(GI.GIIListener giilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(giilistener);
        }
        return;
        giilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw giilistener;
    }

    public void setDefaultPeers(String s)
    {
        setDefaultPeers(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native void setSystemID(long l);
}
