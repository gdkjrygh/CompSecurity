// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.messages.model.threads.Message;
import com.facebook.orca.notify.av;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.google.common.a.es;
import com.google.common.a.gb;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.f:
//            r, ad, w

class v
    implements Runnable
{

    final String a;
    final String b;
    final r c;

    v(r r1, String s, String s1)
    {
        c = r1;
        a = s;
        b = s1;
        super();
    }

    public void run()
    {
        Object obj;
        if (!com.facebook.orca.f.r.a(c).contains(a))
        {
            return;
        }
        obj = r.c(c).b((FolderName)r.b(c).b(), b);
        if (obj == null)
        {
            obj = es.d();
        } else
        {
            obj = ((MessagesCollection) (obj)).b();
        }
        obj = (Message)gb.a(((Iterable) (obj)), new w(this), null);
        if (obj != null) goto _L2; else goto _L1
_L1:
        com.facebook.orca.f.r.a(c).remove(a);
        return;
_L2:
        if (((Message) (obj)).u() == 901)
        {
            r.d(c).a(b);
        } else
        if (((Message) (obj)).u() == 0)
        {
            c.a(b);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
