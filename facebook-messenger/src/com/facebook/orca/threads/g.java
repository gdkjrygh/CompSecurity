// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import com.facebook.auth.b.b;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.a.em;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.ex;
import com.google.common.a.ey;
import com.google.common.a.fi;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.threads:
//            FolderType, FolderName, m

public class g
{

    private static final ev a;
    private static final ex b;
    private final b c;
    private final a d;
    private final a e;
    private final a f;

    public g(b b1, a a1, a a2, a a3)
    {
        c = b1;
        d = a1;
        e = a2;
        f = a3;
    }

    private static ex a(Map map)
    {
        ey ey1 = ex.j();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); ey1.a(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return ey1.a();
    }

    public FolderName a(ThreadCriteria threadcriteria)
    {
        if (threadcriteria.a() != null)
        {
            return a(threadcriteria.a());
        }
        if (threadcriteria.b() != null)
        {
            return a(threadcriteria.b());
        } else
        {
            throw new IllegalArgumentException("Trying to get the folder for an invalid ThreadCriteria");
        }
    }

    public FolderName a(UserKey userkey)
    {
        if (userkey.a() == n.PHONE_NUMBER)
        {
            userkey = FolderType.d;
        } else
        {
            userkey = com.facebook.orca.threads.FolderType.b;
        }
        return com.facebook.orca.threads.FolderName.a(userkey, (ViewerContext)f.b());
    }

    public FolderName a(String s)
    {
        if (m.g(s))
        {
            s = FolderType.d;
        } else
        {
            s = com.facebook.orca.threads.FolderType.b;
        }
        return com.facebook.orca.threads.FolderName.a(s, (ViewerContext)f.b());
    }

    public boolean a()
    {
        if (c.b())
        {
            return ((Boolean)d.b()).booleanValue() && ((Boolean)e.b()).booleanValue();
        } else
        {
            return false;
        }
    }

    public boolean a(FolderName foldername)
    {
        return b.l().contains(foldername.a());
    }

    public FolderType b()
    {
        if (c.b())
        {
            if (((Boolean)d.b()).booleanValue() && ((Boolean)e.b()).booleanValue())
            {
                return FolderType.e;
            } else
            {
                return com.facebook.orca.threads.FolderType.b;
            }
        } else
        {
            return com.facebook.orca.threads.FolderType.a;
        }
    }

    public boolean b(FolderName foldername)
    {
        return a.containsKey(foldername.a());
    }

    public es c(FolderName foldername)
    {
        et et1 = es.e();
        for (foldername = b.e(foldername.a()).iterator(); foldername.hasNext(); et1.b(com.facebook.orca.threads.FolderName.a((FolderType)foldername.next(), (ViewerContext)f.b()))) { }
        return et1.b();
    }

    static 
    {
        a = ev.k().b(com.facebook.orca.threads.FolderType.b, FolderType.e).b(FolderType.d, FolderType.e).b();
        b = a(a);
    }
}
