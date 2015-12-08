// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.skype:
//            Metatag, a, SkypeFactory, ObjectInterfaceFactory, 
//            b, NativeStringConvert, NativeWeakRef

public class MetatagImpl
    implements Metatag, com.skype.a
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyMetatag(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    protected int m_nativeObject;

    public MetatagImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    protected MetatagImpl(int i)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), i);
    }

    public MetatagImpl(int i, long l)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), i, l);
    }

    public MetatagImpl(int i, byte abyte0[], boolean flag)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), i, abyte0, flag);
    }

    public MetatagImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        m_nativeObject = objectinterfacefactory.createMetatag();
        b.getInstance().addDestructibleObject(objectinterfacefactory, this);
    }

    protected MetatagImpl(ObjectInterfaceFactory objectinterfacefactory, int i)
    {
        m_nativeObject = i;
        b.getInstance().addDestructibleObject(objectinterfacefactory, this);
    }

    public MetatagImpl(ObjectInterfaceFactory objectinterfacefactory, int i, long l)
    {
        m_nativeObject = objectinterfacefactory.createMetatag(i, l);
        b.getInstance().addDestructibleObject(objectinterfacefactory, this);
    }

    public MetatagImpl(ObjectInterfaceFactory objectinterfacefactory, int i, byte abyte0[], boolean flag)
    {
        if (flag)
        {
            m_nativeObject = objectinterfacefactory.createMetatag(i, NativeStringConvert.ConvertFromNativeBytes(abyte0));
        } else
        {
            m_nativeObject = objectinterfacefactory.createMetatag(i, abyte0);
        }
        b.getInstance().addDestructibleObject(objectinterfacefactory, this);
    }

    private native byte[] getStrValueNativeString();

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native int getAllocedSize();

    public native byte[] getBinValue();

    public native long getInt64Value();

    public native int getIntValue();

    public native int getKey();

    public String getStrValue()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getStrValueNativeString());
    }

    public native Metatag.TYPE getType();

    public native boolean isFullEqual(Metatag metatag);

    public native boolean isKeyEqual(Metatag metatag);

    public native boolean isNull();

    public native boolean isValueEqual(Metatag metatag);
}
