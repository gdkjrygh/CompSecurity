// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieIdentityComparator;

public class l
    implements CookieStore
{

    private final ArrayList a = new ArrayList();
    private final Comparator b = new CookieIdentityComparator();

    public l()
    {
    }

    public void addCookie(Cookie cookie)
    {
        this;
        JVM INSTR monitorenter ;
        if (cookie == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (b.compare(cookie, iterator.next()) != 0)
            {
                continue;
            }
            iterator.remove();
            break;
        } while (true);
        if (!cookie.isExpired(new Date()))
        {
            a.add(cookie);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        cookie;
        throw cookie;
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean clearExpired(Date date)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (date != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Iterator iterator = a.iterator();
        flag = false;
_L4:
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
        } while (!((Cookie)iterator.next()).isExpired(date));
        iterator.remove();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        date;
        throw date;
    }

    public List getCookies()
    {
        this;
        JVM INSTR monitorenter ;
        List list = Collections.unmodifiableList(a);
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        return a.toString();
    }
}
