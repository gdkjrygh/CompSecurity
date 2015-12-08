// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


// Referenced classes of package fs.org.simpleframework.xml.core:
//            SessionManager, Session

private static class session
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

    public (boolean flag)
    {
        session = new Session(flag);
    }
}
