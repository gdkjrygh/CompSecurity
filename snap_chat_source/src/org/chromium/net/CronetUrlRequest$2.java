// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            CronetUrlRequest, UrlRequestListener

final class a
    implements Runnable
{

    private String a;
    private CronetUrlRequest b;

    public final void run()
    {
label0:
        {
            synchronized (CronetUrlRequest.a(b))
            {
                if (!b.d())
                {
                    break label0;
                }
            }
            return;
        }
        CronetUrlRequest.g(b);
        obj;
        JVM INSTR monitorexit ;
        try
        {
            CronetUrlRequest.e(b).a(b, a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            CronetUrlRequest.a(b, ((Exception) (obj)));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (CronetUrlRequest croneturlrequest, String s)
    {
        b = croneturlrequest;
        a = s;
        super();
    }
}
