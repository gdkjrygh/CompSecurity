// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.skype:
//            MetatagImpl, Term, SkypeFactory, ObjectInterfaceFactory, 
//            NativeWeakRef, a

public class TermImpl extends MetatagImpl
    implements Term
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyTerm(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    public TermImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public TermImpl(int i, Term.CONDITION condition, long l)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), i, condition, l);
    }

    public TermImpl(int i, Term.CONDITION condition, String s)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), i, condition, s);
    }

    public TermImpl(int i, Term.CONDITION condition, byte abyte0[])
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), i, condition, abyte0);
    }

    public TermImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createTerm());
    }

    public TermImpl(ObjectInterfaceFactory objectinterfacefactory, int i, Term.CONDITION condition, long l)
    {
        super(objectinterfacefactory, objectinterfacefactory.createTerm(i, condition, l));
    }

    public TermImpl(ObjectInterfaceFactory objectinterfacefactory, int i, Term.CONDITION condition, String s)
    {
        super(objectinterfacefactory, objectinterfacefactory.createTerm(i, condition, s));
    }

    public TermImpl(ObjectInterfaceFactory objectinterfacefactory, int i, Term.CONDITION condition, byte abyte0[])
    {
        super(objectinterfacefactory, objectinterfacefactory.createTerm(i, condition, abyte0));
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }
}
