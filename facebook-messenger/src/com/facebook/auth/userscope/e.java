// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.userscope;

import com.facebook.auth.b.b;
import com.facebook.auth.viewercontext.ViewerContext;
import com.google.common.base.Objects;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.facebook.auth.userscope:
//            f

public class e
    implements com.facebook.auth.viewercontext.e
{

    private static final Class a = com/facebook/auth/userscope/e;
    private final b b;
    private final ViewerContext c;
    private final String d;
    private ThreadLocal e;

    public e(b b1, com.facebook.auth.viewercontext.e e1)
    {
        e = new f(this);
        b = b1;
        c = e1.c();
        if (b1.a() != null)
        {
            d = b1.a().a();
            return;
        } else
        {
            d = c.a();
            return;
        }
    }

    public ViewerContext a()
    {
        if (Objects.equal(c.a(), d))
        {
            return null;
        } else
        {
            return c;
        }
    }

    public void a(ViewerContext viewercontext)
    {
        throw new UnsupportedOperationException();
    }

    public ViewerContext b()
    {
        throw new UnsupportedOperationException();
    }

    public void b(ViewerContext viewercontext)
    {
        ((List)e.get()).add(viewercontext);
    }

    public ViewerContext c()
    {
        Object obj = (List)e.get();
        if (!((List) (obj)).isEmpty())
        {
            obj = (ViewerContext)((List) (obj)).get(((List) (obj)).size() - 1);
        } else
        if (Objects.equal(c.a(), d))
        {
            ViewerContext viewercontext = b.a();
            if (viewercontext == null)
            {
                com.facebook.debug.log.b.d(a, "User no longer logged in. Original uid: %s, viewer context: null, is_logged_in: %s. Returning original viewer context.", new Object[] {
                    d, Boolean.valueOf(b.b())
                });
                return c;
            }
            obj = viewercontext;
            if (!Objects.equal(viewercontext.a(), d))
            {
                com.facebook.debug.log.b.d(a, (new StringBuilder()).append("User no longer logged in. Original uid: %s, viewer context uid: %s, is_logged_in: %s. Returning original viewer context.").append(d).toString(), new Object[] {
                    viewercontext.a(), Boolean.valueOf(b.b())
                });
                return c;
            }
        } else
        {
            return c;
        }
        return ((ViewerContext) (obj));
    }

    public void d()
    {
        List list = (List)e.get();
        if (list.isEmpty())
        {
            throw new NoSuchElementException();
        } else
        {
            list.remove(list.size() - 1);
            return;
        }
    }

}
