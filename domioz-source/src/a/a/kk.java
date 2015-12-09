// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f.a;

// Referenced classes of package a.a:
//            ki, c, ck, cm, 
//            cl

final class kk
    implements Runnable
{

    final ki a;

    private kk(ki ki1)
    {
        a = ki1;
        super();
    }

    kk(ki ki1, byte byte0)
    {
        this(ki1);
    }

    public final void run()
    {
_L2:
        if (!ki.c(a))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = a.a.ki.a(a).b();
        if (((ck) (obj)).b() || ki.d(a))
        {
            ki.e(a).c(((ck) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            ki.f(a).a(((ck) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.appboy.f.a.c(ki.b(), String.format("Automatic thread interrupted! [%s]", new Object[] {
                ((InterruptedException) (obj)).getMessage()
            }));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
