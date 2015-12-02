// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.facebook.user.UserIdentifierKey;
import com.facebook.widget.a.i;
import com.google.common.a.es;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.contacts.picker:
//            u, l, w, v

public abstract class a extends com.facebook.widget.a.a
    implements u
{

    protected v a;
    private w b;
    private Set c;

    public a()
    {
    }

    public void a(v v)
    {
        a = v;
    }

    public void a(w w1)
    {
        b = w1;
        c = kl.a();
    }

    public void a(es es1)
    {
        c.clear();
        if (es1 != null)
        {
            UserIdentifierKey useridentifierkey;
            for (es1 = es1.iterator(); es1.hasNext(); c.add(useridentifierkey))
            {
                useridentifierkey = (UserIdentifierKey)es1.next();
            }

        }
    }

    protected void a(CharSequence charsequence, i j)
    {
        Preconditions.checkNotNull(j);
        Preconditions.checkNotNull(j.a);
        j = (l)j.a;
        b.a(charsequence, j);
    }

    protected boolean a(UserIdentifierKey useridentifierkey)
    {
        if (c == null)
        {
            return false;
        } else
        {
            return c.contains(useridentifierkey);
        }
    }
}
