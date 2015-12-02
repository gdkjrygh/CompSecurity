// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.contacts.picker.a;
import com.facebook.contacts.picker.l;
import com.facebook.contacts.picker.v;
import com.facebook.debug.log.b;
import com.facebook.http.protocol.aq;
import com.facebook.orca.server.FetchGroupThreadsParams;
import com.facebook.orca.server.FetchGroupThreadsResult;
import com.facebook.orca.server.j;
import com.facebook.orca.server.k;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.widget.a.i;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;

public class bf extends a
{

    private static final Class b = com/facebook/orca/contacts/picker/bf;
    private final aq c;
    private final com.facebook.orca.protocol.methods.i d;

    public bf(aq aq1, com.facebook.orca.protocol.methods.i i1)
    {
        c = aq1;
        d = i1;
    }

    protected i b(CharSequence charsequence)
    {
        int j1 = 0;
        com.facebook.debug.log.b.b(b, (new StringBuilder()).append("starting filtering, constraint=").append(charsequence).toString());
        Object obj;
        i i1;
        if (charsequence != null)
        {
            obj = charsequence.toString().trim();
        } else
        {
            obj = "";
        }
        i1 = new i();
        if (((String) (obj)).length() == 0)
        {
            i1.a = l.a(charsequence);
            i1.b = -1;
            return i1;
        }
        if (((String) (obj)).length() < 3)
        {
            i1.a = l.a(charsequence, es.d());
            i1.b = 0;
            return i1;
        }
        obj = FetchGroupThreadsParams.newBuilder().a(j.QUERY).a(((String) (obj))).a(12).d();
        Object obj1;
        try
        {
            obj1 = (FetchGroupThreadsResult)c.a(d, obj);
        }
        catch (Exception exception)
        {
            com.facebook.debug.log.b.d(b, "exception with filtering groups", exception);
            i1.b = 0;
            i1.a = l.b(charsequence);
            return i1;
        }
        obj = es.e();
        com.facebook.debug.log.b.b(b, (new StringBuilder()).append("got thread summaries: ").append(((FetchGroupThreadsResult) (obj1)).a().e()).toString());
        obj1 = ((FetchGroupThreadsResult) (obj1)).a().b().iterator();
label0:
        do
        {
            ThreadSummary threadsummary;
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break label0;
                }
                threadsummary = (ThreadSummary)((Iterator) (obj1)).next();
            } while (threadsummary.h());
            com.facebook.debug.log.b.a(b, (new StringBuilder()).append("adding group summary: ").append(threadsummary).toString());
            ((et) (obj)).b(a.a(threadsummary));
            j1++;
        } while (j1 < 6);
        obj = ((et) (obj)).b();
        i1.b = ((es) (obj)).size();
        i1.a = l.a(charsequence, ((es) (obj)));
        return i1;
    }

}
