// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.b;


// Referenced classes of package com.android.slyce.a.b:
//            l, g

public abstract class n extends l
    implements g
{

    public n()
    {
    }

    public void a(Exception exception, Object obj)
    {
        if (isCancelled())
        {
            return;
        }
        if (exception != null)
        {
            b(exception);
            return;
        }
        try
        {
            a(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            b(exception);
        }
    }

    protected abstract void a(Object obj);

    protected void b(Exception exception)
    {
        a(exception);
    }
}
