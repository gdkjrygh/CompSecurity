// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.c.b;
import com.appboy.f.a;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package a.a:
//            ki, c, aa

final class kj
    implements b
{

    final aa a;
    final ki b;

    kj(ki ki1, aa aa1)
    {
        b = ki1;
        a = aa1;
        super();
    }

    public final void a(Object obj)
    {
        boolean flag;
        if (!a.a.ki.a(b).a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (!a.a.ki.a(b).a())
        {
            b.a(a.a.ki.b(b));
        }
        return;
        obj;
        com.appboy.f.a.c(a.a.ki.b(), "Failed to create flush request.", ((Throwable) (obj)));
        try
        {
            a.a(obj, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.appboy.f.a.c(a.a.ki.b(), "Failed to log throwable.", ((Throwable) (obj)));
        }
        return;
    }
}
