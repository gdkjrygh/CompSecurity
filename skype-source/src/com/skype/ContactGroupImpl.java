// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, ContactGroup, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, PROPKEY, NativeStringConvert, 
//            NativeWeakRef, a

public class ContactGroupImpl extends ObjectInterfaceImpl
    implements ContactGroup, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyContactGroup(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public ContactGroupImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public ContactGroupImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createContactGroup());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native boolean giveDisplayName(byte abyte0[]);

    public native boolean addContact(int i);

    public native boolean addConversation(int i);

    public void addListener(ContactGroup.ContactGroupIListener contactgroupilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(contactgroupilistener);
        }
        return;
        contactgroupilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw contactgroupilistener;
    }

    public boolean canAddContact()
    {
        return canAddContact(0);
    }

    public native boolean canAddContact(int i);

    public boolean canAddConversation()
    {
        return canAddConversation(0);
    }

    public native boolean canAddConversation(int i);

    public native boolean canRemoveContact();

    public native boolean canRemoveConversation();

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native boolean delete();

    public String getAbchGuidProp()
    {
        return getStrProperty(PROPKEY.CGROUP_ABCH_GUID);
    }

    public native ContactGroup.GetContacts_Result getContacts();

    public native ContactGroup.GetConversations_Result getConversations();

    public int getCustomGroupIdProp()
    {
        return getIntProperty(PROPKEY.CGROUP_CUSTOM_GROUP_ID);
    }

    public String getGivenDisplaynameProp()
    {
        return getStrProperty(PROPKEY.CGROUP_GIVEN_DISPLAYNAME);
    }

    public int getGivenSortorderProp()
    {
        return getIntProperty(PROPKEY.CGROUP_GIVEN_SORTORDER);
    }

    public int getNrofcontactsOnlineProp()
    {
        return getIntProperty(PROPKEY.CGROUP_NROFCONTACTS_ONLINE);
    }

    public int getNrofcontactsProp()
    {
        return getIntProperty(PROPKEY.CGROUP_NROFCONTACTS);
    }

    public ContactGroup.TYPE getTypeProp()
    {
        return ContactGroup.TYPE.fromInt(getIntProperty(PROPKEY.CGROUP_TYPE));
    }

    public boolean giveDisplayName(String s)
    {
        return giveDisplayName(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean giveSortOrder(int i);

    public native void initializeListener();

    public void onChange(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((ContactGroup.ContactGroupIListener)iterator.next()).onChange(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onChangeConversation(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((ContactGroup.ContactGroupIListener)iterator.next()).onChangeConversation(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public native boolean removeContact(int i);

    public native boolean removeConversation(int i);

    public void removeListener(ContactGroup.ContactGroupIListener contactgroupilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(contactgroupilistener);
        }
        return;
        contactgroupilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw contactgroupilistener;
    }
}
