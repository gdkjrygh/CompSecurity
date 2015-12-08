// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.net.SocketImpl;
import java.net.SocketImplFactory;

// Referenced classes of package crittercism.android:
//            ck, ac, e, d

public final class ad
    implements SocketImplFactory
{

    private Class a;
    private SocketImplFactory b;
    private e c;
    private d d;

    public ad(Class class1, e e, d d1)
    {
        c = e;
        d = d1;
        a = class1;
        class1 = a;
        if (class1 == null)
        {
            throw new ck("Class was null");
        }
        try
        {
            class1.newInstance();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ck("Unable to create new instance", class1);
        }
    }

    public ad(SocketImplFactory socketimplfactory, e e, d d1)
    {
        c = e;
        d = d1;
        b = socketimplfactory;
        socketimplfactory = b;
        if (socketimplfactory == null)
        {
            throw new ck("Factory was null");
        }
        try
        {
            if (socketimplfactory.createSocketImpl() == null)
            {
                throw new ck("Factory does not work");
            }
        }
        // Misplaced declaration of an exception variable
        catch (SocketImplFactory socketimplfactory)
        {
            throw new ck("Factory does not work", socketimplfactory);
        }
    }

    public final SocketImpl createSocketImpl()
    {
        SocketImpl socketimpl = null;
        if (b == null) goto _L2; else goto _L1
_L1:
        socketimpl = b.createSocketImpl();
_L3:
        Object obj;
        Object obj1;
        if (socketimpl != null)
        {
            return new ac(c, d, socketimpl);
        } else
        {
            return socketimpl;
        }
_L2:
        obj = a;
        obj = (SocketImpl)a.newInstance();
        socketimpl = ((SocketImpl) (obj));
          goto _L3
        obj1;
        ((IllegalAccessException) (obj1)).printStackTrace();
          goto _L3
        obj1;
        ((InstantiationException) (obj1)).printStackTrace();
          goto _L3
    }
}
