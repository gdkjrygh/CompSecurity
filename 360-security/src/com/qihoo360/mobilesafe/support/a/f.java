// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            b, a

public class f
    implements b
{

    private b a;

    public f()
    {
    }

    public void a(b b1)
    {
        a = b1;
    }

    public void a(String s, List list, List list1, a a1)
    {
        a.a a2;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        a2 = new a.a(a1) {

            final f a;
            private final a b;

            public void a(int i, boolean flag, byte abyte0[])
                throws RemoteException
            {
                if (!flag)
                {
                    a.e();
                }
                if (b != null)
                {
                    b.a(i, flag, abyte0);
                }
            }

            
            {
                a = f.this;
                b = a1;
                super();
            }
        };
        a.a(s, list, list1, a2);
_L2:
        return;
        s;
        if (a1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            a1.a(1, false, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if (a1 != null)
        {
            try
            {
                a1.a(1, false, null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }
          goto _L2
    }

    public boolean a()
    {
        if (a == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a();
        }
        catch (RemoteException remoteexception)
        {
            return false;
        }
        return flag;
    }

    public boolean a(int i, int j, long l)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (a != null) goto _L2; else goto _L1
_L1:
        return flag1;
_L2:
        flag1 = a.a(i, j, l);
        flag = flag1;
_L4:
        flag1 = flag;
        if (!flag)
        {
            e();
            return flag;
        }
        if (true) goto _L1; else goto _L3
_L3:
        RemoteException remoteexception;
        remoteexception;
          goto _L4
    }

    public boolean a(long l)
    {
        if (a == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(l);
        }
        catch (RemoteException remoteexception)
        {
            return false;
        }
        return flag;
    }

    public boolean a(String s, int i, int j, long l)
    {
        boolean flag1;
        if (a == null)
        {
            flag1 = false;
        } else
        {
            boolean flag;
            try
            {
                flag = a.a(s, i, j, l);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                flag = false;
            }
            flag1 = flag;
            if (!flag)
            {
                e();
                return flag;
            }
        }
        return flag1;
    }

    public boolean a(String s, int i, long l)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (a != null) goto _L2; else goto _L1
_L1:
        return flag1;
_L2:
        flag1 = a.a(s, i, l);
        flag = flag1;
_L4:
        flag1 = flag;
        if (!flag)
        {
            e();
            return flag;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s;
          goto _L4
    }

    public boolean a(String s, long l)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (a != null) goto _L2; else goto _L1
_L1:
        return flag1;
_L2:
        flag1 = a.a(s, l);
        flag = flag1;
_L4:
        flag1 = flag;
        if (!flag)
        {
            e();
            return flag;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s;
          goto _L4
    }

    public boolean a(String s, String s1, long l)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (a != null) goto _L2; else goto _L1
_L1:
        return flag1;
_L2:
        flag1 = a.a(s, s1, l);
        flag = flag1;
_L4:
        flag1 = flag;
        if (!flag)
        {
            e();
            return flag;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s;
          goto _L4
    }

    public boolean a(String s, String s1, String s2, long l, String s3, long l1)
    {
        boolean flag1;
        if (a == null)
        {
            flag1 = false;
        } else
        {
            boolean flag;
            try
            {
                flag = a.a(s, s1, s2, l, s3, l1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                flag = false;
            }
            flag1 = flag;
            if (!flag)
            {
                e();
                return flag;
            }
        }
        return flag1;
    }

    public boolean a(String s, List list, List list1, long l)
    {
        boolean flag1;
        if (a == null)
        {
            flag1 = false;
        } else
        {
            boolean flag;
            try
            {
                flag = a.a(s, list, list1, l);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                flag = false;
            }
            flag1 = flag;
            if (!flag)
            {
                e();
                return flag;
            }
        }
        return flag1;
    }

    public IBinder asBinder()
    {
        return null;
    }

    public int b(String s, List list, List list1, long l)
    {
        int j;
        if (a == null)
        {
            j = -1;
        } else
        {
            int i;
            try
            {
                i = a.b(s, list, list1, l);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                i = -1;
            }
            j = i;
            if (i == -1)
            {
                e();
                return i;
            }
        }
        return j;
    }

    public void b(String s, List list, List list1, a a1)
    {
        a.a a2;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        a2 = new a.a(a1) {

            final f a;
            private final a b;

            public void a(int i, boolean flag, byte abyte0[])
                throws RemoteException
            {
                if (abyte0 == null)
                {
                    a.e();
                }
                if (b != null)
                {
                    b.a(i, flag, abyte0);
                }
            }

            
            {
                a = f.this;
                b = a1;
                super();
            }
        };
        a.b(s, list, list1, a2);
_L2:
        return;
        s;
        if (a1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            a1.a(2, false, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if (a1 != null)
        {
            try
            {
                a1.a(2, false, null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }
          goto _L2
    }

    public boolean b()
    {
        if (a == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.b();
        }
        catch (RemoteException remoteexception)
        {
            return false;
        }
        return flag;
    }

    public int c()
    {
        int i = -1;
        if (a != null) goto _L2; else goto _L1
_L1:
        int j = i;
_L4:
        return j;
_L2:
        j = a.c();
        i = j;
_L5:
        j = i;
        if (i < 0)
        {
            e();
            return i;
        }
        if (true) goto _L4; else goto _L3
_L3:
        RemoteException remoteexception;
        remoteexception;
          goto _L5
    }

    public byte[] c(String s, List list, List list1, long l)
    {
        if (a == null)
        {
            list = null;
        } else
        {
            try
            {
                s = a.c(s, list, list1, l);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = null;
            }
            list = s;
            if (s == null)
            {
                e();
                return s;
            }
        }
        return list;
    }

    public b d()
    {
        return a;
    }

    public void e()
    {
    }
}
