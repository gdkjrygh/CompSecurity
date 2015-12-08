// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.IOException;
import java.net.SocketImpl;
import java.net.SocketImplFactory;

// Referenced classes of package b.a:
//            de, qc, da, eu, 
//            gt, fg

public final class qb
    implements SocketImplFactory
{

    private static String f[] = {
        "org.apache.harmony.luni.net.PlainSocketImpl", "java.net.PlainSocketImpl"
    };
    private Class a;
    private SocketImplFactory b;
    private gt c;
    private fg d;
    private da e;

    public qb(Class class1, gt gt, fg fg, da da1)
    {
        c = gt;
        d = fg;
        e = da1;
        a = class1;
        a(a);
    }

    public qb(SocketImplFactory socketimplfactory, gt gt, fg fg)
    {
        c = gt;
        d = fg;
        b = socketimplfactory;
        socketimplfactory = b;
        if (socketimplfactory == null)
        {
            throw new de("Factory was null");
        }
        try
        {
            if (socketimplfactory.createSocketImpl() == null)
            {
                throw new de("Factory does not work");
            }
        }
        // Misplaced declaration of an exception variable
        catch (SocketImplFactory socketimplfactory)
        {
            throw new de("Factory does not work", socketimplfactory);
        }
    }

    private static void a(Class class1)
    {
        String as[];
        int i;
        boolean flag1;
        int j;
        flag1 = false;
        if (class1 == null)
        {
            throw new de("Class was null");
        }
        as = f;
        j = as.length;
        i = 0;
_L2:
        Object obj;
        boolean flag;
        flag = flag1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = as[i];
        obj = Class.forName(((String) (obj)));
        if (!((Class) (obj)).isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        flag = true;
        if (!flag)
        {
            throw new de("Unrecognized SocketImpl class.");
        }
        break; /* Loop/switch isn't completed */
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            class1.newInstance();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new de("Unable to create new instance", class1);
        }
    }

    public final SocketImpl createSocketImpl()
    {
        Object obj;
        qc qc1;
        if (b != null)
        {
            obj = b.createSocketImpl();
        } else
        {
            obj = a;
            try
            {
                obj = (SocketImpl)a.newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IllegalAccessException) (obj)).printStackTrace();
                obj = null;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((InstantiationException) (obj)).printStackTrace();
                obj = null;
            }
        }
        qc1 = new qc(c, d);
        if (obj != null)
        {
            SocketImpl socketimpl;
            try
            {
                socketimpl = (SocketImpl)e.a(obj.getClass(), qc1, null, null);
            }
            catch (IOException ioexception)
            {
                eu.a(ioexception);
                return ((SocketImpl) (obj));
            }
            catch (de de1)
            {
                eu.a(de1);
                return ((SocketImpl) (obj));
            }
            qc1.a(socketimpl);
            obj = socketimpl;
        } else
        {
            obj = null;
        }
        return ((SocketImpl) (obj));
    }

}
