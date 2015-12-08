// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


// Referenced classes of package fs.org.simpleframework.xml.core:
//            PersistenceException, Session

class SessionManager
{
    private static class Reference
    {

        private int count;
        private Session session;

        public int clear()
        {
            int i = count - 1;
            count = i;
            return i;
        }

        public Session get()
        {
            if (count >= 0)
            {
                count = count + 1;
            }
            return session;
        }

        public Reference(boolean flag)
        {
            session = new Session(flag);
        }
    }


    private ThreadLocal local;

    public SessionManager()
    {
        local = new ThreadLocal();
    }

    private Session create(boolean flag)
        throws Exception
    {
        Reference reference = new Reference(flag);
        if (reference != null)
        {
            local.set(reference);
        }
        return reference.get();
    }

    public void close()
        throws Exception
    {
        Reference reference = (Reference)local.get();
        if (reference == null)
        {
            throw new PersistenceException("Session does not exist", new Object[0]);
        }
        if (reference.clear() == 0)
        {
            local.remove();
        }
    }

    public Session open()
        throws Exception
    {
        return open(true);
    }

    public Session open(boolean flag)
        throws Exception
    {
        Reference reference = (Reference)local.get();
        if (reference != null)
        {
            return reference.get();
        } else
        {
            return create(flag);
        }
    }
}
