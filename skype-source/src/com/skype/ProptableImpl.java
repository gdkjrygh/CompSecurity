// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.skype:
//            Proptable, a, SkypeFactory, ObjectInterfaceFactory, 
//            b, NativeStringConvert, NativeWeakRef

public class ProptableImpl
    implements Proptable, com.skype.a
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyProptable(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    protected int m_nativeObject;

    public ProptableImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public ProptableImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        m_nativeObject = objectinterfacefactory.createProptable();
        b.getInstance().addDestructibleObject(objectinterfacefactory, this);
    }

    private native byte[] getStrNativeString(int i, int j);

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native byte[] getBin(int i, int j);

    public native int getCount();

    public native int getInt(int i, int j);

    public native int getObjectID(int i);

    public String getStr(int i, int j)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getStrNativeString(i, j));
    }
}
