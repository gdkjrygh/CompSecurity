// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, ContactSearch, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, NativeStringConvert, PROPKEY, 
//            NativeWeakRef, a

public class ContactSearchImpl extends ObjectInterfaceImpl
    implements ContactSearch, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyContactSearch(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public ContactSearchImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public ContactSearchImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createContactSearch());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native boolean addEmailTerm(byte abyte0[], boolean flag);

    private native boolean addLanguageTerm(byte abyte0[], boolean flag);

    private native boolean addStrTerm(PROPKEY propkey, ContactSearch.CONDITION condition, byte abyte0[], boolean flag);

    public boolean addEmailTerm(String s)
    {
        return addEmailTerm(s, false);
    }

    public boolean addEmailTerm(String s, boolean flag)
    {
        return addEmailTerm(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public boolean addIntTerm(PROPKEY propkey, ContactSearch.CONDITION condition, int i)
    {
        return addIntTerm(propkey, condition, i, false);
    }

    public native boolean addIntTerm(PROPKEY propkey, ContactSearch.CONDITION condition, int i, boolean flag);

    public boolean addLanguageTerm(String s)
    {
        return addLanguageTerm(s, false);
    }

    public boolean addLanguageTerm(String s, boolean flag)
    {
        return addLanguageTerm(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public void addListener(ContactSearch.ContactSearchIListener contactsearchilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(contactsearchilistener);
        }
        return;
        contactsearchilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw contactsearchilistener;
    }

    public boolean addMaxAgeTerm(int i)
    {
        return addMaxAgeTerm(i, false);
    }

    public native boolean addMaxAgeTerm(int i, boolean flag);

    public boolean addMinAgeTerm(int i)
    {
        return addMinAgeTerm(i, false);
    }

    public native boolean addMinAgeTerm(int i, boolean flag);

    public native void addOr();

    public boolean addStrTerm(PROPKEY propkey, ContactSearch.CONDITION condition, String s)
    {
        return addStrTerm(propkey, condition, s, false);
    }

    public boolean addStrTerm(PROPKEY propkey, ContactSearch.CONDITION condition, String s, boolean flag)
    {
        return addStrTerm(propkey, condition, NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native void extend();

    public ContactSearch.STATUS getContactSearchStatusProp()
    {
        return ContactSearch.STATUS.fromInt(getIntProperty(PROPKEY.CONTACTSEARCH_STATUS));
    }

    public ContactSearch.GetResults_Result getResults()
    {
        return getResults(0, -1);
    }

    public ContactSearch.GetResults_Result getResults(int i)
    {
        return getResults(i, -1);
    }

    public native ContactSearch.GetResults_Result getResults(int i, int j);

    public int getStatusProp()
    {
        return getIntProperty(PROPKEY.CONTACTSEARCH_STATUS);
    }

    public native void initializeListener();

    public native boolean isValid();

    public void onNewResult(int i, int j)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((ContactSearch.ContactSearchIListener)iterator.next()).onNewResult(this, i, j)) { }
        break MISSING_BLOCK_LABEL_54;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public native void release();

    public void removeListener(ContactSearch.ContactSearchIListener contactsearchilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(contactsearchilistener);
        }
        return;
        contactsearchilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw contactsearchilistener;
    }

    public native void setSupportedContactTypes(int i);

    public native void submit();
}
