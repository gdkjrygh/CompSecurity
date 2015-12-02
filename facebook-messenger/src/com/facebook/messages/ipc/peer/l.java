// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.u.c;
import com.facebook.common.u.d;
import com.facebook.common.u.i;
import com.facebook.i.a.a.b;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.kl;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.messages.ipc.peer:
//            d

public class l extends b
{

    private final Map b = ik.a();
    private final c c = new c();

    public l(int j)
    {
        super(d.o, j);
        c.a("peer://msg_notification_unread_count/clear_thread/{thread_id}", Integer.valueOf(0));
        c.a("peer://msg_notification_unread_count/thread/{thread_id}", Integer.valueOf(1));
    }

    public void a()
    {
        b.clear();
    }

    public void a(Uri uri, com.facebook.i.a.a.d d1)
    {
        try
        {
            uri = c.a(uri.toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return;
        }
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (1 != ((Integer)((i) (uri)).a).intValue())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        uri = ((i) (uri)).b.getString("thread_id");
        uri = (Set)b.get(uri);
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (d1.a == null)
        {
            d1.a = kl.a();
        }
        ((Set)d1.a).addAll(uri);
    }

    public void a(Bundle bundle)
    {
        Bundle bundle1 = new Bundle();
        java.util.Map.Entry entry;
        for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); bundle1.putStringArrayList((String)entry.getKey(), hq.a((Iterable)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        bundle.putBundle(c().getAuthority(), bundle1);
    }

    public boolean a(Uri uri, Object obj)
    {
        if (!d.p.equals(uri)) goto _L2; else goto _L1
_L1:
        if (!b.isEmpty()) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        b.clear();
        return true;
_L2:
        try
        {
            uri = c.a(uri.toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return false;
        }
        if (uri == null) goto _L3; else goto _L5
_L5:
        ((Integer)((i) (uri)).a).intValue();
        JVM INSTR tableswitch 0 1: default 181
    //                   0 84
    //                   1 113;
           goto _L6 _L7 _L8
_L7:
        uri = ((i) (uri)).b.getString("thread_id");
          goto _L9
_L8:
        s = ((i) (uri)).b.getString("thread_id");
        s1 = String.valueOf(obj);
        obj = (Set)b.get(s);
        uri = ((Uri) (obj));
        if (obj != null) goto _L11; else goto _L10
_L10:
        uri = kl.a();
        b.put(s, uri);
_L11:
        flag = uri.add(s1);
        return flag;
_L6:
        return false;
_L9:
        String s;
        String s1;
        boolean flag;
        if (b.remove(uri) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public void b(Bundle bundle)
    {
        b.clear();
        bundle = bundle.getBundle(c().getAuthority());
        String s;
        java.util.ArrayList arraylist;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); b.put(s, kl.a(arraylist)))
        {
            s = (String)iterator.next();
            arraylist = bundle.getStringArrayList(s);
        }

    }
}
