// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import com.appboy.f.a;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package a.a:
//            dd, ak, aa, bn, 
//            bj

public class cz
    implements dd
{

    private static final String a;
    private final dd b;
    private final aa c;

    public cz(dd dd1, aa aa1)
    {
        b = dd1;
        c = aa1;
    }

    private static void a(aa aa1, Throwable throwable)
    {
        try
        {
            aa1.a(new ak("A database exception has occurred. Please view the stack trace for more details.", throwable), a/a/ak);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            com.appboy.f.a.c(a, "Failed to log throwable.", aa1);
        }
    }

    public final bn a()
    {
        bn bn;
        try
        {
            bn = b.a();
        }
        catch (Exception exception)
        {
            com.appboy.f.a.c(a, "Failed to get the active session from the storage.", exception);
            a(c, ((Throwable) (exception)));
            return null;
        }
        return bn;
    }

    public final void a(bn bn)
    {
        try
        {
            b.a(bn);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bn bn)
        {
            com.appboy.f.a.c(a, "Failed to upsert active session in the storage.", bn);
        }
        a(c, ((Throwable) (bn)));
    }

    public final void a(bn bn, bj bj)
    {
        try
        {
            b.a(bn, bj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bn bn)
        {
            com.appboy.f.a.c(a, "Failed to add single event to session due to unexpected exception.", bn);
        }
        a(c, ((Throwable) (bn)));
    }

    public final bn b()
    {
        bn bn;
        try
        {
            bn = b.b();
        }
        catch (Exception exception)
        {
            com.appboy.f.a.c(a, "Failed to get the closed session from the storage.", exception);
            a(c, exception);
            return null;
        }
        return bn;
    }

    public final void b(bn bn)
    {
        try
        {
            b.b(bn);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bn bn)
        {
            com.appboy.f.a.c(a, "Failed to delete the sealed session from the storage.", bn);
        }
        a(c, bn);
    }

    public final Collection c()
    {
        Collection collection;
        try
        {
            collection = b.c();
        }
        catch (Exception exception)
        {
            com.appboy.f.a.c(a, "Failed to fetch all sealed sessions from the storage.", exception);
            a(c, exception);
            return Collections.EMPTY_LIST;
        }
        return collection;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/cz.getName()
        });
    }
}
