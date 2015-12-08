// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, NativeListenable, ObjectInterface, Search, 
//            ObjectInterfaceFactory, SkypeFactory, Term, NativeWeakRef, 
//            a

public class SearchImpl extends ObjectInterfaceImpl
    implements NativeListenable, ObjectInterface, Search
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroySearch(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public SearchImpl(ObjectInterfaceFactory objectinterfacefactory, Search.TARGET target, int i)
    {
        super(objectinterfacefactory, objectinterfacefactory.createSearch(target, i));
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    public SearchImpl(Search.TARGET target)
    {
        this(target, -1);
    }

    public SearchImpl(Search.TARGET target, int i)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), target, i);
    }

    public void addListener(Search.SearchIListener searchilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(searchilistener);
        }
        return;
        searchilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw searchilistener;
    }

    public native void addTerm(Term term);

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native void extend();

    public Search.GetResults_Result getResults()
    {
        return getResults(0, -1);
    }

    public Search.GetResults_Result getResults(int i)
    {
        return getResults(i, -1);
    }

    public native Search.GetResults_Result getResults(int i, int j);

    public native void initializeListener();

    public native boolean isValid();

    public void removeListener(Search.SearchIListener searchilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(searchilistener);
        }
        return;
        searchilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw searchilistener;
    }

    public void setAgeRangeTerm()
    {
        setAgeRangeTerm(0, -1);
    }

    public void setAgeRangeTerm(int i)
    {
        setAgeRangeTerm(i, -1);
    }

    public native void setAgeRangeTerm(int i, int j);
}
