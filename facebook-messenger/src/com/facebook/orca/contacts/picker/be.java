// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.contacts.picker.a;
import com.facebook.contacts.picker.l;
import com.facebook.debug.log.b;
import com.facebook.orca.g.z;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.v;
import com.facebook.widget.a.i;
import com.google.common.a.es;
import com.google.common.a.et;

public class be extends a
{

    private static final Class b = com/facebook/orca/contacts/picker/be;
    private final javax.inject.a c;

    public be(javax.inject.a a1)
    {
        c = a1;
    }

    protected i b(CharSequence charsequence)
    {
        Object obj;
        z z1;
        i j;
        if (charsequence != null)
        {
            obj = charsequence.toString().trim();
        } else
        {
            obj = "";
        }
        com.facebook.debug.log.b.b(b, (new StringBuilder()).append("starting filtering, constraint=").append(((String) (obj))).toString());
        j = new i();
        if (((String) (obj)).length() == 0)
        {
            j.a = l.a(charsequence);
            j.b = -1;
            return j;
        }
        if (((String) (obj)).length() < 3)
        {
            j.a = l.a(charsequence, es.d());
            j.b = 0;
            return j;
        }
        z1 = (z)c.b();
        z1.a(((String) (obj)));
        obj = es.e();
        int k = 0;
_L2:
        Object obj1 = z1.a();
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = ((v) (obj1)).z();
        if (((ThreadSummary) (obj1)).j().size() < 3) goto _L2; else goto _L1
_L1:
        com.facebook.debug.log.b.a(b, (new StringBuilder()).append("adding group summary: ").append(obj1).toString());
        ((et) (obj)).b(a.a(obj1));
        int i1;
        i1 = k + 1;
        k = i1;
        if (i1 < 6) goto _L2; else goto _L3
_L3:
        obj = ((et) (obj)).b();
        j.b = ((es) (obj)).size();
        j.a = l.a(charsequence, ((es) (obj)));
        com.facebook.debug.log.b.b(b, (new StringBuilder()).append("got thread summaries: ").append(((es) (obj)).size()).toString());
        if (z1 != null)
        {
            z1.b();
        }
        return j;
        Exception exception;
        exception;
        com.facebook.debug.log.b.d(b, "exception with filtering groups", exception);
        j.b = 0;
        j.a = l.b(charsequence);
        if (z1 != null)
        {
            z1.b();
        }
        return j;
        charsequence;
        if (z1 != null)
        {
            z1.b();
        }
        throw charsequence;
    }

}
