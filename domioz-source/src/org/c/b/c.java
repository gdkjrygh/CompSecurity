// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.b;


// Referenced classes of package org.c.b:
//            a

public abstract class c extends RuntimeException
{

    public c(String s)
    {
        super(s);
    }

    public c(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public boolean contains(Class class1)
    {
        Throwable throwable;
        if (class1 == null)
        {
            return false;
        }
        if (class1.isInstance(this))
        {
            return true;
        }
        Throwable throwable1 = getCause();
        if (throwable1 == this)
        {
            return false;
        }
        throwable = throwable1;
        if (throwable1 instanceof c)
        {
            return ((c)throwable1).contains(class1);
        }
_L4:
        if (throwable == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (class1.isInstance(throwable))
        {
            return true;
        }
        if (true) goto _L2; else goto _L1
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        if (throwable.getCause() == throwable)
        {
            break; /* Loop/switch isn't completed */
        }
        throwable = throwable.getCause();
        if (true) goto _L4; else goto _L3
_L3:
        return false;
    }

    public String getMessage()
    {
        return a.buildMessage(super.getMessage(), getCause());
    }

    public Throwable getMostSpecificCause()
    {
        Throwable throwable = getRootCause();
        Object obj = this;
        if (throwable != null)
        {
            obj = throwable;
        }
        return ((Throwable) (obj));
    }

    public Throwable getRootCause()
    {
        Throwable throwable1 = null;
        Throwable throwable2;
        for (Throwable throwable = getCause(); throwable != null && throwable != throwable1; throwable = throwable2)
        {
            throwable2 = throwable.getCause();
            throwable1 = throwable;
        }

        return throwable1;
    }

    static 
    {
        org/c/b/a.getName();
    }
}
