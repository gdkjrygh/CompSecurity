// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            ObjectInterface, a, SkypeFactory, ObjectInterfaceFactory, 
//            b, NativeStringConvert, PROPKEY, NativeWeakRef, 
//            Metatag

public class ObjectInterfaceImpl
    implements ObjectInterface, com.skype.a
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyObjectInterface(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;
    protected int m_nativeObject;

    public ObjectInterfaceImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    protected ObjectInterfaceImpl(int i)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), i);
    }

    public ObjectInterfaceImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        m_listeners = new HashSet();
        m_nativeObject = objectinterfacefactory.createObjectInterface();
        b.getInstance().addDestructibleObject(objectinterfacefactory, this);
    }

    protected ObjectInterfaceImpl(ObjectInterfaceFactory objectinterfacefactory, int i)
    {
        m_listeners = new HashSet();
        m_nativeObject = i;
        b.getInstance().addDestructibleObject(objectinterfacefactory, this);
    }

    private native byte[] getStrPropertyNativeString(PROPKEY propkey);

    private native byte[] getStrPropertyNativeString(PROPKEY propkey, byte abyte0[]);

    private native byte[] getStrPropertyWithXmlStrippedNativeString(PROPKEY propkey, byte abyte0[]);

    private native boolean setExtendedProperty(PROPKEY propkey, byte abyte0[]);

    public void addListener(ObjectInterface.ObjectInterfaceIListener objectinterfaceilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(objectinterfaceilistener);
        }
        return;
        objectinterfaceilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw objectinterfaceilistener;
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ObjectInterface)
        {
            flag = flag1;
            if (((ObjectInterface)obj).getObjectID() == getObjectID())
            {
                flag = true;
            }
        }
        return flag;
    }

    public native byte[] getBinProperty(PROPKEY propkey);

    public native int getDbID();

    public native ObjectInterface.GetFilenameProperty_Result getFilenameProperty(PROPKEY propkey);

    public native long getInt64Property(PROPKEY propkey);

    public native long getInt64Property(PROPKEY propkey, int i);

    public native int getIntProperty(PROPKEY propkey);

    public native int getIntProperty(PROPKEY propkey, int i);

    public native int getObjectID();

    public native boolean getProperty(PROPKEY propkey, Metatag metatag);

    public native boolean getPropertyOrDefault(PROPKEY propkey, Metatag metatag);

    public String getStrProperty(PROPKEY propkey)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getStrPropertyNativeString(propkey));
    }

    public String getStrProperty(PROPKEY propkey, String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getStrPropertyNativeString(propkey, NativeStringConvert.ConvertToNativeBytes(s)));
    }

    public String getStrPropertyWithXmlStripped(PROPKEY propkey, String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getStrPropertyWithXmlStrippedNativeString(propkey, NativeStringConvert.ConvertToNativeBytes(s)));
    }

    public int hashCode()
    {
        return getObjectID();
    }

    public void onPropertyChange(PROPKEY propkey)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((ObjectInterface.ObjectInterfaceIListener)iterator.next()).onPropertyChange(this, propkey)) { }
        break MISSING_BLOCK_LABEL_48;
        propkey;
        hashset;
        JVM INSTR monitorexit ;
        throw propkey;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void removeListener(ObjectInterface.ObjectInterfaceIListener objectinterfaceilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(objectinterfaceilistener);
        }
        return;
        objectinterfaceilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw objectinterfaceilistener;
    }

    public native boolean setExtendedProperty(Metatag metatag);

    public native boolean setExtendedProperty(PROPKEY propkey, int i);

    public boolean setExtendedProperty(PROPKEY propkey, String s)
    {
        return setExtendedProperty(propkey, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native void unlink();
}
