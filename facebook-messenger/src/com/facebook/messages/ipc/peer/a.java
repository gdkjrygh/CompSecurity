// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.u.c;
import com.facebook.common.u.d;
import com.facebook.common.u.i;
import com.facebook.debug.log.b;
import com.google.common.a.hq;
import com.google.common.a.kl;
import com.google.common.base.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class a
{

    private final Uri a;
    private final c b = new c();
    private final Set c = kl.a();
    private final String d;

    a(Uri uri, String s)
    {
        a = uri;
        b.a((new StringBuilder()).append(s).append("/{thread_id}").toString(), "THREAD");
        d = Uri.parse(s).getPath();
    }

    private Optional b(Uri uri)
    {
        uri = b.a(uri.toString());
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (!"THREAD".equals(((i) (uri)).a))
        {
            break MISSING_BLOCK_LABEL_44;
        }
        uri = Optional.of(((i) (uri)).b.getString("thread_id"));
        return uri;
        uri;
        return Optional.absent();
    }

    void a()
    {
        c.clear();
    }

    void a(Uri uri, com.facebook.i.a.a.d d1)
    {
        uri = b(uri);
        if (uri.isPresent())
        {
            d1.a = Boolean.valueOf(c.contains(uri.get()));
            if (Boolean.TRUE.equals(d1.a))
            {
                d1.b = true;
            }
        }
    }

    void a(Bundle bundle)
    {
        bundle.putStringArrayList(d, hq.a(c));
    }

    boolean a(Uri uri)
    {
        return a.equals(uri) || b(uri).isPresent();
    }

    boolean a(Uri uri, Object obj)
    {
        if (a.equals(uri))
        {
            c.clear();
            return true;
        }
        uri = b(uri);
        if (uri.isPresent())
        {
            if (Boolean.TRUE.equals(obj))
            {
                return c.add(uri.get());
            } else
            {
                return c.remove(uri.get());
            }
        } else
        {
            return false;
        }
    }

    void b(Bundle bundle)
    {
        c.clear();
        bundle = bundle.getStringArrayList(d);
        if (bundle == null)
        {
            com.facebook.debug.log.b.e(com/facebook/messages/ipc/peer/a, "%s should not be null in the bundle, it happened because some bad upgrade had happened.", new Object[] {
                d
            });
        } else
        {
            bundle = bundle.iterator();
            while (bundle.hasNext()) 
            {
                String s = (String)bundle.next();
                c.add(s);
            }
        }
    }
}
