// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, ContentItem, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, NativeWeakRef, a

public class ContentItemImpl extends ObjectInterfaceImpl
    implements ContentItem, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyContentItem(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public ContentItemImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public ContentItemImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createContentItem());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    public void addListener(ContentItem.ContentItemIListener contentitemilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(contentitemilistener);
        }
        return;
        contentitemilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw contentitemilistener;
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native void initializeListener();

    public void removeListener(ContentItem.ContentItemIListener contentitemilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(contentitemilistener);
        }
        return;
        contentitemilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw contentitemilistener;
    }
}
